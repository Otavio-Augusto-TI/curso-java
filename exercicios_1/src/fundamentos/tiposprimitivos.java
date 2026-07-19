package fundamentos;

public class tiposprimitivos {
	public static void main(String[] args) {
		// Informações do funcionario
		
		// Tipos númericos inteiros
		byte anosDeEmpresa = 23;
		short numerosDeVoos = 542;
		int id = 56789;
		long pontosAcomulados = 3_234_845_223L; //Quando passar do valor de int colocar 'L' no fim; apenas em literal(SEM ENTRADA DE USUÁRIO, VINDO DO CÓDIGO)
		
		// Tipos númericos reais;
		float salario = 11_445.44F; //literal Float com 'F' no fim
		double vendasAcomuladas = 2_991_797_103.01;
		
		// Tipo booleano
		boolean estaDeFerias = false; // true
		
		// Tipo caractere
		char status = 'A'; // ativo, aceita apenas um caracter ex. 'S' não 'Sim'
		
		// Dias de empresa 
		System.out.println("Dias de empresa:" + anosDeEmpresa * 365);
		
		// Números de viagem
		System.out.println("Viages:" + 542 / 2);
		
		// Pontos por real
		System.out.println("Ganho pontos:" + pontosAcomulados / vendasAcomuladas);
		
		System.out.println(id + " ganha: " + salario);
	
		System.out.println("Está de ferias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
	}
}
