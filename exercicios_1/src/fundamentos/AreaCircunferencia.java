package fundamentos;

public class AreaCircunferencia {
	public static void main(String[] args) {
		double raio = 3.4;
		// Colocando 'final' antes do tipo da variavel faz com que ela se torne uma constante.
		final double pi = 3.14159;
		
		double area = pi * raio * raio;
		System.out.println(area);
		
		raio = 10;
		
		area = pi * raio * raio;
		System.out.println("Área = " + area + "m2.");
	}
}
