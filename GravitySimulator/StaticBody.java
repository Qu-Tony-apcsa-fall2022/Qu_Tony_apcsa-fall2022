import java.awt.*;
public abstract class StaticBody {
  private double[] position;
  private double mass;

  public StaticBody() {
    this(new double[] { 0.0, 0.0 }, 10);
  }

  public StaticBody(double[] position) {
    this(position, 10);
  }

  public StaticBody(double[] position, double mass) {
    setPosition(position);
    setMass(mass);
  }

  public void setPosition(double[] position) {
    this.position = position;
  }

  public void setMass(double mass) {
    this.mass = mass;
  }

  public double getMass() {
    return mass;
  }

  public double[] getPosition() {
    return position;
  }

  public abstract void draw(Graphics window);
}