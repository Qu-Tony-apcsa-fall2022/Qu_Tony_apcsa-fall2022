package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Tony Qu
import static java.lang.System.*;
import java.util.Scanner;
public class TriplesRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   out.print("Enter a maximum number :: ");
	   Triples gen = new Triples(keyboard.nextInt()+1);
	   out.print(gen);
	}
}