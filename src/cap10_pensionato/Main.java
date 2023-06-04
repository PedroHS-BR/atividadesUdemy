package cap10_pensionato;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		Room[] bedrooms = new Room[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println("Rent #" + (i + 1));
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int room = sc.nextInt();
			sc.nextLine();
			bedrooms[room] = new Room(name, email);
		}
		
		System.out.println("Busy rooms: ");
		for (int i = 0; i < 10; i++) {
			if (bedrooms[i] != null) {
				System.out.println(i + ": " + bedrooms[i].getName() + ", " + bedrooms[i].getEmail());
			}
		}

		sc.close();
	}

}
