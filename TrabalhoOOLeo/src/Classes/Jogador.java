package Classes;

public class Jogador extends Pessoa {
	private String peDominante;
	private int numeroCamisa;
	private Time time;
	
	public Jogador(String nome, int idade, double altura, String nacionalidade, String peDominante, int numeroCamisa) {
		super(nome, idade, altura, nacionalidade);
		this.peDominante = peDominante;
		this.numeroCamisa = numeroCamisa;
	}

	public String getPeDominante() {
		return peDominante;
	}

	public void setPeDominante(String peDominante) {
		this.peDominante = peDominante;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}
 
	public void setNota(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public Time getTime() {
		return time;
	}

	public void setTime(Time time) {
		this.time = time;
	}
	
	public String toString() {	
		return nome;
	}
	
	public String exibirTodasInformacoes() {
		return "- Nome: " + nome + "\n- Idade: " + idade + "\n- Altura: " + altura + " cm" + "\n- Nacionalidade: " + nacionalidade
				+ "\n- Pé dominante: " + peDominante + "\n- Número da camisa: " + numeroCamisa;
	}
	
}
