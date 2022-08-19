package Unit3;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 8/19/22
//Class - APCSA
//Lab  - DistanceRunner

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		Scanner keyboard = new Scanner(in);
		int x1,y1,x2,y2;
		System.out.println("Enter X1 :: ");
		x1 = keyboard.nextInt();
		System.out.println("Enter Y1 :: ");
		y1 = keyboard.nextInt();
		System.out.println("Enter X2 :: ");
		x2 = keyboard.nextInt();
		System.out.println("Enter Y2 :: ");
		y2 = keyboard.nextInt();
		Distance test = new Distance(x1,y1,x2,y2);
		test.calcDistance();
		System.out.println(test.toString());
			
	}
}