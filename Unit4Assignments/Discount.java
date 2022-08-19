package Unit4;
//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu
//Date - 8/19/22
//Class - APCSA
//Lab  - Discount

import static java.lang.System.*;
import java.util.Scanner;

public class Discount
{
	//instance variables and constructors could be used, but are not really needed
	
	//getDiscountedBill() will return final amount of the bill
	//			if the bill is >2000, the bill receives a 15% discount
	public static double getDiscountedBill(double bill)
	{
		return Math.floor(1000 * (bill > 2000 ? 0.85 * bill : bill))/1000;
	}

}