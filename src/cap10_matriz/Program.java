package cap10_matriz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		List<String> list = new ArrayList<>();
		
		int[][] matriz = new int[m][n];
		
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}
		int num = sc.nextInt();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (num == matriz[i][j]) {
					char[] c = {(char)(i + 48), (char)(j + 48)};
					list.add(String.copyValueOf(c));
				}
			}
		}
		for (String x: list) {
			System.out.println("Position " + x.charAt(0) + "," + x.charAt(1) + ":");
			if (x.charAt(0) - 48 > 0) System.out.println("Up: " + matriz[x.charAt(0) - 49][x.charAt(1) - 48]);
			if (x.charAt(1) - 48 > 0) System.out.println("Left: " + matriz[x.charAt(0) - 48][x.charAt(1) - 49]);
			if (x.charAt(1) - 48 < n - 1) System.out.println("Right: " + matriz[x.charAt(0) - 48][x.charAt(1) - 47]);
			if (x.charAt(0) - 48 < m - 1) System.out.println("Down: " + matriz[x.charAt(0) - 47][x.charAt(1) - 48]);
		}
		sc.close();
	}

}
