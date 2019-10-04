
public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(String titular, int numero) {
		super(titular, numero);
	}
	
	@Override
	public void saque(final double valor) {
		super.saque(valor + 0.1);
	}
	
	@Override
	public String getTipo() {
		return "Corrente";
	}

}
