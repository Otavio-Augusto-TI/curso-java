package poo;

public class ContaTeste {
	public static void main(String[] args) {
		
		Conta conta1 = new Conta(1, "Otavio");
		Conta conta2 = new Conta(2, "Manu");
		
		System.out.println(conta2.consultarSaldo());
		
		conta1.depositar(5000);
		conta2.depositar(200);
		
		System.out.println(conta1.consultarSaldo());
		System.out.println(conta2.consultarSaldo());
		
		System.out.println(conta2.sacar(250));
		
		conta1.sacar(650);
		
		System.out.println();
		System.out.println("Conta: " + conta1.numero);
		System.out.println("Titular: " + conta1.titular);
		System.out.println("Saldo: " + conta1.saldo);
		
		System.out.println();
		System.out.println("################");
		System.out.println();
		
		System.out.println("Conta: " + conta2.numero);
		System.out.println("Titular: " + conta2.titular);
		System.out.println("Saldo: " + conta2.saldo);
		
		System.out.println();
		
		System.out.println("Quantidade de contas: " + Conta.getQuantidadeConta());
	}
}
