package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 08/22/2022
//Class - APCSA
//Lab  - StringOddorEven

import static java.lang.System.*;
import java.util.Scanner;

public class StringOddOrEven
{
	private String word;

	public StringOddOrEven(String s)
	{
		setString(s);
	}


	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		return word.length() % 2 == 0;
	}

 	public String toString()
 	{
 		String output= word + " is " + (isEven() ? "even.": "odd.");
 		return output;
	}
}