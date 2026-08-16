package classes;

public class data {
// 3 atributos - Dia, mes, ano
	
	int dia;
	int mes;
	int ano;
	
	String obterDataForm() {
		String diaConv = Integer.toString(dia);
		String mesConv = Integer.toString(mes);
		String anoConv = Integer.toString(ano);
		
		return diaConv + "/" + mesConv + "/" + anoConv;
		
		// OU
		
		// return String.format("%d/%d/%d", dia, mes, ano);
	}
	
	// Dois construtores 
	// 1 - Padrão Data = 01/01/1970
	// 2 - COnst recebe dia, mes e ano
	
	data(){
		dia = 01;
		mes = 01;
		ano = 1970;
	}
	
	data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
}
