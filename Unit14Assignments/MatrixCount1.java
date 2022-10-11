package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.util.*;
import java.io.*; 

public class MatrixCount1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
								{ 6, 7, 8, 9, 0},
								{ 6, 7, 1, 2, 5},
								{ 6, 7, 8, 9, 0},
								{ 5, 4, 3, 2, 1}};
    private static int[] check = {7,8,6,21};

    private int count( int val )
	{
		int count = 0;
		for (int i = 0; i < m.length; i ++) {
			for (int j = 0; j < m[i].length; j ++) {
				count+= (m[i][j] == val) ? 1 : 0;
			}
		}
		return count;
	}
    public String toString()
	{
		String output="Matrix Values\n";
		for (int i = 0; i < m.length; i ++) {
			for (int j = 0; j < m[i].length; j ++) {
				output+= m[i][j] + " ";
			}
			output += "\n";
		}
		for (int i = 0 ; i < check.length; i ++) {
			output += "The " + check[i] + " count is :: " + count(check[i]) + "\n";
		}
		return output;
	}
}
