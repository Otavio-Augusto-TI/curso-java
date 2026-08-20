package classes;

public class data {
// 3 atributos - Dia, mes, ano
	
	// Valore padrões tipos
	// byte, short, int, long > 0;
	// float, double > 0
	// boolean > false
	// char > '\u0000'
	// Objetos > null / String s = null

	int dia;
	int mes;
	int ano;
	
	final int x;
	
	data(){
		// dia = 01;
		// mes = 01;
		// ano = 1970;
		
		this(1,1,1970);
		
		// int a;
		
		// a = 0;
		
		String s = null;
		System.out.println(s);
		
	}
	
	data(int dia, int mes, int ano){
		this(12, 2005); // chamando o construtor com dois parametros
		
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	data(int mes, int ano){
		x = 100;		
		
	}
	
	String obterDataForm() {
		//String diaConv = Integer.toString(dia);
		//String mesConv = Integer.toString(mes);
		//String anoConv = Integer.toString(ano);
		
		// return diaConv + "/" + mesConv + "/" + anoConv;
		
		// OU
		
		final String formato = "%d/%d/%d";
		return String.format(formato, dia, mes, ano);
	}
	
	// Dois construtores 
	// 1 - Padrão Data = 01/01/1970
	// 2 - COnst recebe dia, mes e ano
	
	 
}
