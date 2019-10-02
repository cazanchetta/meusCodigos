public class TestaPessoa {
	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa();
		p1.setIdade(12);
		p1.setNome("João");
		p1.caminha();
		System.out.println(p1.getIdade());
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Danilo");
		System.out.println(p2.getNome());
		
		
	}

}
