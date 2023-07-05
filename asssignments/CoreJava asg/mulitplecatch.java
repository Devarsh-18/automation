package qwe;

public class mulitplecatch {
	public static void main(String[] args) {
	    try {
	      int[] myArray = new int[5];
	      myArray[7] = 18;
	    } 
	    catch (ArithmeticException e) {
	      System.out.println("Arithmetic Exception Caught: " + e);
	    } 
	    catch (ArrayIndexOutOfBoundsException e) {
	      System.out.println("ArrayIndexOutOfBounds Exception Caught: " + e);
	    } 
	    catch (Exception e) {
	      System.out.println("Exception Caught: " + e);
	    }

	    System.out.println("error");
	  }

}
