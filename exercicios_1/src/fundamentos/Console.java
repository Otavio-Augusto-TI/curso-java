package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		// Print apenas mostra no console
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		// Println pula uma linha no fim
		System.out.println("Bom");
		System.out.println("dia!");
		
		// Printf para formatar
		System.out.printf("Megasena: %d %d %d %d %d %d %d %n", 1,2,3,4,5,6,7); 
		
		System.out.printf("Salario: %.1f %n", 1234.5678);
		
		System.out.printf("Nome: %s %n","João");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.print("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.print("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.printf("Nome: %s %s", nome, sobrenome);
		System.out.printf("\nIdade: %s",idade);
		
		
		entrada.close(); //Sempre fechar
		
	}
}
