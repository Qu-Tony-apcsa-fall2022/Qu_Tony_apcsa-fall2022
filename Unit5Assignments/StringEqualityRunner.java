package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 08/22/2022
//Class - APCSA
//Lab  - StringEqualityRunner

import static java.lang.System.*;
import java.util.Scanner;

public class StringEqualityRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Scanner keyboard = new Scanner(System.in);
		StringEquality equal = new StringEquality();
		out.print("Enter two words :: ");
		equal.setWords(keyboard.next(), keyboard.next());
		out.println(equal.toString());
		out.print("Enter two words :: ");
		equal.setWords(keyboard.next(), keyboard.next());
		out.println(equal.toString());
		out.print("Enter two words :: ");
		equal.setWords(keyboard.next(), keyboard.next());
		out.println(equal.toString());
		
		
	}
}