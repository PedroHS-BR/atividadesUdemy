package cap13_ex1;

import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Program {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		System.out.println("Enter Client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		String birthDate = sc.next();
		Client c1 = new Client(name, email, birthDate);
		Order order = new Order(OrderStatus.PROCESSING, c1);
		System.out.println("Enter order data:");
		System.out.print("How many items to this order? ");
		int qtd  = sc.nextInt();
		sc.nextLine();
		
		for (int i = 1; i <= qtd; i++) {
			System.out.println("Enter #" + i + " item data:");
			System.out.print("Product name: ");
			String productName = sc.nextLine();
			System.out.print("Product Price: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantity: ");
			int productquantity = sc.nextInt();
			sc.nextLine();
			Product product = new Product(productName, productPrice);
			order.addItem(new OrderItem(productquantity, product));
		}
		
		System.out.println("ORDER SUMMARY:");
		System.out.println("Order moment: " + order.getMoment().format(formatter));
		System.out.println("Order Status: " + order.getStatus());
		System.out.println("Client: " + c1.getName() + "(" + c1.getBirthDate()
				+ ") - " + c1.getEmail());
		System.out.println("Order items:");
		
		double total = 0;
		for (OrderItem c: order.getItems()) {
			System.out.println(c.getProduct().getName()+ ", $" + c.getPrice() + ", Quantity: "
					+ c.getQuantity() + ", Subtotal: $" + c.subTotal());
			total += c.subTotal();
		}
		System.out.println("Total price: $" + total);
		
		
		
		
		sc.close();
	}

}
