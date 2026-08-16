package desafios.logica;

import java.util.Scanner;

public class divisores {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int somaDivisor = 0;
		
		System.out.print("Digite um número: ");
		int num = input.nextInt();

		System.out.print("Divisores: ");
		for (int i = 1; i < num; i++) {
			if (num % i == 0) {
				somaDivisor += i;
				System.out.print(i + " ");
			}		
		}				
		System.out.println();
		System.out.println("Soma dos Divisores: " + somaDivisor);
		
		if (somaDivisor == num) {
			System.out.printf("%d é número perfeito!", num);
		} else {
			System.out.printf("%d não é número perfeito!", num);
		}
		
		input.close();
	}
}
