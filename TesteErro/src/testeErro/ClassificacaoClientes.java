package testeErro;

public enum ClassificacaoClientes {
	
	POTENCIAL("Potencial", 400000, 500000),
	MEDIO("Medio", 200000, 399999.99),
	BAIXO("Baixo", 0, 199999.99);
	
	String name;
	double minimo;
	double maximo;
	
	ClassificacaoClientes(String name, double minimo, double maximo){
		this.name = name;
		this.minimo = minimo;
		this.maximo = maximo;
	}
	
	public boolean isCompatible(ContaCorrente conta) {
		if(conta.getSaldo() >= this.minimo && conta.getSaldo() <= this.maximo) {
			System.out.println("É compatível com classificação " + this.name);
			return true;
		}
		System.out.println("Não é compatível com classificação " + this.name);
		return false;
	}

}
