package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Tony Qu
import static java.lang.System.*;
import java.util.Scanner;
public class TriangleFiveRunner
{
   public static void main(String args[])
   {
	   Scanner keyboard = new Scanner(System.in);
	   int letters;
	   
	   out.print("Enter how many letters, then Enter letters and number separated by space on each line ::  :: ");
	   letters = Integer.parseInt(keyboard.nextLine());
	   String[] inputs = new String[letters];
	
	   for (int i = 0 ; i < letters ; i ++) {
		   inputs[i] = keyboard.nextLine();
		   
	   }
	   TriangleFive creator = new TriangleFive(inputs);
	   out.print(creator);
	}
}