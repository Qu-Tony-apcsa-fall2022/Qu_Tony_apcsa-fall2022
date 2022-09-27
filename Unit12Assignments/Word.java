package Unit12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import static java.lang.Math.*;
import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
	  
	  if ( rhs.getSize() == word.length()) {
		for (int i = 0; i < min(rhs.getSize(), word.length()); i ++) {
			if (rhs.getWord().charAt(i) > word.charAt(i)) {
				return 1;
			}
			else if (rhs.getWord().charAt(i) < word.charAt(i)){
				return -1;
			}
		}
	  }
		return rhs.getSize() == word.length() ? 0 : rhs.getSize() < word.length() ? -1 : 1;
	}
	public int getSize() {
		return word.length();
	}
	public String getWord() {
		return word;
	}
	public String toString()
	{
		return word;
	}
}