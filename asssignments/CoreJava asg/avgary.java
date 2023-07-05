package qwe;
//AVERAGE OF ARRAY
public class avgary {
	public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5,6,7};
        int sum = 0;
        int average;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        average = sum / arr.length;

        System.out.println("The average value of the array is " + average);
    }

}
