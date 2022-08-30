package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 8/30/2022

public class RayDown
{
	//go() will return true if all numbers in numArray
	//are in decreasing order [31,12,6,2,1]
	public static boolean go(String numArray)
	{
		String[] split = numArray.split(" ");
		int[] integers = new int[split.length];
		for (int i = 0; i < split.length; i ++) {
			integers[i] = Integer.parseInt(split[i]);
		}
		for (int i = 1; i < split.length; i ++) {
			if (integers[i-1] < integers[i]) {
				return false;
			}
		}
		return true;
	}	
}