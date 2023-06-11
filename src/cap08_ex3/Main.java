package cap08_ex3;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		double n1 = sc.nextDouble();
		double n2 = sc.nextDouble();
		double n3 = sc.nextDouble();
		
		Student student = new Student(name, n1, n2, n3);
		System.out.println(student.getName() +" FINAL GRADE = " + student.finalGrade());
		student.missingPoints();
		
		
		sc.close();
	}

}
