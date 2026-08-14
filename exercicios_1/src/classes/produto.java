package classes;

public class produto {

	String nome;
	double preco;
	double desconto;
	
	double precoDesconto () {
		return preco * desconto;
	}
	
}
