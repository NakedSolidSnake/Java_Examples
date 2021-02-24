
public class NullDemo {

	public static void main(String[] args) {
		AbstractCostumer customer1 = CustomerFactory.getCustomer("Rob");
		AbstractCostumer customer2 = CustomerFactory.getCustomer("Bob");
		AbstractCostumer customer3 = CustomerFactory.getCustomer("Julie");
		AbstractCostumer customer4 = CustomerFactory.getCustomer("Laura");
		
		System.out.println("Customers");
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
		System.out.println(customer3.getName());
		System.out.println(customer4.getName());
	}

}
