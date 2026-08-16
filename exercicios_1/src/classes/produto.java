package classes;

public class produto {

	String nome;
	double preco;
	double desconto;
	
	produto(){
		
	}

	produto(String nomeInicial) {
		nome = nomeInicial;
	}
	
	produto(String nomeInicial, double precoInicial) {
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	produto(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	
	double precoDesconto () {
		return preco * desconto;
	}
	
}
