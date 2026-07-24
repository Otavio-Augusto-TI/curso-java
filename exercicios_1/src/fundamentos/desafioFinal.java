package fundamentos;

import java.util.Scanner;

public class desafioFinal {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("============================================");
		System.out.println("		CALCULADORA");
		System.out.println("============================================");
		
		System.out.print("Digite o primeiro número: ");
		double num1 = input.nextDouble();
		
		System.out.print("Digite qual operação você deseja utilizar: ");
		String ope = input.next();
		
		System.out.print("Digite o Segundo número: ");
		double num2 = input.nextDouble();
		
		double resultado = "+".equals(ope) ? num1 + num2 : 0;
		resultado = "-".equals(ope) ? num1 - num2 : resultado;
		resultado = "*".equals(ope) ? num1 * num2 : resultado;
		resultado = "/".equals(ope) ? num1 / num2 : resultado;
		resultado = "%".equals(ope) ? num1 % num2 : resultado;
		
		
		System.out.printf("O resultado de %.2f %s %.2f é = %.2f", num1 , ope, num2, resultado );
		
		
		input.close();
	}
}
