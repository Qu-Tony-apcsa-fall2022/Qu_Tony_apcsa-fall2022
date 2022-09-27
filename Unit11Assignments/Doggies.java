package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import java.util.Arrays;

public class Doggies
{
	private Dog[] pups;
	private int size;
	public Doggies(int sized)
	{
		size = sized;
		pups = new Dog[size];
		
	}
	
	public void set(int spot, int age, String name)
	{
		pups[spot] = new Dog(age,name);
	}

	public String getNameOfOldest()
	{
		int oldestInd = 0;
		for (int i = 1; i < size; i ++) {
			if (pups[i].getAge() > pups[oldestInd].getAge()) {
				oldestInd = i;
			}
		}
		return pups[oldestInd].getName();
	}

	public String getNameOfYoungest()
	{
		 int oldestInd = 0;
			for (int i = 1; i < size; i ++) {
				if (pups[i].getAge() < pups[oldestInd].getAge()) {
					oldestInd = i;
				}
			}
			return pups[oldestInd].getName();
	}

	public String toString()
	{
		return "pack :: "+Arrays.toString(pups) + "\n\nNAME OF OLDEST :: " + getNameOfOldest() + "\nNAME OF YOUNGEST :: " + getNameOfYoungest();
	}
}