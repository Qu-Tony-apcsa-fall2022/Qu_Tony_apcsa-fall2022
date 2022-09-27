package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStoreRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a list of toys: ");
		String[] inp = keyboard.nextLine().split(" ");
		ToyStore store = new ToyStore(inp);
		System.out.println("store == " + store);
		System.out.println("max == " + store.getMostFrequentToy());
		store.sortToysByCount();
		System.out.println("sorted store == " + store);
	}
}