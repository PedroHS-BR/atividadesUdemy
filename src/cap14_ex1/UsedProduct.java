package cap14_ex1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class UsedProduct extends Product {
	private LocalDate manufactureDate;
	private DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public UsedProduct(String name, double price, LocalDate manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		return this.getName() + " (used) $ " + this.getPrice() 
		+ " manufacture date: " + manufactureDate.format(formatter);
	}
}
