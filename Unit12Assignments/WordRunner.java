package Unit12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import java.io.File; 
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class WordRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("words.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		String[] inp = new String[size];
		for (int i = 0; i < size; i ++) {
			inp[i] = file.nextLine();
		}
		
		Word[] words = new Word[size];
		for (int i = 0; i < size; i ++) {
			words[i] = new Word(inp[i]);
		}
		for (int i = 0; i < size-1; i ++) {
			for (int j = i+1; j < size; j ++) {
				int result = words[i].compareTo(words[j]);
				if (result < 0) {
					Word save = words[i];
					words[i] = words[j];
					words[j] = save;
				}
			}
		}
		System.out.println("Sorted: " + Arrays.toString(words));
		
		
		











	}
}