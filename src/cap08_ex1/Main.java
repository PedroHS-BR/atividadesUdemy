package cap08_ex1;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Rectangle rectangle = new Rectangle();
		
		System.out.println("AREA = "+ rectangle.area());
		System.out.println("PERIMETER = " + rectangle.perimeter());
		System.out.println("DIAGONAL = " + rectangle.diagonal());
	}

}
