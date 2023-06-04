package cap08_ex2;

import java.util.Scanner;

public class Employee {
	private String name;
	private double grossSalary;
	private double tax;
	private Scanner sc = new Scanner(System.in);
	
	public Employee() {
		System.out.print("Name: ");
		this.name = sc.nextLine();
		System.out.print("Gross salary: ");
		this.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		this.tax = sc.nextDouble();
	}
	
	public double netSalary() {
		return this.grossSalary - this.tax;
	}
	
	public void increaseSalary(double percentage) {
		this.grossSalary += this.grossSalary * (percentage / 100);
	}
	
	public String getName() {
		return this.name;
	}

}
