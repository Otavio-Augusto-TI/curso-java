package controle.exercicios;

import java.util.Scanner;

public class adivinhacao {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Jogo de adinhação");

		int max = 10;
		int min = 1;
		int range = max - min + 1;

		int rand = (int) (Math.random() * range) + min;

		for (int i = 10; i >= 0; i--) {

			System.out.print("Digite seu palpite: ");
			int palpite = input.nextInt();

			if (palpite > rand) {
				System.out.println(palpite + " é maior");
				System.out.println("Tentativas: " + i);
			}

			if (palpite < rand) {
				System.out.println(palpite + " é menor");
				System.out.println("Tentativas: " + i);
			}

			if (palpite == rand) {
				System.out.println("Parabéns, você acertou!!");
				System.out.println("Seu número : " + palpite);
				break;
			}
		}

		System.out.println("Numero: " + rand);
		System.out.println("Fim de jogo.");
		input.close();
	}
}
