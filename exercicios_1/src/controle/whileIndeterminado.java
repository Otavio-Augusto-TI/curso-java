package controle;

import java.util.Scanner;

public class whileIndeterminado {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite algo: ");
		String palavra = input.nextLine();
		
		while (!palavra.toLowerCase().equals("sair")) {
			System.out.print("Digite novamente: ");
			palavra = input.nextLine();
		}
		
		
		input.close();
	}
}
