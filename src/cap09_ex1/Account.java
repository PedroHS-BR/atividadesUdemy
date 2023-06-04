package cap09_ex1;

import java.util.Scanner;

public class Account {
	
	private int accNumber;
	private String accHolder;
	private double balance;
	private Scanner sc = new Scanner(System.in);
	
	public Account() {
		System.out.print("Enter account number: ");
		this.accNumber = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		this.accHolder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		if (sc.next().charAt(0) == 'y') {
			System.out.print("Enter initial deposit value: ");
			this.deposit(sc.nextDouble());
		}
	}
	
	public String toString() {
		return "Account " + this.accNumber + ", Holder: " + this.accHolder + ", Balance: $ " + this.balance;
	}
	
	public void deposit(double value) {
		this.balance += value;
	}
	
	public void withdraw(double value) {
		this.balance -= value + 5;
	}
}
