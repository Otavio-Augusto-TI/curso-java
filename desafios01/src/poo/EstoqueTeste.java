package poo;

import java.util.Scanner;

public class EstoqueTeste {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Estoque item1 = new Estoque("Notebook", 5, 3500.99);
		
		//System.out.println(item1.adicionaItem(5));
		//System.out.println(item1.alterarValor(4250.99));
		//System.out.println(item1.removeItem(3));
		
		//System.out.println(item1.consultarEstoque());
		
		int escolha = 0;
		
		while(escolha != 5) {
			
			System.out.println("[1] - Adicionar item");
			System.out.println("[2] - Remover item");
			System.out.println("[3] - Alterar Valor");
			System.out.println("[4] - Consultar estoque");
			System.out.println("[5] - Sair");

			System.out.println("Oque deseja fazer? ");
			escolha = input.nextInt();
			
			switch (escolha){
			case 1:
				
			}
		}
		
		input.close();
		
		
	}
}
