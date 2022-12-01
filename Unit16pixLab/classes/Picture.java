package classes;
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
        count++;
      }
    }
    System.out.println(count);
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; 
         fromRow < fromPixels.length &&
         toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();

  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */

public void keepOnlyBlue() {
	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setRed(0);
        pixelObj.setGreen(0);
      }
    }
}

public void keepOnlyRed() {
	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setGreen(0);
      }
    }
}

public void keepOnlyGreen() {
	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
        pixelObj.setRed(0);
      }
    }
}

public void negate() {
	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int red = pixelObj.getRed();
    	int blue = pixelObj.getBlue();
    	int green = pixelObj.getGreen();
        pixelObj.setBlue(255-blue);
        pixelObj.setRed(255-red);
        pixelObj.setGreen(255-green);
      }
    }
	
}

public void grayscale() {
	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	int red = pixelObj.getRed();
    	int blue = pixelObj.getBlue();
    	int green = pixelObj.getGreen();
    	int avg = (red + blue + green ) / 3;
        pixelObj.setBlue(avg);
        pixelObj.setRed(avg);
        pixelObj.setGreen(avg);
      }
    }
}

public void fixUnderwater() {
	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
	
	
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
    	pixelObj.setRed(3* pixelObj.getRed());
        pixelObj.setBlue(3 * pixelObj.getBlue()/5);
        pixelObj.setGreen(3 * pixelObj.getGreen()/5);
      }
    }
}
public void mirrorVerticalRighttoLeft() {
	// TODO Auto-generated method stub
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        leftPixel.setColor(rightPixel.getColor());
      }
    } 
}
public void mirrorHorizontal() {
	// TODO Auto-generated method stub
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
  
    for (int row = 0; row < pixels.length/2; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[pixels.length-row-1][col];
        botPixel.setColor(topPixel.getColor());
      }
    } 
}
public void mirrorHorizontalBottoTop() {
	// TODO Auto-generated method stub
    Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
  
    for (int row = 0; row < pixels.length/2; row++)
    {
      for (int col = 0; col < pixels[0].length; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[pixels.length-row-1][col];
        topPixel.setColor(botPixel.getColor());
      }
    }  
}
public void mirrorArms() {
	// TODO Auto-generated method stub
	 Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel botPixel = null;

	    for (int row = 152; row < 200; row++)
	    {
	      for (int col = 97; col < 171; col++)
	      {
	    	  
	    	  topPixel = pixels[row][col];
	          botPixel = pixels[194-row + 194][171- col + 238];
	          if (topPixel.getRed() + topPixel.getGreen() + topPixel.getBlue() < 300) {
	        	  botPixel.setColor(topPixel.getColor());
	          }
	          
	          
	      }
	      for (int col = 238; col < 300; col++)
	      {
	    	  topPixel = pixels[row][col];
	          botPixel = pixels[194-row + 194][238-col +171];
	          if (topPixel.getRed() + topPixel.getGreen() + topPixel.getBlue() < 300) {
	        	  botPixel.setColor(topPixel.getColor());
	          }

	      }
	    }  
}
public void mirrorGull() {
	// TODO Auto-generated method stub
	 Pixel[][] pixels = this.getPixels2D();
	    Pixel topPixel = null;
	    Pixel botPixel = null;

	    for (int row = 235; row < 323; row++)
	    {
	      for (int col = 238; col < 344; col++)
	      {
	    	  
	    	  topPixel = pixels[row][col];
	          botPixel = pixels[row][354- col  + 354];
	          if (topPixel.getRed() + topPixel.getGreen() + topPixel.getBlue() < 330) {
	        	  botPixel.setColor(topPixel.getColor());
	          }
	          
	          
	      }

	    }  
}
public void mirrorDiagonal() {
	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
    Pixel topPixel = null;
    Pixel botPixel = null;
    int min = pixels.length > pixels[0].length ? pixels[0].length: pixels.length;
    for (int row = 0; row < min-1; row++)
    {
      for (int col = row+1; col < min; col++)
      {
        topPixel = pixels[row][col];
        botPixel = pixels[col][row];
        topPixel.setColor(botPixel.getColor());
      }
    }  
}
public void copy2(Picture fromPic, 
        int startRow, int startCol, int sRow, int sCol, int eRow, int eCol)
{
	Pixel fromPixel = null;
	Pixel toPixel = null;
	Pixel[][] toPixels = this.getPixels2D();
	Pixel[][] fromPixels = fromPic.getPixels2D();
	for (int fromRow = sRow, toRow = startRow; 
		fromRow < eRow &&
		toRow < this.getHeight(); 
		fromRow++, toRow++)
	{
		for (int fromCol = sCol, toCol = startCol; 
		  fromCol < eCol &&
		  toCol < this.getWidth();  
		  fromCol++, toCol++)
		{
			fromPixel = fromPixels[fromRow][fromCol];
			toPixel = toPixels[toRow][toCol];
			toPixel.setColor(fromPixel.getColor());
		}
	}   
}
public void createMyCollage()
{
  Picture c1 = new Picture("caterpillar.jpg");
  Picture c2 = new Picture("caterpillar.jpg");
  Picture c3 = new Picture("caterpillar.jpg");
  this.copy2(c1,0,0,10,10,100,200);
  this.copy2(c2,100,0,10,10,100,200);
  this.copy2(c3,200,0,10,10,100,200);
  
  c1.zeroBlue();
  
  c2.mirrorDiagonal();
  c2.negate();
  c3.grayscale();
  this.copy2(c1,0,400,10,10,100,200);
  this.copy2(c2,100,400,10,10,100,200);
  this.copy2(c3,200,400,10,10,100,200);


}
public void edgeDetection2(int i) {
	// TODO Auto-generated method stub
	Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel downPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color downColor = null;
    for (int row = 0; row < pixels.length-1; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        downPixel = pixels[row+1][col];
        rightColor = rightPixel.getColor();
        downColor = downPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            i || leftPixel.colorDistance(downColor) > 
            i)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
}

public void chromakey(int i) {
	// TODO Auto-generated method stub
	
}
public long hash(long a, int b) {
	a += (a << 13);
    a -= (a >>> 17); 
    a ^= (a << 5);
    return a % b;  
}
public int simpleHash(long a,long add, int b) {
	return (int)( hash(a,b) + add) % b;
}
public void Encode(String url, int n, int mod) {
	Picture c1 = new Picture(url);
	int[] avgchange = new int[] {0,0,0,0};
	Pixel[][] msgpixels = c1.getPixels2D();

	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
    for (long i = 0; i < Math.min(pixels.length,msgpixels.length); i ++)
    {
    Pixel[] msgRowArray = msgpixels[(int)i];
    Pixel[] rowArray = pixels[(int)i];
    
      for (long j = 0; j < Math.min(rowArray.length,msgRowArray.length); j ++)
      {
    	  
    	  Pixel pixelObj = rowArray[(int)j];
    	  Pixel messageObj = msgRowArray[(int)j];
    	  boolean messageIsBlack = messageObj.getRed() < 120;
//    	  if (i == 238 && j == 174) {
//    		  System.out.println(messageIsBlack);
//    	  }
    	  long red = pixelObj.getRed();
    	  long blue = pixelObj.getBlue();
    	  long green = pixelObj.getGreen();
    	  int[] originals = new int[] {(int)red,(int)blue,(int)green};
    	  int[] change = new int[] {0,0,0};
    	  boolean passed = false;
    	  
    	  
    	  while (!passed) {
    		  
        	int val = simpleHash((long) rowArray.length * i  +  j,red + blue+green,mod) ;
        	if (val < n  && !messageIsBlack) {
        		
        		avgchange[0] += Math.abs(red-originals[0]) + Math.abs(blue-originals[1]) + Math.abs(green-originals[2]);
        		avgchange[1] += 1;
        		
        		break;
        	
        	}
        	  
    		  if (val > n && messageIsBlack) {
    			  avgchange[2] += Math.abs(red-originals[0]) + Math.abs(blue-originals[1]) + Math.abs(green-originals[2]);
    			  avgchange[3] += 1;
    			  
    			  break;
    		  }
    		  if (!passed) {
    			  int minIndex = 0;
    			  for (int ind = 1; ind < 3; ind ++) {
    				  if (change[ind] < change[minIndex]) {
    					  minIndex = ind;
    					  
    				  }
    			  }
    			  change[minIndex] += 1;
    			  int changer = change[minIndex] * (change[minIndex] % 2 ==0 ? -1 : 1);

    			  if (minIndex == 1) {
    				  if (red + changer > 255) {
    					  change[minIndex] += 1;
    					  red -= 1;
    				  }
    				  else if (red + changer < 0) {
    					  change[minIndex] += 1;
    					  red += 1;
    				  }
    				  else {
    					  red += changer;
    				  }
    				  pixelObj.setRed((int)red);  
    			  }
    			  else if (minIndex == 2) {
    				  if (blue + changer > 255) {
    					  change[minIndex] += 1;
    					  blue -= 1;
    				  }
    				  else if (blue + changer < 0) {
    					  change[minIndex] += 1;
    					  blue += 1;
    				  }
    				  else {
    					  blue += changer;
    				  }
    				  pixelObj.setBlue((int)blue);  
    			  }
    			  else {
    				  if (green + changer > 255) {
    					  change[minIndex] += 1;
    					  green -= 1;
    				  }
    				  else if (green + changer < 0) {
    					  change[minIndex] += 1;
    					  green += 1;
    				  }
    				  else {
    					  green += changer;
    				  }
    				  pixelObj.setGreen((int)green);  
    			  }
    		  }
	    	  
    	  }
    	  
    	  
      }
    }
    System.out.println("Average change for white pixel: " + (float)avgchange[0]/avgchange[1]);
    System.out.println("Average change for black pixel: " + (float)avgchange[2]/avgchange[3]);
}
public void Decode(int n, int mod) {
	// TODO Auto-generated method stub
	Pixel[][] pixels = this.getPixels2D();
	for (long i = 0; i < pixels.length; i ++)
    {
   
    Pixel[] rowArray = pixels[(int)i];
    
      for (long j = 0; j < rowArray.length; j ++)
      {
    	  
    	  Pixel pixelObj = rowArray[(int)j];
    
    	  long red = pixelObj.getRed();
    	  long blue = pixelObj.getBlue();
    	  long green = pixelObj.getGreen();	
    	  boolean passed = false;
 
    	  int val = simpleHash((long)  rowArray.length * i  +  j,red + blue+green,mod) ;
//    	  if (i == 238 && j == 174) {
//    		  System.out.println(val);
//    	  }
    	if (val < n ) {
    		passed = true;
    		
    	}
  		  
    	  if (passed) {
    		  pixelObj.setColor(Color.WHITE);
    	  }
    	  else {
    		  pixelObj.setColor(Color.BLACK);
    	  }
    
    	  
    	  
      }
    }
	
}
public void getCountRedOverValue(int val) {
	// TODO Auto-generated method stub
	
}

public void setRedToHalfValueInTopHalf() {
	// TODO Auto-generated method stub
	
}

public void clearBlueOverValue(int val) {
	// TODO Auto-generated method stub
	
}

public void getAverageForColumn(int val) {
	// TODO Auto-generated method stub
	
}
 public static void main(String[] args) {
	 int n = 7;
	 int k = 13;
	 Picture swan = new Picture("beach.jpg");

    swan.explore();
    swan.Encode("msg.jpg",n,k);
    swan.explore();
    swan.Decode(n,k);
    swan.explore();
 }
} // this } is the end of class Picture, put all new methods before this
