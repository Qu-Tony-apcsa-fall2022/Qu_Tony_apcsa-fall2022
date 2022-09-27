package Unit12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
	
import java.util.Scanner;
import static java.lang.System.*;

public class MonsterRunner
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		String name;
		int size;
		
		do {
		//ask for name and size
		System.out.print("Enter 1st monster's name : ");
		name = keyboard.next();
		System.out.print("Enter 1st monster's size : ");
		size = keyboard.nextInt();
		//instantiate monster one
		Skeleton one = new Skeleton(size,name);
		//ask for name and size
		System.out.print("Enter 2nd monster's name : ");
		name = keyboard.next();
		System.out.print("Enter 2nd monster's size : ");
		size = keyboard.nextInt();
		//instantiate monster two
		Skeleton two = new Skeleton(size,name);
		System.out.println("");
		System.out.println("Monster 1 - " + one);
		System.out.println("Monster 2 - " + two);
		System.out.println("");
		if (one.isBigger(two)) {
			System.out.println("Monster one is bigger than Monster two.");
		}
		else if (one.isSmaller(two)) {
			System.out.println("Monster one is smaller than Monster two.");
			
		}
		else {
			System.out.println("Monster one is the same size as Monster two.");
		}
		if (one.namesTheSame(two)) {
			System.out.println("Monster one has the same name as Monster two.");
		}
		else {
			System.out.println("Monster one does not have the same name as Monster two.");
		}
		System.out.println("\n");
		} while (true);
	}
}