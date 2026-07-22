package fundamentos.operadores;

public class desafiologicos {
	public static void main(String[] args) {
		// Trabalho na terça (V Ou F)
		// Trabalho na quarta (V Ou F)
		
		boolean terca = true;
		boolean quarta = true;
		
		boolean tv50 = terca && quarta;
		boolean tv32 = terca ^ quarta;
		boolean sorvete = tv50 || tv32;
		boolean ficarEmCasa = !sorvete;
		
		System.out.println("Comprar TV 50P: " + tv50);
		System.out.println("Comprar TV 32P: " + tv32);
		System.out.println("Tomar sorverte shopping: " + sorvete);
		System.out.println("Ficar em casa: " + ficarEmCasa);
	}
}
