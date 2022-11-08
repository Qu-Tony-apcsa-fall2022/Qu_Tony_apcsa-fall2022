package Unit15;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

class SpeedUpBall extends BlinkyBall
{

   //instance variables

   public SpeedUpBall()
   {
	   super();

   }

   public SpeedUpBall(int x, int y)
   {
	   super(x,y);

   }


   public SpeedUpBall(int x, int y, int wid, int ht, int xSpd, int ySpd)
   {
	   super(x,y,wid,ht,xSpd,ySpd);

   }


   public SpeedUpBall(int x, int y, int wid, int ht, Color col, int xSpd, int ySpd)
   {

	   super(x,y,wid,ht,col,xSpd,ySpd);


   }

  public void setXSpeed(int xS) {
	  if (xS > 0) {
		  super.setXSpeed(xS+1);
	  }
	  else {
		  super.setXSpeed(xS-1);
	  }
  }
  public void setYSpeed(int yS) {
	  if (yS > 0) {
		  super.setYSpeed(yS+1);
	  }
	  else {
		  super.setYSpeed(yS-1);
	  }
  }
}

