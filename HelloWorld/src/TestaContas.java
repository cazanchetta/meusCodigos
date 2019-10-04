public class TestaContas {
	
	public static void main(String[] args) {
		
		ContaBancaria corrente = new ContaCorrente("João", 1);
		System.out.println("Titular: " + corrente.getTitular() + " / Conta: " + corrente.getNumero());
		System.out.println("Tipo conta: " + corrente.getTipo());
		corrente.deposita(500);
		System.out.println("Deposito: R$ 500");
		corrente.saque(100);
		System.out.println("Saque: R$ 100");
		System.out.println("Saldo: " + corrente.getSaldo());
		
		System.out.println("=======================================");
		
		ContaBancaria poupanca = new ContaPoupanca("Luis", 2);
		System.out.println("Titular: " + poupanca.getTitular() + " / Conta: " + poupanca.getNumero());
		System.out.println("Tipo conta: " + poupanca.getTipo());
		poupanca.deposita(1000);
		System.out.println("Deposito: R$ 1000");
		poupanca.saque(300);
		System.out.println("Saque: R$ 300");
		System.out.println("Saldo: " + poupanca.getSaldo());
	}

}
