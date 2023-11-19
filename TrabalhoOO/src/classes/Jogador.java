package classes;

public class Jogador extends Pessoa{
	private String peDominante;
	private String posicao;

	public Jogador(String nome, int idade, double altura, String nacionalidade,String peDominante,String posicao) {
		super(nome, idade, altura, nacionalidade);
		this.peDominante = peDominante;
		this.posicao = posicao;
	}
	public void criarJogador(String nome, int idade, double altura,String nacionalidade,String peDominante,String posicao) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.nacionalidade = nacionalidade;
		this.peDominante = peDominante;
		this.posicao = posicao;
	}
	
	public void editarJogador() {
		this.setNome(nome);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setNacionalidade(nacionalidade);
		this.setPeDominante(peDominante);
		this.setPosicao(posicao);

	}
	public String getPeDominante() {
		return peDominante;
	}
	public void setPeDominante(String peDominante) {
		this.peDominante = peDominante;
	}
	public String getPosicao() {
		return posicao;
	}
	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}
	

}
