package Unit5;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
//Date - 08/22/2022
//Class - APCSA


public class FirstLastVowel
{
	public static String vowels;
	public FirstLastVowel() {
	   vowels = "aeiou";
   }
	public static String go(String a )
	{
		String first = "x";
		String last = "x";
		for (int i = 0; i < a.length(); i ++) {
			char c = a.charAt(i);
			if (c >=65 && c < 124) {
				first = a.substring(i,i+1).toLowerCase();
				break;
			}
			
		}
		for (int i = 0; i < a.length(); i ++) {
			char c = a.charAt(a.length()-1-i);
			if (c >=65 && c < 124) {
				last = a.substring(a.length()-1-i,a.length()-i).toLowerCase();
				break;
			}
			
		}
		for (int i = 0; i < 5; i ++) {
			if (first.equals(vowels.substring(i,i+1)) || last.equals(vowels.substring(i,i+1))) {
				return "yes";
			}
		}
		return "no";
		
	}
}