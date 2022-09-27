package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import static java.lang.System.*;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
	}
	public ToyStore(String[] toys) {
		toyList = new ArrayList<Toy>();
		for (int i = 0; i < toys.length; i ++) {
			toyList.add(new Toy(toys[i]));
		}
		int i1 = 0;
		int i2 = 0;
		while (i1 < toyList.size()-1) {
			i2 = i1 + 1;
			while (i2 < toyList.size()) {
				if (toyList.get(i1).getName().equals(toyList.get(i2).getName())) {
					toyList.remove(i2);
					toyList.get(i1).addCount();
				}
				else {
					i2 += 1;
				}
			}
			i1 += 1;
		}
	}


  
  	public String getMostFrequentToy()
  	{
  		int bestInd = 0;
  		for (int i = 1; i < toyList.size(); i ++) {
  			if (toyList.get(i).getCount() > toyList.get(bestInd).getCount()) {
  				bestInd = i;
  			}
  		}
  		return toyList.get(bestInd).getName();
  	}  
  
  	public void sortToysByCount()
  	{
  		for (int i = 0; i < toyList.size()-1; i ++) {
  			for (int j = i+1; j < toyList.size(); j ++) {
  				if (toyList.get(i).getCount() < toyList.get(j).getCount()) {
  					toyList.set(i,toyList.set(j, toyList.get(i)));
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   String a = "[";
	   int i;
	   for (i = 0; i < toyList.size()-1; i ++) {
		   a += toyList.get(i) + ", ";
	   }
	   a += toyList.get(i) + "]";
	   return a;
	}
}