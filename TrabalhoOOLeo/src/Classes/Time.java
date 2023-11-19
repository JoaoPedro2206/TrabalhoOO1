package Classes;

import java.util.*;

public class Time {
	private String nomeTime;
	private int anoFundacao;
	private int qtdVitorias;
	private int qtdDerrotas;
	private int qtdEmpates;
	private double pontuacao;
	private ArrayList<Tecnico> tecnicos;
	private ArrayList<Jogador> jogadores;
	private int numJogadores;
	
	public Time(String nomeTime, int anoFundacao, int qtdVitorias, int qtdDerrotas, int qtdEmpates) {
		this.nomeTime = nomeTime;
		this.anoFundacao = anoFundacao;
		this.qtdVitorias = qtdVitorias;
		this.qtdDerrotas = qtdDerrotas;
		this.qtdEmpates = qtdEmpates;
		jogadores = new ArrayList<Jogador>();
		tecnicos = new ArrayList<Tecnico>();
	}
	
	public void adicionarJogador(Jogador jogador) {
		jogadores.add(jogador);
	}
	
	public void excluirJogador(Jogador jogador) {
		jogadores.remove(jogador);
	}
	
	public int quantidadeJogadores() {
		return jogadores.size();
	}
	
	public Jogador getJogador(int posicao){
		return jogadores.get(posicao);
	}
	
	public boolean adicionarTecnico(Tecnico tecnico) {
		if(tecnicos.size() == 0) {
			tecnicos.add(tecnico);
			return true;
		} else {
			return false;
		}
	}
	
	public void excluirTecnico(Tecnico tecnico) {
		if(tecnicos.size() == 1) {
			tecnicos.remove(tecnico);
		}
	}
	
	public Tecnico getTecnico(int posicao) {
		return tecnicos.get(posicao);
	}

	public String getNomeTime() {
		return nomeTime;
	}

	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}

	public int getAnoFundacao() {
		return anoFundacao;
	}

	public void setAnoFundacao(int anoFundacao) {
		this.anoFundacao = anoFundacao;
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

	public double getPontuacao() {
		return pontuacao;
	}

	public void setPontuacao(double pontuacao) {
		this.pontuacao = pontuacao;
	}

	public ArrayList<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(ArrayList<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}

	public ArrayList<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(ArrayList<Jogador> jogadores) {
		this.jogadores = jogadores;
	}

	public int getNumJogadores() {
		return numJogadores;
	}

	public void setNumJogadores(int numJogadores) {
		this.numJogadores = numJogadores;
	}

	public double calcularPontuacao(int qtdVitorias, int qtdEmpates) {
		pontuacao = qtdVitorias * 3 + qtdEmpates;
		return pontuacao;
	}

	public String toString() {	
		return nomeTime;
	}
	
	public String exibirTodasInformacoes() {
		return "- Nome do Time: " + nomeTime + "\n- Ano de Fundação do Time: " + anoFundacao + "\n- Quantidade Vitórias do Time: " + qtdVitorias
				+ "\n- Quantidade Derrotas do Time: " + qtdDerrotas + "\n- Quantidade Empates do Time: " + qtdEmpates + "\n- Pontuação do Time: " + (qtdVitorias*3 + qtdEmpates) + " pontos";
	}
}
