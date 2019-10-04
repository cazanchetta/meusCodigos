package heranca;

public class ControleBonificacao {
	private int totalBonificacao = 0;
	
	public void registra(final Funcionario f) {
		totalBonificacao += f.getBonificacao();
	}
	
	public int getTotalBonificacao() {
		return this.totalBonificacao;
	}

}
