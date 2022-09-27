package Unit11;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu

import static java.lang.System.*; 

class Rational implements Comparable<Rational>
{
	private int numerator;
	private int denominator;
	//add two instance variables

	//write two constructors

	public Rational() {
		setRational(1,1);
	}
	public Rational(int num, int den) {
		setRational(num,den);
	}
	//write a setRational method
	public void setRational(int num, int den) {
		numerator = num;
		denominator = den;
		reduce();
	}

	//write  a set method for numerator and denominator

	public void setNumerator(int num) {
		numerator = num;
		reduce();
	}
	public void setDenominator(int den) {
		denominator = den;
		reduce();
	}
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		numerator = (getNum() * other.getDen() + other.getNum() * getDen());
		denominator = (other.getDen() * getDen());
		reduce();
	}

	private void reduce()
	{
		for (int i = denominator; i > 1; i --) {
			if (numerator % i == 0 && denominator % i == 0) {
				numerator = numerator / i;
				denominator = denominator / i;
				break;
			}
		}
		

	}
	public Rational clone() {
		return new Rational(numerator,denominator);
	}
	//ACCESSORS

	//write get methods for numerator and denominator
	
	public int getNum() {
		return numerator;
	}
	public int getDen() {
		return denominator;
	}
	public boolean equals(Rational obj)
	{
		return getNum() == obj.getNum() && getDen() == obj.getDen();
	}

	public int compareTo(Rational other)
	{

		int score1 = getNum() * other.getDen();
		int score2 = other.getNum() * getDen();
			
		return score2 < score1 ? 1 : score2 == score1 ? 0 : -1;
	}



	
	//write  toString() method
	public String toString() {
		return numerator + "/" + denominator;
	}
	
}