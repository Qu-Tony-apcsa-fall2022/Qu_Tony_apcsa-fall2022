package Unit13;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Tony Qu
import java.util.*;
import java.io.*; 

public class WordSearch
{
    private String[][] m;

    public WordSearch( int size, String str )
    {
    	m = new String[size][size];
    	for (int i = 0; i < size; i ++) {
    		for (int j = 0; j < size; j ++) {
    			m[i][j] = str.substring(size * i + j,size * i + j+1);
    		}
    	}
    }
    
    public boolean isFound( String word )
    {
    	boolean found = false;
    	for (int i = 0; i <  m.length; i ++) {
    		for (int j = 0; j <  m.length; j ++) {
    			found = found || 
    					checkRight(word,i,j) || 
    					checkLeft(word,i,j) || 
    					checkUp(word,i,j) || 
    					checkDown(word,i,j) ||
    					checkUpRight(word,i,j) || 
    					checkUpLeft(word,i,j) || 
    					checkUpRight(word,i,j) || 
    					checkDownLeft(word,i,j);
    		}
    	}
    	return found;
    }
    public boolean oob(int r, int c) {
    	return (r >= m.length || c >= m.length) || (r <0 || c < 0);
    }
	public boolean checkRight(String w, int r, int c)
   {	
		if (oob(r,c)) return false;
		String word = m[r][c];
		boolean match = word.charAt(0) == w.charAt(0);
		if (w.length() == 1) return match;
		match = match && checkRight(w.substring(1),r,c+1);
		return match;
	}

	public boolean checkLeft(String w, int r, int c)
	{
		if (oob(r,c)) return false;
		String word = m[r][c];
		boolean match = word.charAt(0) == w.charAt(0);
		if (w.length() == 1) return match;
		match = match && checkLeft(w.substring(1),r,c-1);
		return match;
	}

	public boolean checkUp(String w, int r, int c)
	{
		if (oob(r,c)) return false;
		String word = m[r][c];
		boolean match = word.charAt(0) == w.charAt(0);
		if (w.length() == 1) return match;
		match = match && checkUp(w.substring(1),r-1,c);
		return match;
	}

	public boolean checkDown(String w, int r, int c)
   {
		if (oob(r,c)) return false;
		String word = m[r][c];
		boolean match = word.charAt(0) == w.charAt(0);
		if (w.length() == 1) return match;
		match = match && checkDown(w.substring(1),r+1,c);
		return match;
	}

	public boolean checkUpRight(String w, int r, int c)
	{
		if (oob(r,c)) return false;
		String word = m[r][c];
		boolean match = word.charAt(0) == w.charAt(0);
		if (w.length() == 1) return match;
		match = match && checkUpRight(w.substring(1),r-1,c+1);
		return match;
	}

	public boolean checkUpLeft(String w, int r, int c)
	{
		if (oob(r,c)) return false;
		String word = m[r][c];
		boolean match = word.charAt(0) == w.charAt(0);
		if (w.length() == 1) return match;
		match = match && checkUpLeft(w.substring(1),r-1,c-1);
		return match;
	}

	public boolean checkDownLeft(String w, int r, int c)
   {
		if (oob(r,c)) return false;
		String word = m[r][c];
		boolean match = word.charAt(0) == w.charAt(0);
		if (w.length() == 1) return match;
		match = match && checkDownLeft(w.substring(1),r+1,c-1);
		return match;
	}

	public boolean checkDownRight(String w, int r, int c)
	{
		if (oob(r,c)) return false;
		String word = m[r][c];
		boolean match = word.charAt(0) == w.charAt(0);
		if (w.length() == 1) return match;
		match = match && checkDownRight(w.substring(1),r+1,c+1);
		return match;
	}

    public String toString()
    {
    	String returnee = "";
    	for (int i = 0; i <  m.length; i ++) {
    		for (int j = 0; j <  m.length; j ++) {
    			returnee += m[i][j] + " ";
    		}
    		returnee += "\n";
    	}
 		return returnee;
    }
}
