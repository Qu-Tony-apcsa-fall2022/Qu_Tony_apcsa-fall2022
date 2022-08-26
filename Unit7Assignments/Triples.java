package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Tony Qu
import static java.lang.System.*;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;

	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{	
		if (c % 2 == 0) {
			return 0;
		}
		if (a % 2 == 1) {
			if (b % 2 == 1) {
				return 0;
			}
		}
		else {
			if (b % 2 == 0) {
				return 0;
			}
		}
		int max = a > b ? 
					a > c?
						a:
						c:
					b > c ?
						b:
						c;
		for (double i = 2.0; i < max; i ++) {
			if ((a % i == 0 && b % i == 0)||
				(b % i == 0 && c % i == 0)||
				(a % i == 0 && c % i == 0)) {
				return 0;
			}
		}
		

		return 1;
	}
	
	public String toString()
	{
		int min = (int)(number / 1.4);
		String output="";
		for (int i = 3; i < min; i ++) {
			for (int j = i+1; j < number-1; j ++) {
				for (int k = j+1; k < number; k ++) {
					if (i * i + j * j == k * k && greatestCommonFactor(i,j,k) == 1) {
						output += i + " " + j + " " + k + "\n";
					}
				}
			}
		}





		return output+"\n";
	}
}