package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Liga {
	private String nomeLiga;
	private String divisao;
	private String pais;
	private String dtInicio;
	private String dtTermino;
	private Time vencedorLiga;
	List<String> times = new ArrayList<>();
	List<Integer> ptTimes = new ArrayList<>();

	public Liga(String nomeLiga,String divisao,String pais,String dtIncio,String dtTermino,String dtInicio, Time vencedorLiga) {
		this.nomeLiga = nomeLiga;
		this.divisao = divisao;
		this.pais = pais;
		this.dtInicio = dtInicio;
		this.dtTermino = dtTermino;
		this.vencedorLiga = vencedorLiga;
		
	}
	
	public void ordenarTimes(Time time1,Time time2){		
		String nometima1 = time1.getNomeTime();
		int pontostime1 = time1.getPontuacao();
		String nometima2 = time2.getNomeTime();
		int pontostime2 = time2.getPontuacao();
		ptTimes.add(pontostime1);
		ptTimes.add(pontostime2);
		ptTimes.sort(null);
		
	
	}
	public void visualizarTabela() {
		System.out.println(times);
		System.out.println(ptTimes);
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

	public Time getVencedorLiga() {
		return vencedorLiga;
	}

	public void setVencedorLiga(Time vencedorLiga) {
		this.vencedorLiga = vencedorLiga;
	}
}
