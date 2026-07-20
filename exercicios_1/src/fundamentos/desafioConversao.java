package fundamentos;

import java.util.Scanner;

public class desafioConversao {
	public static void main(String[] args) {
		// Pegar 3 strings, ultimos 3 salarios, calcular a media, e separar as casas tanto com . e ,
		Scanner input = new Scanner(System.in);
			
		System.out.println("Informe o Primeiro salário: ");
		String sal1 = input.next().replace(",", ".");

		System.out.println("Informe o Segundo salário: ");
		String sal2 = input.next().replace(",", ".");
		
		System.out.println("Informe o Terceiro salário: ");
		String sal3 = input.next().replace(",", ".");

		
		double salnum1 = Double.parseDouble(sal1);
		double salnum2 = Double.parseDouble(sal2);
		double salnum3 = Double.parseDouble(sal3);
		
		Double media = (salnum1 + salnum2 + salnum3) / 3;
		
		System.out.printf("A média dos seus ultimos três mesês é: %.2f", media);
		
		input.close();
		
	}
}
