package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner keyboard = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.print("Enter product data: ");
		product.name = keyboard.nextLine();
		System.out.print("Price: ");
		product.price = keyboard.nextDouble();
		System.out.print("Quantity: ");
		product.quantity = keyboard.nextInt();
		
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
