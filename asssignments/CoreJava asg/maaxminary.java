package qwe;
//max and min value of array
public class maaxminary {
 public static void main(String[] args) {
	
	        int[] arr = {1, 2, 3, 4, 5};
	        int max = Integer.MIN_VALUE;
	        int min = Integer.MAX_VALUE;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }

	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        System.out.println("The maximum value of the array is " + max);
	        System.out.println("The minimum value of the array is " + min);
	    }


}
