package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWordRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		do {System.out.print("Enter a word :: ");
		System.out.println(TriangleWord.printTriangle(keyboard.next()));
		System.out.print("\nDo you want to enter more sample input ? ");
		} while (keyboard.next().equals("y"));
	}
}