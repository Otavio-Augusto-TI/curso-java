package controle;

public class desafioFor {
	public static void main(String[] args) {
		
		String valor = "#";
		
		for (int i = 1; i <= 5; i++) {
			System.out.println(valor);
			valor += "#";
		}
		
		// Versão do desafio
		// Não pode usar valor numerico para controlar o laço
		
		System.out.println("\nVersao desafio\n");
	
		
		
		for (String valor2 = "#"; !valor2.equals("######"); valor2 += "#") {
			System.out.println(valor2);
		}
		
	}
}
