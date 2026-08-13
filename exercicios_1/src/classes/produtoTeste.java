package classes;

public class produtoTeste {
	
	public static void main(String[] args) {		
		
		
		// NOME DA CLASSE IGUAL O NOME DO CONSTRUTOR
		// NEM SEMPRE SERÁ IGUAL
	//	Classe           Construtor
		produto p1 = new produto();
		p1.nome = "Notebook";
		p1.preco = 4356.89;
		p1.desconto = 0.25;
		
		double valorFinal1 = p1.preco - (p1.preco * p1.desconto);
		
		var p2 = new produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.56;
		p2.desconto = 0.29;
	
		double valorFinal2 = p2.preco - (p2.preco * p2.desconto);

		System.out.println(p1.nome);
		System.out.println(p2.nome);
		
		System.out.printf("Desconto do %s é de %.2f valor final fica de R$%.2f \n", p1.nome, p1.preco * p1.desconto, valorFinal1);
		System.out.printf("Desconto do %s é de %.2f valor final fica de R$%.2f ", p2.nome, p2.preco * p2.desconto, valorFinal2);
		
		
	}
}
