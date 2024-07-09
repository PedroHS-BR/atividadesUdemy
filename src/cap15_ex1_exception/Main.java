package cap15_ex1_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, initialBalance, withdrawLimit);
			
			System.out.print("Enter amount for withdraw: ");
			account.withdraw(sc.nextDouble());
			System.out.println("New balance: " + account.getBalance());
		}
		catch (InputMismatchException e) {
			System.out.println("VALOR INVALIDO!");
		}
		catch (DomainException e) {
			System.out.println(e.getMessage());
		}
		
		sc.close();

	}

}
