package cap09_ex1;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account = new Account();
		
		System.out.println("\nAccount data:");
		System.out.println(account);
		System.out.print("\nEnter a deposite value: ");
		account.deposit(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		System.out.print("\nEnter a withdraw value: ");
		account.withdraw(sc.nextDouble());
		
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		sc.close();
	}

}
