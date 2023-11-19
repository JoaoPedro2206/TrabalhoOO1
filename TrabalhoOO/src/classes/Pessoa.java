package classes;

public abstract class Pessoa {
	protected String nome;
	protected int idade;
	protected double altura;
	protected String nacionalidade;
	
	public Pessoa(String nome,int idade,double altura, String nacionalidade) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.nacionalidade = nacionalidade;
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
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	
	
	

}
