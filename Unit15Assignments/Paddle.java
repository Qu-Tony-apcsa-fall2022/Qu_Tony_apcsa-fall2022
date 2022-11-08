package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.awt.Color;
import java.awt.Graphics;

public class Paddle extends Block
{
   //instance variables
   private int speed;

   public Paddle()
   {
      super(10,10);
      speed =5;
   }
   public Paddle(int x, int y) {
	   super (x,y);
	   speed = 5;
   }
   public Paddle(int x, int y, int ispeed) {
	   super (x,y);
	   speed = ispeed;
   }
   public Paddle(int x, int y, int width, int height) {
	   super (x,y, width, height);
	   speed = 5;
   }
   public Paddle(int x, int y, int width, int height, int ispeed) {
	   super (x,y, width, height);
	   speed = ispeed;
   }
   public Paddle(int x, int y, int width, int height, Color color, int speed1) {
	   super (x,y,width,height,color);
	   speed = speed1;
   }

   public void moveUpAndDraw(Graphics window)
   {
	   draw(window, new Color(255,255,255));
	   setY(getY() - speed);

	   draw(window);
   }

   public void moveDownAndDraw(Graphics window)
   {
	   draw(window, new Color(255,255,255));
	   setY(getY() + speed);
	   draw(window);

   }
   public int getSpeed() {
	   return speed;
   }

   
   public String toString() {
	   return super.toString() + " " + speed;
   }
}