package poo;

import java.util.Scanner;

public class EstoqueTeste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("##########################################");
		System.out.println("            ESTOQUE CETIS");
		System.out.println("##########################################");
		System.out.println();

		int escolha;
		
		do {
			System.out.println("[0] - Sair");
			System.out.println("[1] - Adicionar Item");
			System.out.println("[2] - Alterar Quantidade");
			System.out.println("[3] - Alterar Valor");
			System.out.println("[4] - Consultar");
			System.out.println();
			
			System.out.print("Oque deseja fazer no sistema: ");
			escolha = input.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.println();
				System.out.println("Digite as informações do produto que deseja adicionar:");
				System.out.println();
				
				System.out.print("Nome do item: ");
				String nome = input.next();
				
				System.out.print("Quantidade do item: ");
				int quantidade = input.nextInt();
				
				System.out.print("Valor do item: ");
				Double valor = input.nextDouble();
				
				
				// Estoque item1 = new Estoque(nome, quantidade, valor);
				// System.out.println(item1.nomeItem + " Cadastrado");
				
				System.out.println();
				System.out.println("Deseja cadastrar um novo item? ");
				
			case 2:
				Estoque item1 = new Estoque(nome, quantidade, valor);
				System.out.println();
				System.out.print("Qual item deseja adicionar quantidade: ");
				nome = input.next();
				System.out.println();
				System.out.print("Digite a nova quantidade do produto:");
				quantidade = input.nextInt();
				System.out.println();
				System.out.println(item1.alterarQuantidadeItem(quantidade));
				
			}
			
		} while(escolha != 0);
		
		input.close();
		
	}
}
