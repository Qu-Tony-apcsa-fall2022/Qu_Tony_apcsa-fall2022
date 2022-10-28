package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.util.Arrays; 
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSorter
{
	//instance variables and other methods not shown



	public static int[] getSortedDigitArray(int number)
	{
		
		int c = number;
		int count = 1;
		while ((c/=10) > 0)  count++;
		int[] list = new int[count];
		count = 0;

		while (number > 0) {list[count] = (number) % 10; count++; number /= 10;}

		return mergeSort(list);
	}
	public static int[] mergeSort(int[] inp) {
		int midpoint = inp.length / 2;
		if (inp.length == 1) {
			return inp;
		}
		else {
			int[] firstHalf = new int[midpoint];
			int[] secondHalf = new int[inp.length-midpoint];
			for (int i = 0; i < midpoint; i ++) firstHalf[i] = inp[i];

			for (int i = midpoint; i < inp.length; i ++) secondHalf[i-midpoint] = inp[i];

			firstHalf = mergeSort(firstHalf);
			secondHalf = mergeSort(secondHalf);
			int firstind = 0;
			int secondind = 0;
			while (true) {
				if (firstind == midpoint) {
					if (secondind == inp.length-midpoint) break;
					inp[firstind+secondind] =secondHalf[secondind++];
				}
				else if (secondind == inp.length-midpoint) inp[firstind+secondind] =firstHalf[firstind++];
				else if (firstHalf[firstind] < secondHalf[secondind]) inp[firstind+secondind] =firstHalf[firstind++];
				else inp[firstind+secondind] =secondHalf[secondind++];
			}
			return inp;
		}
	}
}