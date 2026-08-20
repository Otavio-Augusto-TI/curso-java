package classes.deasfioModulo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João", 99.80);
		
		Comida feijao = new Comida("Feijão", 0.300);
		Comida arroz = new Comida("Arroz", 0.180);
		// Comida ovo = new Comida("Ovo", 0.070);

		System.out.println(p1.apresentar());
		p1.comer(arroz);
		
		System.out.println(p1.apresentar());		
		
		p1.comer(feijao);
		
		System.out.println(p1.apresentar());		
		
	}
}
