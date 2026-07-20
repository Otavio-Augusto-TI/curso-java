package fundamentos;

import javax.swing.JOptionPane;

public class conversaoStringNumero {
	public static void main(String[] args) {
		
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número:");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número:");
		
		System.out.println(valor1 + valor2);
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		
		System.out.printf("A soma é: %f", soma);
		System.out.printf("\nA media é: %.2f", soma / 2);
		
		
		
	}
}
