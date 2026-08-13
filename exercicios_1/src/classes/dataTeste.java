package classes;

public class dataTeste {
// Instanciar duas datas;
	
	public static void main(String[] args) {
		
		data date1 = new data();
		
		date1.dia = 9;
		date1.mes = 12;
		date1.ano = 2008;
		
		System.out.printf("%d/%d/%d", date1.dia, date1.mes, date1.ano);
		System.out.println();
		
		data date2 = new data();
		
		date2.dia = 9;
		date2.mes = 12;
		date2.ano = 2026;
	
		System.out.printf("%d/%d/%d", date2.dia, date2.mes, date2.ano);

	}
	
}
