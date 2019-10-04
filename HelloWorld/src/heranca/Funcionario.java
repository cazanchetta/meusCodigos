package heranca;

public class Funcionario {
	int numero;
	String nome;
	
	void trabalha() {
		System.out.println("Funcionário que trabalha");
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getBonificacao() {
		return 10;
	}
	

}
