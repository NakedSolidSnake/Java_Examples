package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	public static void main(String[] args) {		
		
		double balance;
		int account_number;
		String name;
		char first_deposit = 'N';
		Account account;
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter account number: ");
		account_number = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.print("Enter account holder: ");
		name = keyboard.nextLine();
		
		System.out.print("Is there a initial deposit (y/n)? ");
		first_deposit = keyboard.next().charAt(0);
		
		if(first_deposit == 'y')
		{
			System.out.print("Enter initial deposit value: ");
			balance = keyboard.nextDouble();
			account = new Account(account_number, name, balance);
		}
		else {			
			account = new Account(account_number, name);
		}
		
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.print("Enter a deposit value: ");
		account.deposit(keyboard.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.print("Enter a withdraw value: ");
		account.withdraw(keyboard.nextDouble());
		System.out.println("Updated account data:");
		System.out.println(account);
		keyboard.close();
	}
}
