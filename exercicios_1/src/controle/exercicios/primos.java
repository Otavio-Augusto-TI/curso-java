package controle.exercicios;

import java.util.Scanner;

public class primos {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		int primos = input.nextInt();
		
		int multi = 0;
		
		
		for (int i = 2; i <= primos; i++) {
			if (primos % i == 0) {
				multi++;
			}	
		}
		
		if (multi == 1) {
			System.out.println(primos + " é primo");
		} else {
			System.out.println(primos + " não é primo");
		}
		
		input.close();
		
	}
}
