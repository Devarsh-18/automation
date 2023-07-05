package qwe;

import java.util.Scanner;

public class excep extends Exception {
public static void main(String[] args) {
	class InsufficientBalanceException extends RuntimeException {
	    public InsufficientBalanceException(String message) {
	        super(message);
	    }
	}

	class Account {
	    private int balance;

	    public Account(int balance) {
	        this.balance = balance;
	    }

	    public void withdraw(int amount) {
	        if (amount > balance) {
	            throw new InsufficientBalanceException("Sorry, insufficient balance. You need more " + (amount - balance) + " Rs.");
	        } else {
	            balance -= amount;
	            System.out.println("Amount deducted successfully.");
	        }
	    }
	}

	class Man {
	    public static void main(String[] args) {
	        Account account = new Account(2000);
	        int withdrawAmount = 2500;

	        try {
	            account.withdraw(withdrawAmount);
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }
	    
	    }
	    }
}
}

	

