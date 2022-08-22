package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 08/22/2022
//Class - APCSA
//Lab  - WordsCompareRunner

import static java.lang.System.*;
import java.util.Scanner;
public class WordsCompareRunner
{
   public static void main( String args[] )
   {
		//add test cases
	   Scanner keyboard = new Scanner(System.in);
	   WordsCompare comparer = new WordsCompare();
	   System.out.print("Enter two words :: ");
	   comparer.setWords(keyboard.next(),keyboard.next());
	   System.out.print(comparer.toString());
	   System.out.print("Enter two words :: ");
	   comparer.setWords(keyboard.next(),keyboard.next());
	   System.out.print(comparer.toString());
	   System.out.print("Enter two words :: ");
	   comparer.setWords(keyboard.next(),keyboard.next());
	   System.out.print(comparer.toString());
	   System.out.print("Enter two words :: ");
	   comparer.setWords(keyboard.next(),keyboard.next());
	   System.out.print(comparer.toString());
	   System.out.print("Enter two words :: ");
	   comparer.setWords(keyboard.next(),keyboard.next());
	   System.out.print(comparer.toString());
	   System.out.print("Enter two words :: ");
	   comparer.setWords(keyboard.next(),keyboard.next());
	   System.out.print(comparer.toString());

	   
	   
	}
}