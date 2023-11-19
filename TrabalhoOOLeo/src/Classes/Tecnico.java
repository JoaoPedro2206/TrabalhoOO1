package Classes;

public class Tecnico extends Pessoa {
	private String licenca;
	private int qtdJogos;
	private String formacaoFavorita;
	
	public Tecnico(String nome, int idade, double altura, String nacionalidade, String licenca, int qtdJogos,
			String formacaoFavorita) {
		super(nome, idade, altura, nacionalidade);
		this.licenca = licenca;
		this.qtdJogos = qtdJogos;
		this.formacaoFavorita = formacaoFavorita;
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
	
	public String toString() {	
		return nome;
	}
	public String exibirTodasInformacoes() {
		return "- Nome: " + nome + "\n- Idade: " + idade + "\n- Altura: " + altura + " cm" +  "\n- Nacionalidade: " + nacionalidade
				+ "\n- Licença: " + licenca + "\n- Quantidade de Jogos: " + qtdJogos + "\n- Formação Favorita: " + formacaoFavorita;
	}
}