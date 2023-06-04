package cap10_list;

public class Employee {
	private Integer id;
	private String name;
	private Double salary;
	
	public Employee(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	public void increaseSalary(double percentage) {
		this.salary += (percentage / 100 ) * salary; 
	}

	
	
	public Integer getId() {
		return this.id;
	}
	
	public String toString() {
		return this.id + ", " + this.name + ", " + this.salary;
	}
}
