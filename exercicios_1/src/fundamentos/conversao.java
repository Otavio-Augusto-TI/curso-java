package fundamentos;

public class conversao {
	public static void main(String[] args) {
		
		double a = 1.16118464866; // Implicita
		System.out.println(a);
		
		float b = (float) 1.16118464866; // Explicita (Cast) EVITAR USAR
		System.out.println(b);
		
		int c = 1000;
		byte d = (byte) c; // Explicita (Cast) EVITAR USAR
		System.out.println(d);
		
		double e = 1.9990;
		int f = (int) e; // Explicita (Cast) EVITAR USAR
		System.out.println(f);
	}
}
