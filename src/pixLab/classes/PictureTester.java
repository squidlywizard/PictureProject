package pixLab.classes;
import java.awt.*;


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
    Picture beach = new Picture("seagull.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  public static void testZeroRed()
  {
	  Picture hotHead = new Picture("heatmiser.jpg");
	//  hotHead.explore();
	  hotHead.zeroRed();
	  hotHead.explore();
  }
  public static void greenOnly()
  {
	  Picture hot = new Picture("heatmiser.jpg");
	  hot.zeroBlue();
	  hot.zeroRed();
	  hot.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("heatmiser.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVertical2()
  {
	  Picture hm = new Picture("heatmiser.jpg");
	  hm.mirrorVertical2();
	  hm.explore();
  }
  public static void testMirrorHorizontal()
  {
	  Picture trum = new Picture("heatmiser.jpg");
	  trum.mirrorHorizontal();
	  trum.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  public static void testglitch()
  {
	  Picture miser = new Picture ("dominos.jpeg");
	  for(int I = 100; I>0;I --) {
	  miser.glichy();
	  }
	  
	  
	
	 
	  
	  miser.explore();
  }
  public static void testChromakey()
  {
	  Picture source = new Picture("spurdo.jpg");
	  Picture background = new Picture("sburdo.png");
	 // source.chromakey(background, Color.WHITE);
	  //source.explore();
	  background.explore();
  }
  public static void testPictureShifter() 
  {
	  Picture pizza = new Picture("swan.jpg");
	  pizza.shiftUpDown(2);
	  pizza.explore();
  }
 
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
	  testPictureShifter();
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
	  //testglitch();
    //testZeroBlue();
	//greenOnly();
    //testZeroRed();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
     //testMirrorVertical2();
    // testMirrorHorizontal();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
  }
}