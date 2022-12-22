import java.awt.*;
public class FreeBody {
	private static double Gconstant = 0.01;
	private double[] position;
	private double[] velocity;
	private double mass;
  private Color color;
	public FreeBody() {
		this(new double[] {0.0,0.0}, new double[] {0.0,0.0},10);
	}
	public FreeBody(double[] position) {
			this(position, new double[] {0.0,0.0},10);
		}
	public FreeBody(double[] position, double[] velocity) {
		this(position, velocity,10);
	}
	public FreeBody(double[] position, double[] velocity, double mass) {
		setPosition(position);
		setVelocity(velocity);
		setMass(mass);
		
	}
  public void setColor(Color color){
    this.color = color;
  }
	public double getMass() {
		return mass;
	}
	public double[] getPosition() {
		return position;
	}
	public double[] getVelocity() {
		return velocity;
	}
	public void setMass(double mass) {
		this.mass = mass;
	}
	public void setPosition(double[] position) {
		this.position = position;
	}
	public void setVelocity(double[] velocity) {
		this.velocity = velocity;
	}
  public boolean equals(FreeBody b){
    return (b.getPosition()[0] == getPosition()[0] && b.getPosition()[1] == getPosition()[1] && b.getVelocity()[0] == getVelocity()[0] && b.getVelocity()[1] == getVelocity()[1]);
  }
public void draw(Graphics2D window) {
  int radius = (int) Math.max(Math.log(mass),1);
  window.setColor(color);
  window.fillArc((int) position[0]-radius, (int) position[1] - radius, 2 * radius, 2 * radius, 0, 360);
}
public void move() {
	position[0] += velocity[0];
    position[1] += velocity[1];
}
  public boolean[] update(FreeBody[] otherFrees, StaticBody[] otherStatics){
	  boolean[] remove = new boolean[otherFrees.length];
	
    for (int i = 0; i < otherFrees.length; i ++){
      FreeBody b = otherFrees[i];
      if (!b.equals(this)){
        double dX =(b.getPosition()[0] - getPosition()[0]);
        double dY =(b.getPosition()[1] - getPosition()[1]);
        double dSquared = dX * dX + 
          dY * dY;
        if (Math.sqrt(dSquared) <= (int) 2 * Math.max(Math.log(mass),1)) {
        	velocity[0] += (b.getMass() / (getMass() + b.getMass() )) * b.getVelocity()[0];
        	velocity[1]+= (b.getMass() / (getMass() + b.getMass() )) * b.getVelocity()[1];
        	if (b.getMass() > getMass()) continue;
        	setMass(getMass() + b.getMass());
        	remove[i] = true;
        	if (getMass() > 10000) setColor(Color.yellow);
        	continue;
        }
        else if ((b.getPosition()[0] < 0 || b.getPosition()[0] > 800) || b.getPosition()[1] < 0 || b.getPosition()[1] > 600) {
        	remove[i] = true;
        	
        	continue;
        }
        remove[i] = false;
        double forceGravity = b.getMass() * getMass() / (dSquared);
      
        double xForce = Math.min(forceGravity * dX / Math.sqrt(dSquared),30 * getMass() / Gconstant);
        double yForce = Math.min( forceGravity  * dY / Math.sqrt(dSquared),30 * getMass() / Gconstant);
        velocity[0] += Gconstant * xForce / getMass();
        velocity[1] += Gconstant * yForce / getMass();
      }
    }

    
    return remove;
  }
  
}
