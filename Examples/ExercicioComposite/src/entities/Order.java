package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {	
	private Date moment;
	private OrderStatus status;
	private Client client;
	
	private List<OrderItem> items = new ArrayList<OrderItem>();
	
	public Order() {
		
	}	
	
	public Order(Date moment, OrderStatus status, Client client) {		
		this.moment = moment;
		this.status = status;		
		this.client = client;
	}

	public void addItem(OrderItem item)	{
		items.add(item);
	}
	
	public void removeItem(OrderItem item) {
		items.remove(item);
	}
	
	public Double total() {
		return 0.0;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append("ORDER SUMMARY:\n");
		sb.append("Order moment: " + moment + "\n");
		sb.append("Order Status: " + status + "\n");
		sb.append("Client: " + client.getName());
		sb.append(client.getBirthDate());
		sb.append(" - " + client.getEmail());
		sb.append("Order items:\n");
		
		double sum = 0.0;
		
		for(OrderItem item : items) {
			sb.append(item.getProduct().getName() + ", ");
			sb.append(item.getProduct().getPrice());
			sb.append(", Quantity: " + item.getQuantity());
			sb.append(", Subtotal: $" + item.subTotal() + "\n");
			sum += item.subTotal();
		}
		
		sb.append("Total price: "  + sum);
		
		return sb.toString();
	}
	
}
