package classes;

public class Tecnico extends Pessoa{
	private String licenca;
	private int qtdJogos;
	private String formacaoFavorita;

	public Tecnico(String nome, int idade, double altura, String nacionalidade, String licenca, int qtdJogos, String formacaoFavorita) {
		super(nome, idade, altura, nacionalidade);
		this.licenca = licenca;
		this.qtdJogos = qtdJogos;
		this.formacaoFavorita = formacaoFavorita;
	}
	public void criarTecnico(String nome, int idade, double altura, String nacionalidade, String licenca, int qtdJogos, String formacaoFavorita) {
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
		this.nacionalidade = nacionalidade;
		this.licenca = licenca;
		this.qtdJogos = qtdJogos;
		this.formacaoFavorita = formacaoFavorita;
	}
	public void editarTecnico() {
		this.setNome(nome);
		this.setIdade(idade);
		this.setAltura(altura);
		this.setNacionalidade(nacionalidade);
		this.setLicenca(licenca);
		this.setQtdJogos(qtdJogos);
		this.setFormacaoFavorita(formacaoFavorita);
	
	}
	
	public String getLicenca() {
		return licenca;
	}

	public void setLicenca(String licenca) {
		this.licenca = licenca;
	}

	public int getQtdJogos() {
		return qtdJogos;
	}

	public void setQtdJogos(int qtdJogos) {
		this.qtdJogos = qtdJogos;
	}

	public String getFormacaoFavorita() {
		return formacaoFavorita;
	}

	public void setFormacaoFavorita(String formacaoFavorita) {
		this.formacaoFavorita = formacaoFavorita;
	}
	

}
