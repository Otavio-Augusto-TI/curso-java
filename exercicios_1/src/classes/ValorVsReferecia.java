package classes;

public class ValorVsReferecia {
	public static void main(String[] args) {
		
		double a = 2;
		double b = a; // atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);

		data d1 = new data(1,6,2022);
		data d2 = d1; // atribuição por referencia (objeto)
		
		d1.dia = 31;
		d2.mes = 12;
		
		d1.ano = 2026;
		
		System.out.println(d1.obterDataForm());
		System.out.println(d2.obterDataForm());
		
		voltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataForm());
		System.out.println(d2.obterDataForm());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
		
		double teste = 5;
		teste(teste);
		System.out.println(teste);
	}
	
	static void voltarDataParaValorPadrao(data d) {
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
	}

	static void alterarPrimitivo(int a) {
		a++;
	}
	
	static void teste(double a) {
		a = 10;
	}
}
