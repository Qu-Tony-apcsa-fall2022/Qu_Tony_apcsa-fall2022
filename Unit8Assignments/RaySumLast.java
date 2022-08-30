package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 8/30/2022

public class RaySumLast
{
	public static int go(int[] ray)
	{
		int sum = 0;

		for(int i = ray.length-1 ; i >-1; i --) {
			
			if (ray[i] > ray[ray.length-1]) {
			
				sum += ray[i];
			}
		}
		return sum > 0 ? sum : -1;
	}
}