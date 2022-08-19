package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 8/19/22
//Class - APCSA
//Lab  - DiscountRunner

import static java.lang.System.*;
import java.util.Scanner;

public class DiscountRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter the original bill amount :: ");
		double amt = keyboard.nextDouble();
		Discount d = new Discount();
		System.out.print("Bill after discount :: ");
		System.out.println(d.getDiscountedBill(amt));

	}
}