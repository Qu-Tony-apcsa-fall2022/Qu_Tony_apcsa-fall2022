package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 08/23/2022
//Class - APCSA
import static java.lang.System.*;
import java.util.Scanner;
public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		Scanner keyboard = new Scanner(System.in);
		out.print("Enter line :: ");
		String x = keyboard.nextLine();
		LetterRemover lr = new LetterRemover(x);
		out.print(lr);
		
	}
}