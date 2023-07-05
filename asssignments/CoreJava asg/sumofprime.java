package qwe;
//sum of prime numbers
public class sumofprime {
	public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }

        System.out.println("The sum of the first 100 prime numbers is " + sum);
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }

}
