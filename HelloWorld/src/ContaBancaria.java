public abstract class ContaBancaria {
	
	private String titular;
	private double saldo;
	private int numero;
	
	public ContaBancaria(String titular, int numero) {
		this.titular = titular;
		this.numero = numero;
	}
	
	public String getTitular() {
		return this.titular;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public void deposita(final double valor) {
		this.saldo += valor;
	}
	
	public void saque(final double valor) {
		this.saldo -= valor;
	}
	
	public abstract String getTipo();

}
