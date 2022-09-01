package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 08/23/2022
//Class - APCSA
import static java.lang.System.*;
import java.util.Scanner;
public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases	
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter a word :: ");
		Word worder = new Word(keyboard.next());
		out.print(worder.toString());
	}
}