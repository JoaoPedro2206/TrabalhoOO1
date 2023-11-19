package classes;

public class Time {
	private String nomeTime;
	private int qtdVitorias;
	private int qtdDerrotas;
	private int qtdEmpates;
	private int pontuacao;
	
	public Time(String nomeTime,int qtdVitorias,int qtdDerrotas,int qtdEmpates,int pontuacao) {
		this.nomeTime = nomeTime;
		this.qtdVitorias = qtdVitorias;
		this.qtdDerrotas = qtdDerrotas;
		this.qtdEmpates = qtdEmpates;
		this.pontuacao = pontuacao;
		
	}
	public void ganharPartida() {
		this.setQtdVitorias(this.getQtdVitorias()+1);	
	}
	public void perderPartida() {
		this.setQtdDerrotas(this.getQtdDerrotas()+1);
	}
	public void empatarPartida() {
		this.setQtdEmpates(this.getQtdEmpates()+1);
	}
	public void somarPontuacao() {
		this.setPontuacao((this.getQtdVitorias()*3)+(this.getQtdEmpates()*1));
	}
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public int getQtdVitorias() {
		return qtdVitorias;
	}
	public void setQtdVitorias(int qtdVitorias) {
		this.qtdVitorias = qtdVitorias;
	}
	public int getQtdDerrotas() {
		return qtdDerrotas;
	}
	public void setQtdDerrotas(int qtdDerrotas) {
		this.qtdDerrotas = qtdDerrotas;
	}
	public int getQtdEmpates() {
		return qtdEmpates;
	}
	public void setQtdEmpates(int qtdEmpates) {
		this.qtdEmpates = qtdEmpates;
	}
	public int getPontuacao() {
		return pontuacao;
	}
	public void setPontuacao(int pontuacao) {
		this.pontuacao = pontuacao;
	}
	

}
