package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import static java.lang.System.*;

public class Recursion234Runner
{
	public static void main(String args[])
	{
		System.out.println("Fun one :: \n");
		System.out.println(RecursionFunOne.countOddDigits(4532));
		System.out.println(RecursionFunOne.countOddDigits(11145322));
		System.out.println(RecursionFunOne.countOddDigits(224532714	));
		System.out.println(RecursionFunOne.countOddDigits(2468	));
		System.out.println(RecursionFunOne.countOddDigits(13579	));

		//add more test cases
		System.out.println("\nFun three :: \n");
		System.out.println(RecursionFunThree.luckyThrees(3));
		System.out.println(RecursionFunThree.luckyThrees(31332));
		System.out.println(RecursionFunThree.luckyThrees(134523));
		System.out.println(RecursionFunThree.luckyThrees(3113));
		System.out.println(RecursionFunThree.luckyThrees(13331	));
		System.out.println(RecursionFunThree.luckyThrees(777337777));

	}
}