package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 08/22/2022
//Class - APCSA
//Lab  - StringRunner

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a word :: ");
		StringOddOrEven calculator = new StringOddOrEven(keyboard.next());
		System.out.println(calculator.toString());
		System.out.print("Enter a word :: ");
		calculator.setString(keyboard.next());
		System.out.println(calculator.toString());
		System.out.print("Enter a word :: ");
		calculator.setString(keyboard.next());
		System.out.println(calculator.toString());
		System.out.print("Enter a word :: ");
		calculator.setString(keyboard.next());
		System.out.println(calculator.toString());
		System.out.print("Enter a word :: ");
		calculator.setString(keyboard.next());
		System.out.println(calculator.toString());
		System.out.print("Enter a word :: ");
		calculator.setString(keyboard.next());
		System.out.println(calculator.toString());
		System.out.print("Enter a word :: ");
		calculator.setString(keyboard.next());
		System.out.println(calculator.toString());
	}
}