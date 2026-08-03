package controle.exercicios;

import java.util.Scanner;

public class par {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o número: ");
		double num = input.nextDouble();
		
		if (num % 2 == 0) {
			System.out.println(num + " é par");
		} else {
			System.out.println(num + " é impar");
		}
		
		if (num <= 10 && num >= 0) {
			System.out.println(num + " está entre 0 e 10");
		}
		
		input.close();
		
	}
}
