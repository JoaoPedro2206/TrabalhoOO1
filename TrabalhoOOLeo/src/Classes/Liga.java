package Classes;

import java.util.*;

public class Liga {
	private String nomeLiga;
	private String divisao;
	private String pais;
	private String dtInicio;
	private String dtTermino;
	private ArrayList<Time> times;
	
	public Liga(String nomeLiga, String divisao, String pais, String dtInicio, String dtTermino) {
		times = new ArrayList<Time>();
		this.nomeLiga = nomeLiga;
		this.divisao = divisao;
		this.pais = pais;
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
	}
	
	public void adicionarTime(Time time) {
		times.add(time);
	}
	
	public void excluirTime(Time time) {
		times.remove(time);
	}
	
	public int quantidadeTimes() {
		return times.size();
	}
	
	public Time getTime(int posicao){
		return times.get(posicao);
	}

	public String getNomeLiga() {
		return nomeLiga;
	}

	public void setNomeLiga(String nomeLiga) {
		this.nomeLiga = nomeLiga;
	}

	public String getDivisao() {
		return divisao;
	}

	public void setDivisao(String divisao) {
		this.divisao = divisao;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getDtInicio() {
		return dtInicio;
	}

	public void setDtInicio(String dtInicio) {
		this.dtInicio = dtInicio;
	}

	public String getDtTermino() {
		return dtTermino;
	}

	public void setDtTermino(String dtTermino) {
		this.dtTermino = dtTermino;
	}

	public ArrayList<Time> getTimes() {
		return times;
	}

	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}

	public String toString() {	
		return nomeLiga + " " + divisao;
	}
	public String exibirTodasInformacoes() {
		return "- Nome da Liga: " + nomeLiga + "\n- Divisão da Liga: " + divisao + "\n- País da Liga: " + pais + "\n- Data de Início da Liga: " + dtInicio
				+ "\n- Data de Término da Liga: " + dtTermino;
	}
	
}