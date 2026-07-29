package controle;

import java.util.Scanner;

public class IfElse {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Informe um número: ");
		String valor = input.next();
		
		int numero = Integer.parseInt(valor);
		
		if (numero % 2 == 0) {
			System.out.println(numero + " É PAR");
		} else {
			System.out.println(numero + " É IMPAR");
		}
		 
		
		input.close();
	}
}
