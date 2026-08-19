package poo;

public class Conta {
	
	int numero;
	String titular;
	double saldo;
	static int quatidadeContas;
	
	Conta(int numeroInicial, String titularInicial){
		numero = numeroInicial;
		titular = titularInicial;
		saldo = 0;	
		quatidadeContas++;
	}

	double depositar(double deposito) {
		return saldo += deposito;
	}
	
	String sacar(double saque) {
		if (saque > saldo) {
			return titular + " Sem valor em conta. Valor em conta: R$ " + saldo;
		}
		
		saldo -= saque;
		return titular + " Saque realizado com sucesso: R$ " + saldo;
	}
	
	String consultarSaldo() {
		return titular + " Você tem R$" + saldo + " disponível em sua conta";
	}
	
	static int getQuantidadeConta() {
		return quatidadeContas;
	}

	
}
