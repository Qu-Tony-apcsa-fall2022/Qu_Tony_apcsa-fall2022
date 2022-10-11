package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		return num == 0 ? 0 : (1- num %2) + countOddDigits(num / 10);
	}
}