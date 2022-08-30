package Unit8;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 8/30/2022

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstOdd = ray.length;;
		int firstEven = ray.length;
		for (int i = 0; i < ray.length; i ++) {
			if (i < firstOdd) {
				if (ray[i] % 2 == 1) {
					firstOdd = i;
				}
			}
			if (i < firstEven && i > firstOdd) {
				if (ray[i] % 2 == 0) {
					firstEven = i;
				}
			}
			
		}
		return Math.max(firstOdd, firstEven) == ray.length ? -1 : firstEven- firstOdd;
	}
}