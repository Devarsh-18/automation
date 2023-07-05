package qwe;

import java.util.Scanner;

public class loop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your choice");
		int num = sc.nextInt();
		for (int i = 1; i <= 6; i++) {
			System.out.println(num + "x" + i + "=" + (num * i));
		}

		for (int j = 1; j <= 100; j++) {
			if (j % 2 == 0) {
				System.out.println(j);
			}
		}
		int a = 1, b = 3;
		System.out.println(a % b);
	}
}
