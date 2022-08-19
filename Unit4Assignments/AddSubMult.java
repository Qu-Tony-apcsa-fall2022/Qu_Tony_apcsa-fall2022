package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import static java.lang.System.*; 
import java.util.Scanner;

public class AddSubMult
{
	public static double check( double a, double b )
	{
		return Math.floor(1000 *  (a > b ? a - b: a == b ? a * b : b - a)) / 1000;
	}
}