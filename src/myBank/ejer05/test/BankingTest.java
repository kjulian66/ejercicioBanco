package myBank.ejer05.test;

import myBank.ejer05.domain.Account;
import myBank.ejer05.domain.Customer;
import myBank.ejer05.domain.Bank;

public class BankingTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		bank.addCustomer("Jane", "Simms");
		bank.addCustomer("Owen", "Bryant");
		bank.addCustomer("Tim", "Soley");
		bank.addCustomer("Maria", "Soley");
		
		bank.showCustomers();
		bank.showNumberOfCustomers();
		
	}

}
