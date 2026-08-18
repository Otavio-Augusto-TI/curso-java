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
	
	String alterarQuantidadeItem(int entrada){		
		quantidadeItem =+ entrada; 
		return "Quantidade do " +  nomeItem + " foi alterada para " + quantidadeItem;
	}
	
	String alterarValor(double novoValorItem) {
		double valorItemOld = valorItem;
		valorItem = novoValorItem;
				
		return "Valor de " + nomeItem + "alterou de R$" + valorItemOld + " para R$" + valorItem;
	}
	
	String consultarEstoque() {
		return nomeItem + " tem " + quantidadeItem + " em estoque " + " valor total em estoque é de R$" + valorEmEstoque + " - Status: " + statusItem; 
	}
	
}
