package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 08/23/2022
//Class - APCSA
import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
	}
	public LetterRemover(String s) {
		String[] splitted = s.split(" ");
		
		setRemover(s,splitted[splitted.length-1]);
	}
	//add in second constructor
	
	
	public void setRemover(String s, String rem)
	{
		sentence = s;
		lookFor = rem.charAt(0);
	}

	public String removeLetters()
	{
		String cleaned="";
		for (int i = 0; i < sentence.length(); i ++) {
			String c = sentence.charAt(i) + "";
			String c2 = sentence.charAt(i+1) + "";
			if (c2.equals("-")) {
				break;
			}
			if (!(c.equals(lookFor + ""))) {
				cleaned += c;
			}
			
		}
		return cleaned;
	}

	public String toString()
	{
		return removeLetters();
	}
}