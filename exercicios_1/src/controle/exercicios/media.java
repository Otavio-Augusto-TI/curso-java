package controle.exercicios;

import java.util.Scanner;

public class media {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
				
		System.out.print("Digite a 1º nota: ");
		double nota1 = input.nextDouble();
		
		System.out.print("Digite a 2º nota: ");
		double nota2 = input.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7.0) {
			System.out.println(media + " = Aprovado");
		} else if (media < 7.0 && media >= 4.0) {
			System.out.println(media + " = Recuperação");
		} else {
			System.out.println(media + " = Reprovado" );
		}
				
		input.close();
	}
}
