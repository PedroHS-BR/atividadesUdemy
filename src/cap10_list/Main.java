package cap10_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		boolean bool;
		
		for (int i = 0; i < n; i++) {
			bool = true;
			System.out.println("\nEmplyoee #" + (i + 1) + ":");
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			sc.nextLine();
			for (Employee x : list) {
				if (id.equals(x.getId())) {
					System.out.println("Id already taken!");
					i--;
					bool = false;
					break;
				}
			}
			if (bool) {
				System.out.print("name: ");
				String name = sc.nextLine();
				System.out.print("Salary: ");
				Double salary = sc.nextDouble();
				list.add(new Employee(id, name, salary));
			}
		}
		
		System.out.print("\nEnter the employee id that will have salary increase:");
		Integer id = sc.nextInt();
		bool = true;
		for (Employee x : list) {
			if (id.equals(x.getId())) {
				System.out.print("Enter the percentage: ");
				x.increaseSalary(sc.nextDouble());
				bool = false;
				break;
			}
		}
		if (bool) System.out.println("This id does not exist! \n");
		System.out.println("\nList of employees:");
		for (Employee x : list) {
			System.out.println(x);
		}
		sc.close();
		
	}

}
