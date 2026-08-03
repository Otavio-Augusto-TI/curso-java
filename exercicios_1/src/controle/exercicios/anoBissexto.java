package controle.exercicios;

public class anoBissexto {
	public static void main(String[] args) {

		int ano = 2010;

		if (ano % 4 == 0 || ano % 400 == 0) {
			System.out.println(ano + " é bissexto");
		} else {
			System.out.println(ano + " não é bissexto");
		}
	}
}
