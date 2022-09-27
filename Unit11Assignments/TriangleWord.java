package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import java.util.Scanner;
import static java.lang.System.*;

public class TriangleWord
{
	//instance variables and constructors could be present, but are not necessary
		
	public static String printTriangle(String word)
	{
		String add = "";
		String subword = "";
		for(int i = 0; i < word.length(); i ++) {
			subword += word.charAt(i);
			for (int j = 0; j <= i; j ++) {
				add += subword;
			}
			add += "\n";
					
		}
		return add;
		
	}
}