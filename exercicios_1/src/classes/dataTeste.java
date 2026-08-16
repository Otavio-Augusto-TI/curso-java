package classes;

public class dataTeste {
// Instanciar duas datas;
	
	public static void main(String[] args) {
		
		data date1 = new data(31, 12, 2008);
				
		//System.out.printf("%d/%d/%d", date1.dia, date1.mes, date1.ano);
		//System.out.println();
		
		data date2 = new data();
		date2.ano = 2021;
	
		System.out.println(date1.obterDataForm());
		System.out.println(date2.obterDataForm());
		// System.out.printf("%d/%d/%d", date2.dia, date2.mes, date2.ano);

	}
	
}
