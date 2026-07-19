package fundamentos;

public class PrimitivoXObjeto {
	public static void main(String[] args) {
		
		String s = new String("Texto"); // CHAMADO DE OBJETO
		s.toLowerCase(); // Atribitos apenas nos objetos
		
		// Wrappers são a versão objeto dos tipos primitivos!
		int a = 123; // NÃO É OBJETO
		System.out.println(a);
	
		// Tudo em Java é objeto menos os 8 tipos primitvos
	}
}
