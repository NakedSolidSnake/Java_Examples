package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		
		System.out.print("Enter product data: ");
		String name = keyboard.nextLine();
		System.out.print("Price: ");
		double price = keyboard.nextDouble();
		System.out.print("Quantity: ");
		int quantity = keyboard.nextInt();
		
		Product product = new Product(name, price, quantity);
		System.out.println("Product data: " + product);
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(keyboard.nextInt());
		
		System.out.println("Updated data: " + product);
		
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(keyboard.nextInt());
		
		System.out.println("Updated data: " + product);
		keyboard.close();
	}
}
