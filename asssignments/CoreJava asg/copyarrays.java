package qwe;
//copy array
import java.util.Arrays;

public class copyarrays {
	public static void main(String[] args) {
	    int[] sourceArray = {10, 20, 30, 40, 50,90};
	    int[] destinationArray = new int[sourceArray.length];

	    for (int i = 0; i < sourceArray.length; i++) {
	      destinationArray[i] = sourceArray[i];
	    }

	    System.out.println("Source array: " + Arrays.toString(sourceArray));
	    System.out.println("Destination array: " + Arrays.toString(destinationArray));
	  }

}
