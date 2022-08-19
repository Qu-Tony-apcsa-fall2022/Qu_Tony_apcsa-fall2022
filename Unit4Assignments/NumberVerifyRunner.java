package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 8/19/22
//Class - APCSA
//Lab  - NumberVerifyRunner

import static java.lang.System.*;
import java.util.Scanner;

public class NumberVerifyRunner
{
	public static void main ( String[] args )
	{
		//add in input
		Scanner keyboard = new Scanner(in);
		
		for (int i = 0; i < 5; i ++) {
			System.out.print("Enter a whole number :: ");
			var x = keyboard.nextInt();
			
			System.out.println(x + " is odd :: " + NumberVerify.isOdd(x));
			System.out.println(x + " is even :: " + NumberVerify.isEven(x));
		}
		
		
		//add in more test cases
	}
}