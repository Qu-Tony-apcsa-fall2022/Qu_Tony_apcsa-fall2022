package Unit9;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 9/23/2022
import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddindex = -1;
		int evenindex = -1;
		for (int i = 0; i < ray.size(); i ++) {
			if (ray.get(i) % 2 == 1 && (oddindex == -1)) {
				oddindex = i;
			}
			if (ray.get(i) % 2== 0 && (oddindex > -1)) {
				evenindex = i;
			}
		}
		return evenindex > -1 ? evenindex - oddindex: -1;
	}
}