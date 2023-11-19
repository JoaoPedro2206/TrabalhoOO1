package Dados;
import Classes.*;

import java.util.*;

public class Dados {
	private Jogador[] jogadores;
	private int numJogadores = 0;
	private Tecnico[] tecnicos;
	private int numTecnicos = 0;
	private Time[] times;
	private int numTimes = 0;
	private Liga[] ligas;
	private int numLigas = 0;
	
	public Dados(){
		jogadores = new Jogador[100];
		tecnicos = new Tecnico[100];
		times = new Time[100];
		ligas = new Liga[100];
	}
	
	
	public Jogador[] getJogadores() {
		return jogadores;
	}
	
	public Jogador getJogador(int i) {
		return jogadores[i];
	}
	
	public String[] getNomeJogadores() {
		String[] s = new String[numJogadores];
		for(int i = 0; i < numJogadores; i++) {
			s[i] = jogadores[i].getNome();
		}
		return s;
	}
	
	public void setJogadores(Jogador[] jogadores) {
		this.jogadores = jogadores;
	}
	
	public void setJogador(int i, Jogador a) {
		jogadores[i] = a;
	}
	
	public int getNumJogadores() {
		return numJogadores;
	}
	
	public void setNumJogadores(int numJogadores) {
		this.numJogadores = numJogadores;
	}
	
	public Tecnico[] getTecnicos() {
		return tecnicos;
	} 
	
	public Tecnico getTecnico(int i) {
		return tecnicos[i];
	}
	
	public String[] getNomeTecnicos() {
		String[] s = new String[numTecnicos];
		for(int i = 0; i < numTecnicos; i++) {
			s[i] = tecnicos[i].getNome();
		}
		return s;
	}
	
	public void setTecnicos(Tecnico[] tecnicos) {
		this.tecnicos = tecnicos;
	}
	
	public void setTecnico(int i, Tecnico t) {
		tecnicos[i] = t;
	}
	
	public int getNumTecnicos() {
		return numTecnicos;
	}
	
	public void setNumTecnicos(int numTecnico) {
		this.numTecnicos = numTecnico;
	}
	
	public Time[] getTimes() {
		return times;
	}
	
	public Time getTime(int i) {
		return times[i];
	}
	
	public String[] getNomeTimes() {
		String[] s = new String[numTimes];
		for(int i = 0; i < numTimes; i++) {
			s[i] = times[i].getNomeTime();
		}
		return s;
	}
	
	
	public void setTimes(Time[] times) {
		this.times = times;
	}
	
	public void setTime(int i, Time a) {
		times[i] = a;
	}
	
	public int getNumTimes() {
		return numTimes;
	}
	
	public void setNumTimes(int numTimes) {
		this.numTimes = numTimes;
	}
	
	public Liga[] getLigas() {
		return ligas;
	}
	        
	public Liga getLiga(int i) {
		return ligas[i];
	}
	
	public String[] getNomeLigas() {
		String[] s = new String[numLigas];
		for(int i = 0; i < numLigas; i++) {
			s[i] = ligas[i].getNomeLiga();
		}
		return s;
	}
	
	public void setLigas(Liga[] ligas) {
		this.ligas = ligas;
	}
	
	public void setLiga(int i, Liga a) {
		ligas[i] = a;
	}
	
	public int getNumLigas() {
		return numLigas;
	}
	
	public void setNumLigas(int numLigas) {
		this.numLigas = numLigas;
	}
	
	public Jogador buscarJogadorPorNome(String nome) {
	    for (int i = 0; i < numJogadores; i++) {
	        if (jogadores[i].getNome().equalsIgnoreCase(nome)) {
	            return jogadores[i];
	        }
	    }
	    return null;
	}
	
	public Tecnico buscarTecnicoPorNome(String nome) {
	    for (int i = 0; i < numTecnicos; i++) {
	        if (tecnicos[i].getNome().equalsIgnoreCase(nome)) {
	            return tecnicos[i];
	        }
	    }
	    return null;
	}
	
	public Liga buscarLigaPorNome(String nome) {
	    for (int i = 0; i < numLigas; i++) {
	        if (ligas[i].getNomeLiga().equalsIgnoreCase(nome)) {
	            return ligas[i];
	        }
	    }
	    return null;
	}
	
	public Time buscarTimePorNome(String nome) {
	    for (int i = 0; i < numTimes; i++) {
	        if (times[i].getNomeTime().equalsIgnoreCase(nome)) {
	            return times[i];
	        }
	    }
	    return null;
	}
	
    public void calcularPontuacaoDosTimes() {
        for (int i = 0; i < numTimes; i++) {
            Time time = times[i];
            time.setPontuacao(time.calcularPontuacao(time.getQtdVitorias(), time.getQtdEmpates()));
        }
    }
	
    public void classificarTimes() {
        calcularPontuacaoDosTimes();
        Arrays.sort(times, 0, numTimes, Comparator.comparingDouble(Time::getPontuacao).reversed());
    }
	public static void preencherDados() {
		
	}
    
}