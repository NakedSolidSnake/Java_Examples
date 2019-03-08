package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Divider;
import exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			double a = 10;
			double b = 0;
			System.out.println("Value = " + Divider.divide(a, b));
			
		}catch(DomainException e) {
			
		}
		
		sc.close();
	}

}
