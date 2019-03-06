package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for(int i  = 1; i <= n; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			if(ch == 'c') {
				list.add(new Product(name, price));
			}
			
			else if(ch == 'i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name, price, customsFee));				
			}
			
			else if(ch == 'u') {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				sc.nextLine();
				System.out.print("Manufacture data (DD/MM/YYYY): ");				
				String manufactureDate = sc.nextLine();
				list.add(new UsedProduct(name, price, sdf.parse(manufactureDate)));				
			}			
		}
		
		System.out.println();
		System.out.println("PRICE TAGS:");
		
		for(Product prod : list) {
			System.out.println(prod.priceTag());
		}	
			
		sc.close();
	}
		

}
