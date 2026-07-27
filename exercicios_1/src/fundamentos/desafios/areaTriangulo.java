package fundamentos.desafios;

import java.util.Scanner;

public class areaTriangulo {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o valor da base do Triângulo: ");
		double base = input.nextDouble();
		
		System.out.print("Digite o valor da base do Triângulo: ");
		double altura = input.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.printf("Area do triângulo: %.2f", area);
		
		
		input.close();
		
	}
}
