//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Tony Qu  
//Date - 8/17/2022
//Class - APCSA
//Lab  - AsciiBox

public class AsciiBox {
  public static void main(String[] args) {
    System.out.println("Tony Qu - August 17, 2022\n");
    final String A = "A";
    final String plus = "+";
    for (int i = 0; i < 25; i ++){
      for (int j = 0; j < 25; j ++){
        if ((i > 5 && i+j == 11) || 
            (i<12 && i+j == 29 ) || 
            (i<20 && i>14 && i+j == 38 ) || 
            (j == 24 && i > 5 && i < 15) || 
            (j == 0 && i > 11 && i < 21)|| 
            (j == 18 && i > 11 && i < 21)|| 
            (i == 5 && j > 5) ||
            (i == 11 && j < 19) ||
            (i == 20 && j < 19)){
          System.out.print(A);
        }
        else{
          System.out.print(plus);
        }
        
        
      }
      System.out.println("");
    }
  }
}
