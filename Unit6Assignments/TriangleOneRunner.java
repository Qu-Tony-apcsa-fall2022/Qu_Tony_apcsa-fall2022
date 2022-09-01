package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 08/23/2022
//Class - APCSA
import static java.lang.System.*;
import java.util.Scanner;
public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		Scanner keyboard = new Scanner(System.in);
		TriangleOne creator = new TriangleOne();
		out.print("Enter a word :: ");
		creator.setWord(keyboard.next());
		out.print(creator);
	}
}