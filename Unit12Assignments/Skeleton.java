package Unit12;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import static java.lang.System.*; 

public class Skeleton implements Monster
{
	private int size;
	private String name;
	public Skeleton() {
		
	}
	public Skeleton(int siz, String nam) {
		size = siz;
		name = nam;
	}
	@Override
	public int getHowBig() {
		// TODO Auto-generated method stub
		return size;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public boolean isBigger(Monster other) {
		// TODO Auto-generated method stub
		return size > other.getHowBig();
	}

	@Override
	public boolean isSmaller(Monster other) {
		// TODO Auto-generated method stub
		return size < other.getHowBig();
	}

	@Override
	public boolean namesTheSame(Monster other) {
		// TODO Auto-generated method stub
		return name.equals(other.getName());
	}
	public String toString() {
		return name + " " + size;
	}

}