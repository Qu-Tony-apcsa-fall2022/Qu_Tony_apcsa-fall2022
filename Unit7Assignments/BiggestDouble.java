package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Tony Qu

import static java.lang.System.*;

public class BiggestDouble
{
	private double one,two,three,four;

	public BiggestDouble()
	{
		this(0,0,0,0);
	}

	public BiggestDouble(double a, double b, double c, double d)
	{
		setDoubles(a,b,c,d);
	}

	public void setDoubles(double a, double b, double c, double d)
	{
		one = a;
		two = b;
		three = c;
		four = d;
	}

	public double getBiggest()
	{
		double[] choices = {one,two,three,four};
		double max = 0;
		for(int i = 0; i < 4; i ++) {
			if(choices[i] > max) {
				max = choices[i];
			}
		}
		return max;
	}

	public String toString()
	{
	   return one + " " + two + " " + three + " " + four + "\n";
	}
}