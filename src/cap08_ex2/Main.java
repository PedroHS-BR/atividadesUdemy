package cap08_ex2;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Employee employee = new Employee();
		System.out.println("Employee: " + employee.getName() + ", $ " + employee.netSalary());
		System.out.print("Which percentage to increase salary? ");
		employee.increaseSalary(sc.nextDouble());
		System.out.println("Updated data: " + employee.getName() + ", $ " + employee.netSalary());
		sc.close();

	}

}
