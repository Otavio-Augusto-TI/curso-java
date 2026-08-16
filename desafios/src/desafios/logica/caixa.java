package desafios.logica;

import java.util.Scanner;

public class caixa {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int cont100 = 0;
		int cont50 = 0;
		int cont20 = 0;
		int cont10 = 0;
		int cont5 = 0;
		int cont2 = 0;

		System.out.print("Qual valor deseja sacar: ");
		double saque = input.nextDouble();
		
			while (saque >= 100) {
				saque = saque - 100;
				cont100++;
			}

			while (saque >= 50) {
				saque = saque - 50;
				cont50++;
			}

			while (saque >= 20) {
				saque = saque - 20;
				cont20++;
			}

			while (saque >= 10) {
				saque = saque - 10;
				cont10++;
			}

			if (saque % 2 != 0 && saque >= 5) {
				cont5++;
				saque = saque - 5;
			}

			if (saque % 2 == 0) {
				while (saque >= 2) {
					saque = saque - 2;
					cont2++;
				}
				
			}


		System.out.println("Cédulas de R$100,00: " + cont100);
		System.out.println("Cédulas de R$50,00: " + cont50);
		System.out.println("Cédulas de R$20,00: " + cont20);
		System.out.println("Cédulas de R$10,00: " + cont10);
		System.out.println("Cédulas de R$5,00: " + cont5);
		System.out.println("Cédulas de R$2,00: " + cont2);
		System.out.println(saque);

		input.close();

	}
}
