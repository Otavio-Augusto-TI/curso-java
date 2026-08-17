package classes;

public class produto {

	String nome;
	double preco;
	static double desconto = 0.25;
	
	produto(){
		
	}

	produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	double precoDesconto () {
		return preco * desconto;
	}
	
}
