package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
	}

	public void sort()
	{
		for (int i = 0; i < wordRay.length-1; i ++) {
			for (int j = i+1; j < wordRay.length; j ++) {
				if (alphabeticallybelow(wordRay[j],wordRay[i])) {
					String save = wordRay[j];
					wordRay[j] = wordRay[i];
					wordRay[i] = save;
				}
			}
		}
	}
	public boolean alphabeticallybelow(String word1,String word2) {
		int i = 0;
		while (true) {
			if (i >= word1.length()) {
				return true;
			}
			else if (i >= word2.length()) {
				return false;
			}
			else if (word1.charAt(i) < word2.charAt(i)) {
				return true;
			}
			else if (word1.charAt(i) > word2.charAt(i)) {
				return false;
			}
			i++;
		}
	}
	public String toString()
	{
		sort();
		String returnee = "";
		for (int i = 0; i < wordRay.length; i ++) {
			returnee += wordRay[i] + "\n";
		}
		return returnee+"\n\n";
	}
}