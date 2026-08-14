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
	
}
