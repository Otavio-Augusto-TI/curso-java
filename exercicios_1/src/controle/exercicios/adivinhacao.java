package controle.exercicios;

import java.util.Scanner;

public class adivinhacao {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Jogo de adinhação");
		
		int max = 10;
		int min = 1;
		int range = max - min + 1;
		
		for (int i = 0; i <= 10; i++) {
			int rand = (int)(Math.random() * range) + min;
			
			System.out.print("Digite seu palpite: ");
			int palpite = input.nextInt();
			
			System.out.println(rand);
			if (palpite == rand) {
				System.out.println("Parabéns, você acertou!!");
				break;
			} else {
				System.out.printf("Erro, você tem mais %d tentativas \n", 10 - i );
			}
						
		}
		
		System.out.println("Fim de jogo.");
		input.close();
	}
}
