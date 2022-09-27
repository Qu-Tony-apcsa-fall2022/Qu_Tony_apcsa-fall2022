package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import static java.lang.System.*;

public class ToyRunner
{
	public static void main(String[] args)
	{
		Toy sor = new Toy("sorry");
		sor.setCount(1);
		Toy joe = new Toy("gi joe");
		joe.setCount(5);
		System.out.println(sor);
		System.out.println(joe);
	}
}