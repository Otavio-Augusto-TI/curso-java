package fundamentos.desafios;

import java.util.Scanner;

public class cuboQuadrado {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double num = input.nextDouble();
		
		double numQ = Math.pow(num, 2);				
		double numC = Math.pow(num, 3);				
	
		System.out.printf("%.1f ao Quadrado é: %.1f", num, numQ);
		System.out.printf("\n%.1f ao Cubo é: %.1f", num, numC);
		
		input.close();
	}
}
