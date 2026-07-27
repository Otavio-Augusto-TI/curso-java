package fundamentos.desafios;

import java.util.Scanner;

public class Temperatura {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Fahrenheit: ");
		double faH = input.nextDouble();
		
		double tempCels = (faH - 32) * 5.0 / 9.0;
			
		System.out.printf("A temperatura %.2fºF em graus Celcius é igual a %.2fºC \n", faH, tempCels );
		
		System.out.print("\nDigite a temperatura em Celcius: ");
		double CeL = input.nextDouble();
		
		double tempFah = (CeL * (9.0/5.0)) + 32;
		
		System.out.printf("A temperatura %.2fºC em graus Fahrenheit é igual a %.2fºF ", CeL, tempFah );
		
		
		input.close();
	}
}
