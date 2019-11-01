package testeErro;

import java.time.LocalDate;

public class ContaCorrente {
	
	private double saldo;
	private String nome;
	private String endereco;
	private String cpf;
	private LocalDate dataNascimento;
	private LocalDate dataRegistro;
	
	public ContaCorrente(String nome, String endereco, String cpf,
			LocalDate dataNascimento, LocalDate dataRegistro) {
		this.nome = nome;
		this.endereco = endereco;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
		this.dataRegistro = dataRegistro;
	}
	
	public boolean equals(Object obj) {
		ContaCorrente conta = (ContaCorrente) obj;
		return conta.cpf.equals(this.cpf);
	}

	public void deposita(Double valor) {
		this.saldo =+ valor;
	}
	
	public void saca(Double valor) throws SaldoInsuficiente {
		if(this.saldo < valor) {
			throw new SaldoInsuficiente("Saldo Insuficiente");
		}
		this.saldo =- valor;
	}

	public double getSaldo() {
		return this.saldo;
	}
	
	public LocalDate getDataNascimento() {
		return this.dataNascimento;
	}

}
