package entities;

public class Product {
	private String name;
	private double price;
	private int quantity;
	
	public Product()
	{
	}
	
	public Product(String name, double price)
	{
		this.name = name;
		this.price = price;		
	}
	
	public Product(String name, double price, int quantity)
	{
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	/* Getters and setters*/
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if(name == null)
		{
			return;
		}
		
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		if(price <= 0)
			return;
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}	

	public void addProducts(int quantity)
	{
		this.quantity += quantity; 
	}
	
	
	
	public double totalValueInStock()
	{
		return (price * quantity);
	}
	
	
	public void removeProducts(int quantity)
	{
		this.quantity -= quantity;
	}
	
	public String toString()
	{		
		return name
			   + ", $ "
			   + String.format("%.2f", price)
			   +", "
			   + quantity
			   + " units, Total: $ "
			   + totalValueInStock();
				
	}
}
