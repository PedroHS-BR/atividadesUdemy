package cap08_ex1;

import java.util.Scanner;

public class Rectangle {
	private double width;
	private double height;
	
	private Scanner sc = new Scanner(System.in);
	public Rectangle() {
		System.out.println("Enter rectangle width and height: ");
		this.width = sc.nextDouble();
		this.height = sc.nextDouble();
	}
	
	public double area() {
		return this.width * this.height;
	}
	
	public double perimeter() {
		return this.width * 2 + this.height * 2;
	}
	
	public double diagonal() {
		return Math.sqrt(this.height * this.height + this.width * this.width);
	}
	
}
