//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.net.URL;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import javax.imageio.ImageIO;

public class Alien extends MovingThing
{
	private int speed;
	private Image image;
	private String direction;

	public Alien()
	{
		this(0,0,30,30,0,"right");
	}
	
	public Alien(int x, int y)
	{
		this(x,y,30,30,0,"right");
	}

	public Alien(int x, int y, int s)
	{
		this(x,y,30,30,s,"right");
	}

	public Alien(int x, int y, int w, int h, int s,String dir)
	{
		super(x, y, w,h);
		speed=s;
		direction = dir;
		try
		{
			URL url = getClass().getResource("/alien.jpg");
			image = ImageIO.read(url);
		}
		catch(Exception e)
		{
			System.out.println("error reading alien image");
		}
	}

	public void setSpeed(int s)
	{
	   speed = s;
	}
	public String getDirection() {
		return direction;
	}
	public void setDirection(String dir) {
		direction = dir;
	}
	public int getSpeed()
	{
	   return speed;
	}

	public void move(String direction)
	{
		if (direction == "right") {
			setX(getX() + speed);
		}
		else if (direction == "left") {
			setX(getX() - speed);
		}
		else if (direction == "up") {
			setY(getY() - speed);
		}
		else if (direction == "down") {
			setY(getY() + speed);
		}
	}

	public void draw( Graphics window )
	{
   	window.drawImage(image,getX(),getY(),getWidth(),getHeight(),null);
	}

	public String toString()
	{
		return "";
	}
}
