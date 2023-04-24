package myBank.ejer05.domain;

public class Bank {
	
	//Atributos
	private Customer[] customers;
	private int numberOfCustomers;
	
	//Constructores
	public Bank() {
		this.customers = new Customer[10];
		this.numberOfCustomers = 0;
	}
	
	//Getters y Setters
	public Customer[] getCustomers() {
		return customers;
	}
	
	public void setCustomers(Customer[] customers) {
		this.customers = customers;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public void setNumberOfCustomers(int numberOfCustomers) {
		this.numberOfCustomers = numberOfCustomers;
	}
	
	//Add Customer
	public void addCustomer (String firstName, String lastName) {
		for (int i=0; i<customers.length; i++) {
			if (customers[i] == null) {
				Customer customer = new Customer(firstName, lastName);
				customers[i]=customer;
				numberOfCustomers++;
				break;
			}
		}
	}
	
	public Integer showNumberOfCustomers() {
		System.out.println("El numero de Customers es: " + numberOfCustomers);
		return numberOfCustomers;
	}
	
	public void showCustomers() {
		for (int i=0; i<customers.length; i++) {
			if (customers[i]!=null) {
				System.out.println(customers[i].getFirstName() + customers[i].getLastName() + " Se encuentra en la posicion " + i);
			}
		}
	}
	

}
