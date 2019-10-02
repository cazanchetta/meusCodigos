public class Pessoa {
	
	private String nome;
	private int idade;
	private float peso;
	private static int identificador;
	
	public Pessoa(final String nome) {
		this.nome = nome;
		identificador++;
	}
	
	public Pessoa(final String nome, final int idade) {
		this.idade = idade;
		this.nome = nome;
		identificador++;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void caminha() {
		System.out.println(this.nome + " está caminhando");
	}
	
	public static int getIdentificador() {
		return identificador;
	}
	
}
