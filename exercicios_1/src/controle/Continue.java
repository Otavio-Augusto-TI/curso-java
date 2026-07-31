package controle;

public class Continue {
	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) {
				continue; // quando é encotrado ele interrompe a atual repetição e já incia a proxima
			}
			
			System.out.println(i);
		}
		
		for (int i = 0; i < 10; i++) {
			if (i == 5) continue; // quando é encotrado ele interrompe a atual repetição e já incia a proxima
			System.out.println(i);
		}
	}
}
