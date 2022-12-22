import java.awt.*;

public class StaticRectangle extends StaticBody {
  private double[] dimensions;
  public StaticRectangle(){
    super();
    setDimensions(new double[]{10,10});
  }
  public StaticRectangle(double[] position, double[] dimensions, double mass){
    super(position, mass);
    setDimensions(dimensions);
  }
  public void setDimensions(double[] dimensions){
    this.dimensions = dimensions;
  }
  public double[] getDimensions(){
    return dimensions;
  }
  public void draw(Graphics window) {
    double[] position =  getPosition();
    window.drawRect((int) position[0] - ((int) dimensions[0]/2), 
                    (int) position[1]-((int) dimensions[1]/2), 
                    (int) dimensions[0], 
                    (int) dimensions[1]);
  }
}