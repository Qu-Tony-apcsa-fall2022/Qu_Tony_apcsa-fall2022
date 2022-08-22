package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 08/22/2022
//Class - APCSA
//Lab  - WordsCompare

import static java.lang.System.*;

public class WordsCompare
{
	private String wordOne, wordTwo;
	private String alphabet = "abcdefjhijklmnopqrstuvwxyz";
	private int compare;

	public WordsCompare() {
	   
   }
	public WordsCompare(String one, String two)
	{
		setWords(one,two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two.substring(0,two.length());
	}

	public void comparewords()
	{
		boolean onebigger = wordOne.length() > wordTwo.length();
		for (int i = 0; i < (onebigger? wordTwo.length(): wordOne.length()); i ++) {
			var onepos = alphabet.indexOf(wordOne.substring(i,i+1));
			var twopos = alphabet.indexOf(wordTwo.substring(i,i+1));
			if (onepos > twopos) {
				compare = 1;
				return;
			}
			else if (twopos > onepos) {
				compare = -1;
				return;
			}
		}
		compare = onebigger ? 1: -1;
	}

	public String toString()
	{
		comparewords();
		if(compare<0)
		{
			return wordOne + " should be placed before " + wordTwo + "\n";
		}
		else
		{
			return wordOne + " should be placed after " + wordTwo + "\n";
		}
	}
}