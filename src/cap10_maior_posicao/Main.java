package cap10_maior_posicao;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		double[] numeros = new double[n];
		double maior = 0;
		int posicao = 0;
		
		for (int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			numeros[i] = sc.nextDouble();
			if (numeros[i] > maior) {
				maior = numeros[i];
				posicao = i;
			}
		}
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSIÇÃO DO MAIOR VALOR = " + posicao);
		
		
		
		sc.close();
	}

}
