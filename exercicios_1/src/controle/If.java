package controle;

import java.util.Scanner;

public class If {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe a média: ");
		double media = input.nextDouble();
		
		if (media <= 10 && media >= 7.0) {
			System.out.println("APROVADO");
		} else if (media >= 0 && media < 7 ) { 
			System.out.println("REPROVADO");
		} else {
			System.out.println("Valor inválido");
		}
		
		input.close();
		
	} 
}
