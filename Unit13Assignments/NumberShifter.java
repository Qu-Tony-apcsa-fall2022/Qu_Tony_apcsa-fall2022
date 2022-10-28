package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.lang.Math;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifter
{
	public static int[] makeLucky7Array( int size)
	{
		int[] x = new int[size];
		for (int i = 0; i < size; i ++) {
			x[i] = (int)(10 * Math.random()) + 1;
		}
		System.out.println(Arrays.toString(x));
		shiftEm(x);
		return x;
	}
	public static void shiftEm(int[] array)
	{
		for (int i = 0; i < array.length-1; i ++) {
			for (int j = i+1; j < array.length; j ++) {
				if (array[j] == 7 && array[i] != 7) {
					int save = array[j];
					array[j] = array[i];
					array[i] = save;
				}
			}
		}

	}
}