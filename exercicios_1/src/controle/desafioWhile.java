package controle;

import java.util.Scanner;

// Calcular a media de uma turma, sem saber quantos alunos tem a turma (While or Do While)
// Verificar se a nota é valida entre 0 e 10. (If e Else) 
// Armazenar o valor da nota valida em uma variavel notaTotal, sempre que escrito uma nova nota valida adicionar na variavel notaTotal (double)
// uma variavel para contar a quantidade de vezes que foi enviado uma nota valida (int)
// No fim mostrar a media das notas;
// para sair utilizar -1

public class desafioWhile {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int alunos = 0;
		double notaTotal = 0;
		double soma = 0;
		
		while (notaTotal != -1) {
			
			System.out.print("Digite a nota (ou -1 para sair): ");
			notaTotal = input.nextDouble();
		
			if (notaTotal >= 0 && notaTotal <= 10) {
				alunos++;
				// soma += notaTotal;
				soma = soma + notaTotal;
			} else if(notaTotal != -1) {
				System.out.println("Nota invalida tente novamenente");
			}
		
		}
		
		double mediaFinal = soma / alunos;
		System.out.printf("\nMedia: %.2f", mediaFinal);
			
		input.close();

	}
}
