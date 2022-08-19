package Unit3;
//(c) A+ Computer Science 
//www.apluscompsci.com

//Name - Tony Qu
//Date - 8/19/22
//Class - APCSA
//Lab  - Distance

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;


	public Distance(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1,y1,x2,y2);
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		xTwo = x2;
		yTwo = y2;
	}	

	public void calcDistance()
	{
		distance = getDistance();
	}
	
	public double getDistance()
	{
		return Math.sqrt((float)((yOne-yTwo) * (yOne-yTwo)) + ((xOne-xTwo) * (xOne-xTwo)));
	}
	

	
	//complete print or the toString

	public String toString()
	{
		return "distance == " + (Math.floor(1000* distance)/1000);
	}
}