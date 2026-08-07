package controle.exercicios;

import java.util.Scanner;

public class verMaior {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int maior = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.printf("Digite o %dº número: ", i);
			int num = input.nextInt();
			
			if (num > maior) {
				maior = num;
			}
		
			
		}
		
		System.out.println("O maior número foi: " + maior);
		
		input.close();
		
	}
}
