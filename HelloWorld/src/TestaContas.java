public class TestaContas {
	
	public static void main(String[] args) {
		
		ContaBancaria conta1 = new ContaBancaria("João", 1);
		System.out.println("Titular: " + conta1.getTitular() + " / Conta: " + conta1.getNumero());
		conta1.deposita(200);
		System.out.println("Saldo: " + conta1.getSaldo());
		conta1.deposita(300);
		System.out.println("Saldo: " + conta1.getSaldo());
		conta1.saque(100);
		System.out.println("Saldo: " + conta1.getSaldo());
		
		ContaBancaria conta2 = new ContaBancaria("Maria", 2);
		System.out.println("Titular: " + conta2.getTitular() + " / Conta: " + conta2.getNumero());
		conta2.deposita(500);
		System.out.println("Saldo: " + conta2.getSaldo());
		conta2.saque(600);
		System.out.println("Saldo: " + conta2.getSaldo());
	}

}
