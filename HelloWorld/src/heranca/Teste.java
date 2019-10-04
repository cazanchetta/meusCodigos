package heranca;

public class Teste {
	
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.setNome("João");
		f1.setNumero(123);
		System.out.println(f1.getNome());
		System.out.println(f1.getNumero());
		f1.trabalha();
		
		Motorista m1 = new Motorista();
		m1.setNome("Luis");
		m1.setNumero(456);
		System.out.println(m1.getNome());
		System.out.println(m1.getNumero());
		m1.trabalha();
		m1.dirige();
	}
	

}
