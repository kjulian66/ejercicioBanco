package myBank.ejer05.domain;

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
	
	public Boolean deposit (Double deposit) {
		this.balance = balance + deposit;
		if (this.balance >= 0) {
			System.out.println("Ha depositado: $" + deposit + " " + true);
			return true;
		} else {
			System.out.println("No se pudo realizar la transaccion: \nEl deposito no alcanza a cubrir la deuda " + false);
			return false;
		}
	}
	
	public Boolean whitdraw (Double whitdraw) {
		if (balance >= whitdraw) {
			this.balance = balance - whitdraw;
			System.out.println("Ha retirado: $" + whitdraw + " " + true);
			return true;
		} else {
			System.out.println("No se pudo realizar la transaccion: \nSaldo insuficiente " + false);
			return false;
		}
	}
	
}