package controle;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {
		
		// if (...) sentenca; ou {}
		// while (...) sentenca; ou {}
		// for(variavel; senteca; incremento) ;
		
		// do sentenca; ou {} while(...);
		
		
		Scanner input = new Scanner(System.in);
		
		String texto = "";
		
		do {
			System.out.print("Voce precisa falar as palavras mágicas: ");
			texto = input.nextLine();
			
		} while (!texto.equalsIgnoreCase("por favor"));
		
		
		System.out.println("Obrigado!");
		
		input.close();
	}
}
