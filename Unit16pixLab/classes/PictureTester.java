package classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testKeepOnlyBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyBlue();
    beach.explore();
  }
  public static void testKeepOnlyRed()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyRed();
    beach.explore();
  }
  public static void testKeepOnlyGreen()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.keepOnlyGreen();
    beach.explore();
  }
  public static void testNegate()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.negate();
    beach.explore();
  }
  public static void testGrayscale()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.grayscale();
    beach.explore();
  }
  public static void testFixUnderwater()
  {
    Picture beach = new Picture("water.jpg");
    beach.explore();
    beach.fixUnderwater();
    beach.explore();
  }
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRighttoLeft()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVerticalRighttoLeft();
    caterpillar.explore();
  }
  public static void testMirrorHorizontal()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontal();
    caterpillar.explore();
  }
  public static void testMirrorHorizontalBottoTop()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorHorizontalBottoTop();
    caterpillar.explore();
  }
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  public static void testMirrorArms()
  {
    Picture temple = new Picture("snowman.jpg");
    temple.explore();
    temple.mirrorArms();
    temple.explore();
  }
  public static void testMirrorDiagonal()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorDiagonal();
    temple.explore();
  }
  public static void testMirrorGull()
  {
    Picture temple = new Picture("seagull.jpg");
    temple.explore();
    temple.mirrorGull();
    temple.explore();
  }
  public static void testCopy(int r,int c, int sr, int sc, int er,int ec)
  {
    Picture temple = new Picture("beach.jpg");

    temple.explore();
    temple.copy2(temple,r,c,sr,sc,er,ec);
    temple.explore();
  }
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createMyCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testEdgeDetection2()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection2(10);
    swan.explore();
  }
  public static void testChromakey()
  {
    Picture swan = new Picture("swan.jpg");
    swan.chromakey(10);
    swan.explore();
  }
  public static void testEncodeAndDecode(int n, int k)
  {
    Picture swan = new Picture("swan.jpg");
    swan.explore();
    swan.Encode("msg.jpg",n,k);
    swan.explore();
    swan.Decode(n,k);
    swan.explore();
  }
  public static void testGetCountRedOverValue(int val)
  {
    Picture swan = new Picture("swan.jpg");
    swan.getCountRedOverValue(val);
    swan.explore();
  }
  public static void testSetRedToHalfValueInTopHalf()
  {
    Picture swan = new Picture("swan.jpg");
    swan.setRedToHalfValueInTopHalf();
    swan.explore();
  }
  public static void testClearBlueOverValue(int val)
  {
    Picture swan = new Picture("swan.jpg");
    swan.clearBlueOverValue(val);
    swan.explore();
  }
  public static void testGetAverageForColumn(int val)
  {
    Picture swan = new Picture("swan.jpg");
    swan.getAverageForColumn(val);
    swan.explore();
  }
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
//    testZeroBlue();
//    testKeepOnlyBlue();
//    testKeepOnlyRed();
//    testKeepOnlyGreen();
//    testNegate();
//    testGrayscale();
//    testFixUnderwater();
//    testMirrorVerticalRighttoLeft();
//    testMirrorHorizontal();
//    testMirrorHorizontalBottoTop(); 
//    testMirrorTemple(); 
//    testMirrorArms(); 
//    testMirrorGull();
//    testMirrorDiagonal(); 
//    testCollage(); 
//    testCopy(100,200,300,300,400,400); 
//    testEdgeDetection();
//    testEdgeDetection2();
	  // all above are done
//    testChromakey();
	  testEncodeAndDecode(3, 3);
//    testGetCountRedOverValue(250);
//    testSetRedToHalfValueInTopHalf();
//    testClearBlueOverValue(200);
//    testGetAverageForColumn(0);
  }
}