package myBank.ejer03.domain;

public class Account {
	
	//Atributos
	private Double balance;

	public Account() {
		this.balance = 0.0;
	}

	//Constructores
	public Account (Double balance) {
		this();
		this.balance = balance;
	}

	public Double getBalance() {
		return balance;
	}

	//Getters y Setters
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	//Getters y Setters modificados
	public void showBalance() {
		System.out.println("El sado de su cuenta es: $" + balance);
	}
	
	public void deposit (Double deposit) {
		this.balance = balance + deposit;
		System.out.println("Ha depositado: $" + deposit);
	}
	
	public void whitdraw (Double whitdraw) {
		if (balance >= whitdraw) {
			this.balance = balance - whitdraw;
			System.out.println("Ha retirado: $" + whitdraw);
		} else {
			System.out.println("Sin saldo suficiente");
		}
	}
	
}