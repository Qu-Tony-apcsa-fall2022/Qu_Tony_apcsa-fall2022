package Unit6;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 08/23/2022
//Class - APCSA
import static java.lang.System.*;
import java.lang.Math;
import java.util.ArrayList;
public class Perfect
{
	private int number, sum;
	private ArrayList<Integer> factors;

	//add constructors
   	public Perfect() {
   		
   	}
   	public Perfect(int num) {
   		setNums(num);
   	}
	//add a set method
   	public void setNums(int num) {
   		number = num;
   	}
   	public void setFactors() {
   		factors = getFactors();
   		for (int i = 0; i < factors.size(); i ++) {
   			sum += factors.get(i);
   		}
   	}
   	public ArrayList<Integer> getFactors() {
   		ArrayList<Integer> f = new ArrayList<Integer>();
   		int largestfactor = number - 1;
   		for (int i = largestfactor; i > 0; i --) {
   			if(number % i == 0) {
   				f.add(i);
   			}
   		}
   		return f;
   		
   	}
	public boolean isPerfect()
	{
		setFactors();
		return sum == number;
	}

	//add a toString	
	public String toString() {
		return isPerfect() ? number + " is perfect": number + " is not perfect";
	}
}