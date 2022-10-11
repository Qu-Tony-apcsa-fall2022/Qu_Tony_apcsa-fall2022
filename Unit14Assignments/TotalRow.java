package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	int[] x= new int[m.length];
    	System.out.print("\nRow Totals are :: [");
    	for (int i = 0; i < x.length; i ++) {
    		for (int j = 0; j < m[i].length; j ++) {
    			x[i] += m[i][j];
    		}
    		if (i < x.length-1) {
    			System.out.print(x[i] + ", ");
    		}
    		else {
    			System.out.print(x[i] + "]");
    		}
    		
    	}
		return null;
    }
}
