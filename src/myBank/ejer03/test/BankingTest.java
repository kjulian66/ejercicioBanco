package myBank.ejer03.test;

import myBank.ejer03.domain.Account;
import myBank.ejer03.domain.Customer;

public class BankingTest {

	public static void main(String[] args) {
		
		Customer julianBianchi = new Customer("Julian", "Bianchi");
		julianBianchi.setAccount(new Account(500.0));
		julianBianchi.getAccount().whitdraw(150.0);
		julianBianchi.getAccount().deposit(22.50);
		julianBianchi.getAccount().whitdraw(47.62);
		System.out.println(julianBianchi.getFirstName()+ " " +julianBianchi.getLastName());
		julianBianchi.getAccount().showBalance();
	}

}
