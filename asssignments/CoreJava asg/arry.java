package qwe;
import java.util.Scanner;

public class arry {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter size of array : ");
		int size = sc.nextInt();
		
		int arr[] = new int[size];
		int sum=0;
		for(int index=0;index<arr.length;index++) {
			System.out.print("enter value at arr["+index+"] : ");
			arr[index] = sc.nextInt();
			sum = sum+arr[index];
			System.out.println("sum = "+sum);
		}
		System.out.println("overall sum = "+sum);
		
		System.out.print("enter number to search in array : ");
		int n = sc.nextInt();
		int counter=0;
		for(int index=0;index<arr.length;index++) {
			if(n == arr[index]) {
				counter++;
			}
		}
		
	}
}



	