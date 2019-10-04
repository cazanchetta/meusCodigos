package heranca;

public class Motorista extends Funcionario {
	
	void dirige() {
		System.out.println("Motorista que dirige");
	}
	
	@Override
	public int getBonificacao() {
		return 60;
	}

}
