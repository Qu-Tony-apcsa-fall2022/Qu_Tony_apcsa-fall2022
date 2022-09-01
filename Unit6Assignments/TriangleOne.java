package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 08/23/2022
//Class - APCSA
import static java.lang.System.*;

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		word="";
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public String toString()
	{
		String finl = "";
		for (int i = 0; i < word.length(); i ++) {
			finl += word.substring(0,word.length()-i) + "\n";
		}
		return finl;
	}
}