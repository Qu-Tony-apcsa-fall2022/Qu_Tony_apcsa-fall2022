package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.lang.Math;
public class Grid
{
   private String[][] grid;

   //load vals into the rows x cols grid randomly
	public Grid(int rows, int cols, String[] vals)
	{
		String[][] matrix = new String[rows][cols];
		for (int i = 0; i < rows; i ++) {
			for (int j = 0; j < cols; j ++) {
				matrix[i][j] = vals[(int) (vals.length * Math.random())];
			}
		}
		grid = matrix;
	}

	//find out which of the vals occurs the most
	public String findMax(String[] vals)
	{	
		String max = "";
		for (int i  = 0; i < vals.length; i ++) {
			int x = countVals(vals[i]);
			System.out.println(vals[i] + " count is " + x) ;
			max = x > countVals(max) ? vals[i] : max;
		}
		return max + " occurs the most.";
	}

	//returns a count of how many times val occurs in the matrix
	private int countVals( String val )
	{
		int count = 0;
		for (int i = 0; i < grid.length; i ++) {
			for (int j = 0; j < grid[i].length; j ++) {
				count+= (grid[i][j] == val) ? 1 : 0;
			}
		}
		return count;
	}

	//display the grid
	public String toString()
	{
		String output="";
		for (int i = 0; i < grid.length; i ++) {
			for (int j = 0; j < grid[i].length; j ++) {
				output+= grid[i][j] + " ";
			}
			output += "\n";
		}
		return output;
	}
}