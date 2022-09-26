package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 9/23/2022
import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		int sum = 1 << 31;
		for (int i = 1; i < ray.size(); i ++) {
			if (ray.get(i) > ray.get(0)) {
				sum += ray.get(i);
			}
		}
		return sum == 1 << 31 ? -1 : sum - (1 << 31);
	}
}