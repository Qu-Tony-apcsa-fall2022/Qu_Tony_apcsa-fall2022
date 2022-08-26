package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Tony Qu

import static java.lang.System.*;
import java.util.Scanner;
public class DoubleRunner
{
	public static void main(String[] args)
	{
		BiggestDouble run = new BiggestDouble(4.5,6.7,7.8,9.0);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");

		//add more test cases
		Scanner keyboard = new Scanner(System.in);
		out.println("Enter line of doubles :: ");
		String data = keyboard.nextLine();
		String[] data_list = data.split(" ");
		double[] double_list = new double[4];
		for (int i = 0; i < 4; i ++) {
			double_list[i] = Double.parseDouble(data_list[i]);
		}
		run.setDoubles(double_list[0],double_list[1],double_list[2],double_list[3]);
		System.out.println(run);
		System.out.println("biggest = " + run.getBiggest() + "\n");
	}
}