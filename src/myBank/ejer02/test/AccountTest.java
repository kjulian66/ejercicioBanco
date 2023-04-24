package myBank.ejer02.test;

import myBank.ejer02.domain.Account;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account (100);
		account.deposit(47);
		account.whitdraw(150);
		account.showBalance();
	}

}
