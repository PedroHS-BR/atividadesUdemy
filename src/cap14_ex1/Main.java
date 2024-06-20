package cap14_ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Product> lista = new ArrayList<>();
		System.out.print("Enter the number of products: ");
		int quantity = sc.nextInt();
		char itemType;
		
		for (int i = 1; i <= quantity; i++) {
			System.out.println("Product #" + i + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			while (true) {
				itemType = sc.next().charAt(0);
				if (itemType == 'c' || itemType == 'u' || itemType == 'i') break;
				else {
					System.out.println("\nValor invalido, tente novamente!");
					System.out.print("Common, used or imported (c/u/i)? ");
				}
			}
			sc.nextLine();
			System.out.print("Name: ");
			String itemName = sc.nextLine();
			System.out.print("Price: ");
			Double itemPrice = sc.nextDouble();
			if (itemType == 'c') {
				lista.add(new Product(itemName, itemPrice));
			}
			else if (itemType == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				sc.nextLine();
				String data = sc.nextLine();
				LocalDate itemData = LocalDate.parse(data, formatter);
				lista.add(new UsedProduct(itemName, itemPrice, itemData));
			}
			else {
				System.out.print("Customs fee: ");
				double customFee = sc.nextDouble();
				lista.add(new ImportedProduct(itemName, itemPrice, customFee));
			}
			
		}
		
		for (Product e: lista) {
			System.out.println(e.priceTag());
		}
		
		
		sc.close();

	}

}
