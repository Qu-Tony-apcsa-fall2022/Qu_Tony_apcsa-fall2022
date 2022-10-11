package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		TotalRow.getRowTotals(new int[][] {{1,2,3},{5,5,5,5}});
		TotalRow.getRowTotals(new int[][] {{1,2,3},{5},{1},{2,2}});
		TotalRow.getRowTotals(new int[][]{{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}});
	}
}



