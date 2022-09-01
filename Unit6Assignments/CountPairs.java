package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 08/23/2022
//Class - APCSA


import static java.lang.System.*;

public class CountPairs
{
	public static int pairCounter( String str )
	{ 
		int count = 0;
		for (int i = 1; i < str.length();i ++) {
			if (str.substring(i-1,i).equals(str.substring(i,i+1))) {
				count += 1;
			}
		}
		return count;
	}
}