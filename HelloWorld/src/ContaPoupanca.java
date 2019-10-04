
public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(String titular, int numero) {
		super(titular, numero);
	}
	
	@Override
	public String getTipo() {
		return "Poupança";
	}

}
