package qwe;
//MARKS
import java.util.Scanner;

public class simpleaf {
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("A is greater than B");
		}
		System.out.println("enter marks : ");
		int per = sc.nextInt();
		if (per < 40) {
			System.out.println("fail");
		} 
		else if (per >= 41 && per <= 50) {
			System.out.println("DD");
		} 
		else if (per >= 51 && per <= 60) {
			System.out.println("CC");
		} 
		else if (per >= 61 && per <= 70) {
			System.out.println("BC");
		} 
		else if (per >= 71 && per <= 80) {
			System.out.println("BB");
		} 
		else if (per >= 81 && per <=90) {
			System.out.println("AB");
		}
			else if (per >= 91 && per <= 100) {
				System.out.println("AA grade");
		}
			else {
			System.out.println("invalid input");
	
		
		}
	
	}
}
