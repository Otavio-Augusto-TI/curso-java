package fundamentos.operadores;

public class relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b); // IGUAL
		System.out.println(30 != 7); // DIFERENTE
		System.out.println(3 > 4); // MAIOR QUE..
		System.out.println(3 >= 3); // MAIOR OU IGUAL A..
		System.out.println(3 < 7); // MENOR QUE..
		System.out.println(30 <= 7); // MENOR OU IGUAL A..
		
		double nota = 6.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
	}
}
