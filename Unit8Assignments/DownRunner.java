package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 8/30/2022
import java.util.Scanner;
public class DownRunner
{
	public static void main( String args[] )
	{					
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter a line of numbers separated by spaces :: ");
		String next = keyboard.nextLine();
	
		System.out.println(RayDown.go(next));
	}
}