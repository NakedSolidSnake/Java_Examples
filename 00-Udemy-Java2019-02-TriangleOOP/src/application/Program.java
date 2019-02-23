package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Triangle x = new Triangle();
		Triangle y = new Triangle();
		
		System.out.println("Enter the measures of triangle X: ");
		x.a = keyboard.nextDouble();
		x.b = keyboard.nextDouble();
		x.c = keyboard.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = keyboard.nextDouble();
		y.b = keyboard.nextDouble();
		y.c = keyboard.nextDouble();	
		
		
		System.out.printf("Triangle X area: %.4f%n", x.getArea());
		System.out.printf("Triangle Y area: %.4f%n", y.getArea());

		if(x.getArea() > y.getArea())
		{
			System.out.println("Triangle X is bigger than Y");
		}
		else {
			System.out.println("Triangle Y is bigger than X");
		}
		
		keyboard.close();
		
	}
}
