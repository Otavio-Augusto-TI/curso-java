package fundamentos.operadores;

public class desafioAritimetico {
	public static void main(String[] args) {
		
		double prt1 = 6 * (3+2);
		double prt2 = Math.pow(prt1, 2);
		double prt3 = prt2 / (3*2);
		
		double seg1 = (1-5) * (2-7);
		double seg2 = seg1 / 2;
		double seg3 = Math.pow(seg2, 2);
		

		double valorE = prt3 - seg3;
		double valorF = Math.pow(valorE, 3);
		double valorFinal = valorF / (Math.pow(10, 3));
		
		System.out.println((int) valorFinal);
		
	}
}
