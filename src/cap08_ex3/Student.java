package cap08_ex3;



public class Student {
	private String name;
	private double n1;
	private double n2;
	private double n3;
	
	public Student(String name, double n1, double n2, double n3) {
		this.name = name;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
	}
	
	
	public String getName() {
		return name;
	}


	public double finalGrade() {
		return this.n1 + this.n2 + this.n3;
	}
	public void missingPoints() {
		if (this.finalGrade() < 60) {
			System.out.println("FAILED");
			System.out.println("MISSING " + (60 - this.finalGrade()) + " POINTS");
		}
		else System.out.println("PASS");
	}
	
	
}
