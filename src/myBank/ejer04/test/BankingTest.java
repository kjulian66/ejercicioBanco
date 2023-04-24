package myBank.ejer04.test;

import myBank.ejer04.domain.Account;
import myBank.ejer04.domain.Customer;

public class BankingTest {

	public static void main(String[] args) {
		
		Customer julianBianchi = new Customer("Julian", "Bianchi");
		julianBianchi.setAccount(new Account(500.0));
		julianBianchi.getAccount().whitdraw(150.0);
		julianBianchi.getAccount().deposit(22.50);
		julianBianchi.getAccount().whitdraw(47.62);
		julianBianchi.getAccount().whitdraw(400.00);
		System.out.println(julianBianchi.getFirstName()+ " " +julianBianchi.getLastName());
		julianBianchi.getAccount().showBalance();
	}

}
