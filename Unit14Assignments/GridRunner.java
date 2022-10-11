package Unit14;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid x = new Grid(20,30,new String[] {"a","b","c","x","y","z"});
		System.out.println(x);
		
		System.out.println(x.findMax(new String[] {"a","b","c","x","y","z"}));
		
	}
}