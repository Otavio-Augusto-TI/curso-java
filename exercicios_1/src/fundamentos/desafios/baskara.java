
package fundamentos.desafios;

public class baskara {
	public static void main(String[] args) {
		
		int a = 1;
		int b = 12;
		int c = -13;
		
		double delta = Math.pow(b, 2) - (4 * a * c);
		
		
		double x1 = (-b + Math.sqrt(delta)) / 2*a;
		double x2 = (-b - Math.sqrt(delta)) / 2*a;
		
		System.out.println("O delta desta equação é: " + delta);
		System.out.println("O X1 desta equação é: " + x1);
		System.out.println("O X2 desta equação é: " + x2);
		
	}
}
