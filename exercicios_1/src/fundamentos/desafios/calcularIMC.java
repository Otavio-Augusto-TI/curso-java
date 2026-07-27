package fundamentos.desafios;

import java.util.Scanner;

public class calcularIMC {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("============================");
		System.out.println("	CALCULAR IMC");
		System.out.println("============================");
		
		System.out.print("Digite seu peso: ");
		double peso = input.nextDouble();
		
		System.out.print("Digite sua Altura: ");
		String alturaST = input.next().replace(",", ".");
		
		System.out.println("==============================================");
		System.out.println("	TABELA IMC");
		System.out.println(" 	MENOR QUE 18,5 (BAIXO PESO)");
		System.out.println(" 	Entre 18,5 e 24,9 (PESO NORMAL)");
		System.out.println(" 	Entre 25,0 e 29,9 (SOBREPESO)");
		System.out.println(" 	Entre 30,0 e 34,9 (OBESIDADE GRAU I)");
		System.out.println(" 	Entre 35,0 e 39,9 (OBESIDADE GRAU II)");
		System.out.println(" 	MAIOR QUE 40,0 (OBESIDADE GRAU III)");
		System.out.println("==============================================");
		
		double altura = Double.parseDouble(alturaST);
		
		double IMC = peso / (altura * altura);		
		
		System.out.printf("SEU IMC: %.2f", IMC);
		
		input.close();
	}
}
