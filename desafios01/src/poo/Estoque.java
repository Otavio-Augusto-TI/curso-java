package poo;

public class Estoque {

	String nomeItem;
	int quantidadeItem;
	double valorItem;
	boolean statusItem;
	double valorEmEstoque = quantidadeItem * valorItem; 
	
	
	Estoque(String nomeItem, int quantidadeItem, double valorItem){ 
		this.nomeItem = nomeItem;
		this.quantidadeItem = quantidadeItem;
		this.valorItem = valorItem;
		statusItem = true;
	}
	
	String adicionaItem(int entrada){		
		quantidadeItem = quantidadeItem + entrada; 		
		return String.format("Entrada de: %d em estoque do item %s. Estoque atual: %d", entrada, nomeItem, quantidadeItem);
	}
	
	String removeItem (int saida) {
		quantidadeItem = quantidadeItem - saida;
		return String.format("Saida de: %d em estoque do item %s. Estoque atual: %d", saida, nomeItem, quantidadeItem);
	}

	String alterarValor(double novoValorItem) {
		double valorItemOld = valorItem;
		valorItem = novoValorItem;		
		return String.format("Valor de %s alterou de R$%.2f  para R$%.2f",nomeItem, valorItemOld, valorItem);
	}
	
	
	String consultarEstoque() {
		return String.format("O item: %s tem %d em estoque, o valor total em estoque é de R$%.2f; Status: %b", nomeItem, quantidadeItem, quantidadeItem * valorItem, statusItem);
	}
	
}
