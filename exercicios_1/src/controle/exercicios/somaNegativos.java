package controle.exercicios;

import java.util.Scanner;

public class somaNegativos {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Caso queira sair digite um número negativo!");
		System.out.print("Digite um numero: ");
		double num = input.nextDouble();
		
		double soma = 0;
		
		while (num >= 0) {
			
			soma += num;
			
			System.out.printf("Soma total é: %.2f", soma);
		
			System.out.println("");
			System.out.print("\nDigite um numero: ");
			num = input.nextDouble();
			
			
		}
		
		System.out.println("\nEncerrado.");
		System.out.println("Soma final: " + soma);
		
		
		input.close();
		
	}
}
