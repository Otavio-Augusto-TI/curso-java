package fundamentos.operadores;

public class ternario {
	public static void main(String[] args) {
		
		double media = 4.6;
		String recuperacao = media >= 5.0 ? "em recuperação." : "Reprovado.";
		String resultado = media >= 7.0 ? "Aprovado." : recuperacao; // ? - TRUE; : - FALSE
		
		System.out.println("O aluno está: " + resultado);
		
		
		double nota = 7;
		boolean bomComportamento = true;
		boolean passou = nota >= 7;
		boolean desconto = passou && bomComportamento;
		String resultadoFinal = desconto ? "sim" : "não";
		
		System.out.println("Tem desconto? " + resultadoFinal);
		
	}
}
