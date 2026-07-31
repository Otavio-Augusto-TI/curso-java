package controle;

public class switchSemBreak {
	public static void main(String[] args) {
		
		// if(bool) ...
		// while(bool) ...
		// for(;bool;) ...
		
		String faixa = "vermelha";
		
		switch (faixa.toLowerCase()) {
		case "preta": // todos os abaixos serão executados, por falta do Break
			System.out.println("Sei o Bassai-Dai...");
		case "marrom":
			System.out.println("Sei o Tekki Shodan");
		case "roxa":
			System.out.println("Sei o Heain Godan");
		case "verde":
			System.out.println("Sei o Heian Yodan");
		case "laranja": 
			System.out.println("Sei o Heian Sandan");
		case "vermelha":
			System.out.println("Sei o Heian Nidan");
		case "amarela":
			System.out.println("Sei o Heian Shodan");
			break;
		default:
			System.out.println("Não sei de nada");
		}
		
		System.out.println("Fim");
		
		int idade = 1;
		
		switch (idade) {
		case 3:
			System.out.println("Sabe falar");
		case 2:
			System.out.println("Sabe andar");
		case 1:
			System.out.println("Sabe respirar");
		}
		
		
	}
}
