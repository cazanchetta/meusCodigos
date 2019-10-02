public class TestaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("João");
		p1.setIdade(12);
		p1.caminha();
		System.out.println(p1.getIdade());
		
		Pessoa p2 = new Pessoa("Danilo");
		System.out.println(p2.getNome());
		
		System.out.println(Pessoa.getIdentificador());
		
	}

}
