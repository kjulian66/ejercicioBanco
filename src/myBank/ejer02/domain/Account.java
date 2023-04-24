package myBank.ejer02.domain;

public class Account {
	
	//Atributos	
	private Double balance;

	//Constructores
	public Account() {
		this.balance = 0.0;
	}

	public Account (int balance) {
		this();
		this.balance = Double.valueOf(balance);
	}

	//Getters y Setters
	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
	//Getters y Setters modificados
	public void showBalance() {
		System.out.println("El sado de su cuenta es: $" + balance);
	}
	
	public void deposit (int deposit) {
		this.balance = balance + Double.valueOf(deposit);
		System.out.println("Ha depositado: $" + Double.valueOf(deposit));
	}
	
	public void whitdraw (int whitdraw) {
		if (balance >= whitdraw) {
			this.balance = balance - Double.valueOf(whitdraw);
			System.out.println("Ha retirado: $" + Double.valueOf(whitdraw));
		} else {
			System.out.println("Sin saldo suficiente");
		}
	}
	
}

