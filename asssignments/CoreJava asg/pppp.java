package qwe;
//greatest number
import java.util.Scanner;

public class pppp {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);

	    System.out.println("Enter first number: ");
	    int number1 = scanner.nextInt();

	    System.out.println("Enter second number: ");
	    int number2 = scanner.nextInt();

	    System.out.println("Enter third number: ");
	    int number3 = scanner.nextInt();

	    int greatestNumber = number1;
	    if (number2 > greatestNumber) {
	      greatestNumber = number2;
	    }

	    if (number3 > greatestNumber) {
	      greatestNumber = number3;
	    }

	    System.out.println("The greatest number is: " + greatestNumber);
	  }

}
