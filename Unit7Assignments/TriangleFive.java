package Unit7;
//(c) A+ Computer Science
// www.apluscompsci.com
//Name - Tony Qu

import static java.lang.System.*;

public class TriangleFive
{
   private String[] letters;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(String[] inputs)
	{
		setLetters(inputs);
	}

	public void setLetters(String[] inputs)
	{
		inputs = bubbleSort(inputs);
		amount = inputs.length;
		letters = inputs;
	}
	public String[] bubbleSort(String[] inputs) {
		int greatest = 0;
		for (int i = 0; i < inputs.length; i ++) {
			for(int j = i+1; j < inputs.length; j ++) {
				int one = Integer.parseInt(inputs[i].substring(2));
				int two = Integer.parseInt(inputs[j].substring(2));
				if (one < two) {
					String saveone = inputs[i];
					inputs[i] = inputs[j];
					inputs[j] = saveone;
				}
			}
		}
		return inputs;
	}
	public String toString()
	{
		String output="";
		String[] lettersonly = new String[amount];
		int[] numsonly = new int[amount];
		int max = 0;
		for (int i = 0; i < amount; i ++) {
			lettersonly[i] = letters[i].substring(0,1);
			numsonly[i] = Integer.parseInt(letters[i].substring(2));
			if (numsonly[i] > max) {
				max = numsonly[i];
			}
		}
		for (int i = 0; i < max; i ++) {
			for (int j = 0; j < amount; j ++) {
				if (i >= numsonly[j]) {
					continue;
				}
				for (int k = 0; k < numsonly[j]; k ++) {
					
					output += lettersonly[j];
				}
				output += " ";
			}
			output += "\n";
		}
		return output;
	}
}