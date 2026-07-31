package controle;

import java.util.Scanner;

public class desafioDiaSemana {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Digite o dia da semana: ");
		String diaSemana = input.nextLine().trim().toLowerCase();
		
		if (diaSemana.equals("domingo")) {
			System.out.println(diaSemana + " - 1");
		} else if (diaSemana.equals("segunda")) {
			System.out.println(diaSemana + " - 2");	
		} else if (diaSemana.equals("terça") || diaSemana.equals("terca")){ 
			System.out.println(diaSemana + " - 3");				
		} else if (diaSemana.equals("quarta")) {
			System.out.println(diaSemana + " - 4");							
		} else if (diaSemana.equals("quinta")) {
			System.out.println(diaSemana + " - 5");										
		} else if (diaSemana.equals("sexta")) {
			System.out.println(diaSemana + " - 6");													
		} else if (diaSemana.equals("sábado") || diaSemana.equals("sabado")) {
			System.out.println(diaSemana + " - 7");													
		} else {
			System.out.println("Dia incorreto: " + diaSemana);
		}
		
		input.close();
	}
}
