package Main;
import java.util.*;
import Dados.*;
import Classes.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static Dados d = new Dados();
	private static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args) {
		int op = -1;
		int aux;
		while(op != 0) {
			System.out.print(imprimirMenu());
			op = in.nextInt();
			switch (op) {
		 	case 0:
		 		System.out.println("Encerrando o programa. Volte sempre e tenha um ótimo dia!");
		 		break;
		 	case 1:
		 		cadastrarLiga();
		 		break;
		 	case 2:
		 		removerLiga();
		 		break;
		 	case 3:
		 		System.out.println("Escolha uma das ligas a seguir para editar as informações:\n");
		 		listarLigas();
		 		aux = in.nextInt();
				Liga l = lerDadosLiga();
				editar(aux, l);
		 		break;
		 	case 4:
		 		listarLigas();
		 		break;
		 	case 5:
		 		cadastrarTime();
		 		break;
		 	case 6:
		 		removerTime();
		 		break;
		 	case 7:
		 		System.out.println("Escolha uma das ligas a seguir para editar as informações:\n");
		 		listarTimes();
		 		aux = in.nextInt();
				Time t = lerDadosTime();
				editar(aux, t);
		 		break;
		 	case 8:
		 		listarTimes();
		 		break;
		 	case 9:
		 		cadastrarJogador();
		 		break;
		 	case 10:
		 		removerJogador();
		 		break;
		 	case 11:
		 		System.out.println("Escolha uma das ligas a seguir para editar as informações:\n");
		 		listarJogadores();
		 		aux = in.nextInt();
				Jogador j = lerDadosJogador();
				editar(aux, j);
		 	case 12:
		 		listarJogadores();
		 		break;
		 	case 13:
		 		cadastrarTecnico();
		 		break;
		 	case 14:
		 		removerTecnico();
		 		break;
		 	case 15:
		 		System.out.println("Escolha uma das ligas a seguir para editar as informações:\n");
		 		listarTecnicos();
		 		aux = in.nextInt();
				Tecnico t1 = lerDadosTecnico();
				editar(aux, t1);
				break;
		 	case 16:
		 		listarTecnicos();
		 		break;
		 	case 17:
		 		exibirInformacoesJogador();
		 		break;
		 	case 18:
		 		exibirInformacoesTecnico();
		 		break;
		 	case 19:
		 		exibirInformacoesLiga();
		 		break;
		 	case 20:
		 		exibirInformacoesTime();
		 		break;
		 	case 21:
		 	    d.classificarTimes();
		 	    listarTimesComPontuacao();
		 	    break;
		 	case 22:
		 		editarPontuacao();
		 		break;
			}
		}
	}
	
	public static String imprimirMenu() {
		String saida = new String("Escolha uma das opções a seguir:\n");
		saida = saida + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n";
		saida = saida + "00 - Sair da aplicação\n";
		saida = saida + "01 - Cadastrar nova liga\n";
		saida = saida + "02 - Remover liga existente\n";
		saida = saida + "03 - Editar liga existente\n";
		saida = saida + "04 - Listar ligas\n";
		saida = saida + "05 - Cadastrar novo time\n";
		saida = saida + "06 - Remover time existente\n";
		saida = saida + "07 - Editar time existente\n";
		saida = saida + "08 - Listar times\n";
		saida = saida + "09 - Cadastrar novo jogador\n";
		saida = saida + "10 - Remover jogador existente\n";
		saida = saida + "11 - Editar jogador existente\n";
		saida = saida + "12 - Listar jogadores\n";
		saida = saida + "13 - Cadastrar novo técnico\n";
		saida = saida + "14 - Remover técnico existente\n";
		saida = saida + "15 - Editar técnico existente\n";
		saida = saida + "16 - Listar técnicos\n";
		saida = saida + "17 - Buscar jogador por nome\n";
		saida = saida + "18 - Buscar técnico por nome\n";
		saida = saida + "19 - Buscar liga por nome\n";
		saida = saida + "20 - Buscar time por nome\n";
		saida = saida + "21 - Visualizar tabela por pontos\n";
		saida = saida + "22 - Atualizar pontuação do time\n";
		saida = saida + "=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=\n";
		return saida;
	}
	
	public static Liga lerDadosLiga() {
		String nomeLiga;
		String divisao;
		String pais;
		String dtInicio;
		String dtTermino;
		
		in.nextLine();
		
		System.out.println("Digite o nome da liga:");
		nomeLiga = in.nextLine();
		System.out.println("Digite a divisão da liga:");
		divisao = in.nextLine();
		System.out.println("Digite o país da liga:");
		pais = in.nextLine();
		System.out.println("Digite a data de início da liga:");
		dtInicio = in.nextLine();
		System.out.println("Digite a data de término da Liga:");
		dtTermino = in.nextLine();
		
		Liga l = new Liga(nomeLiga, divisao, pais, dtInicio, dtTermino);
		return l;
	}
	
	public static Time lerDadosTime() {
		String nomeTime;
		int anoFundacao;
		int qtdVitorias;
		int qtdDerrotas;
		int qtdEmpates;
		
		in.nextLine();
		
		System.out.println("Digite o nome do time:");
		nomeTime = in.nextLine();
		System.out.println("Digite o  ano de fundação do time:");
		anoFundacao = in.nextInt();
		System.out.println("Digite a quantidade de vitórias do time:");
		qtdVitorias = in.nextInt();
		System.out.println("Digite a quantidade de derrotas do time:");
		qtdDerrotas = in.nextInt();
		System.out.println("Digite a quantidade de empates do time:");
		qtdEmpates = in.nextInt();
		
		Time t = new Time(nomeTime, anoFundacao, qtdVitorias, qtdDerrotas, qtdEmpates);
		return t;
		
	}
	
	public static Jogador lerDadosJogador() {
		String nome;
		int idade;
		double altura;
		String nacionalidade;
		String peDominante;
		int numeroCamisa;
		
		in.nextLine();
		
		System.out.println("Digite o nome do jogador:");
		nome = in.nextLine();
		System.out.println("Digite a idade do jogador:");
		idade = in.nextInt();
		System.out.println("Digite a altura do jogador em cm (Ex.: 180):");
		altura = in.nextInt();
		System.out.println("Digite a nacionalidade do jogador (Ex.: Brasileiro):");
		nacionalidade = in.nextLine();
		in.nextLine();
		System.out.println("Digite o pé dominante do jogador (Ex.: Esquerdo):");
		peDominante = in.nextLine();
		System.out.println("Digite o número da camisa do jogador:");
		numeroCamisa = in.nextInt();
		
		Jogador j = new Jogador(nome, idade, altura, nacionalidade, peDominante, numeroCamisa);
		return j;	
		
	}
	
	public static Tecnico lerDadosTecnico() {
		String nome;
		int idade;
		double altura;
		String nacionalidade;
		String licenca;
		int qtdJogos;
		String formacaoFavorita;
		
		in.nextLine();
		
		System.out.println("Digite o nome do técnico:");
		nome = in.nextLine();
		System.out.println("Digite a idade do técnico:");
		idade = in.nextInt();
		System.out.println("Digite a altura do técnico:");
		altura = in.nextInt();
		System.out.println("Digite a nacionalidade do técnico:");
		nacionalidade = in.nextLine();
		in.nextLine();
		System.out.println("Digite a licença do técnico:");
		licenca = in.nextLine();
		System.out.println("Digite a quantidade de jogos do técnico:");
		qtdJogos = in.nextInt();
		in.nextLine();
		System.out.println("Digite a formação favorita do técnico (Ex.: 4-3-3)");
		formacaoFavorita = in.nextLine();
		
		Tecnico t = new Tecnico(nome, idade, altura, nacionalidade, licenca, qtdJogos, formacaoFavorita);
		return t;
		
	}
	
	public static boolean cadastrarLiga() {
		Liga l = lerDadosLiga();
		if(d.getNumLigas() < 100) {
			d.setLiga(d.getNumLigas(), l);
			d.setNumLigas(d.getNumLigas()+1);
			System.out.println("Liga cadastrada com sucesso!\n");
			return true;
		} else {
			System.out.println("Não foi possível cadastrar a liga!\n");
			return false;
		}
	}
	
	public static boolean cadastrarTime() {
		Time t = lerDadosTime();
		if(d.getNumTimes() < 100) {
			d.setTime(d.getNumTimes(), t);
			d.setNumTimes(d.getNumTimes()+1);
			System.out.println("Time cadastrado com sucesso!\n");
			return true;
		} else {
			System.out.println("Não foi possível cadastrar o time!\n");
			return false;
		}
	}
	
	public static boolean cadastrarJogador() {
		Jogador j = lerDadosJogador();
		if(d.getNumJogadores() < 100) {
			d.setJogador(d.getNumJogadores(), j);
			d.setNumJogadores(d.getNumJogadores()+1);
			System.out.println("Jogador cadastrado com sucesso!\n");
			return true;
		} else {
			System.out.println("Não foi possível cadastrar o jogador!\n");
			return false;
		}
	}
	
	public static boolean cadastrarTecnico() {
		Tecnico t = lerDadosTecnico();
		if(d.getNumTecnicos() < 100) {
			d.setTecnico(d.getNumTecnicos(), t);
			d.setNumTecnicos(d.getNumTecnicos()+1);
			System.out.println("Técnico cadastrado com sucesso!\n");
			return true;
		} else {
			System.out.println("Não foi possível cadastrar o técnico!\n");
			return false;
		}
	}
	
	public static void listarLigas() {
		in.nextLine();
		for(int i = 0; i < d.getNumLigas(); i++) 
			System.out.println(i + " -> " + d.getLigas()[i].toString());
	}
	
	
	public static void listarTimes() {
		in.nextLine();
		for(int i = 0; i < d.getNumTimes(); i++) 
			System.out.println(i + " -> " + d.getTimes()[i].toString());
	}
	
	public static void listarJogadores() {
		in.nextLine();
		for(int i = 0; i < d.getNumJogadores(); i++) 
			System.out.println(i + " -> " + d.getJogadores()[i].toString());
	}
	
	public static void listarTecnicos() {
		in.nextLine();
		for(int i = 0; i < d.getNumTecnicos(); i++) 
			System.out.println(i + " -> " + d.getTecnicos()[i].toString());
	}
	
	public static void swapListaLigas(int l) {
		for(int i = l; i < d.getNumLigas() - 1; i++) 
			d.setLiga(i, d.getLiga(i+1));
	}
	
	public static void swapListaTimes(int t) {
		for(int i = t; i < d.getNumTimes() - 1; i++) 
			d.setTime(i, d.getTime(i+1));
	}
	
	public static void swapListaJogadores(int j) {
		for(int i = j; i < d.getNumJogadores() - 1; i++) 
			d.setJogador(i, d.getJogador(i+1));
	}
	
	public static void swapListaTecnicos(int t) {
		for(int i = t; i < d.getNumTecnicos() - 1; i++) 
			d.setTecnico(i, d.getTecnico(i+1));
	}
	
	public static void removerLiga() {
		System.out.println("Escolha uma das ligas a seguir para ser removida:\n");
		listarLigas();
		int i = in.nextInt();
		if(i < d.getNumLigas() && i >= 0) {
			swapListaLigas(i);
			d.setLiga(d.getNumLigas(), null);
			d.setNumLigas(d.getNumLigas() - 1);
			System.out.println("Liga removida com sucesso");
		} else {
			System.out.println("Você escolheu um número inválido!");
		}
		
	}
	
	public static void removerTime() {
		System.out.println("Escolha um dos times a seguir para ser removido:\n");
		listarTimes();
		int i = in.nextInt();
		if(i < d.getNumTimes() && i >= 0) {
			swapListaTimes(i);
			d.setTime(d.getNumTimes(), null);
			d.setNumTimes(d.getNumTimes() - 1);
			System.out.println("Time removido com sucesso");
		} else {
			System.out.println("Você escolheu um número inválido!");
		}
		
	}
	
	public static void removerJogador() {
		System.out.println("Escolha um dos jogadores a seguir para ser removido:\n");
		listarJogadores();
		int i = in.nextInt();
		if(i < d.getNumJogadores() && i >= 0) {
			swapListaJogadores(i);
			d.setJogador(d.getNumJogadores(), null);
			d.setNumJogadores(d.getNumJogadores() - 1);
			System.out.println("Jogador removido com sucesso");
		} else {
			System.out.println("Você escolheu um número inválido!");
		}
		
	}
	
	public static void removerTecnico() {
		System.out.println("Escolha um dos técnicos a seguir para ser removido:\n");
		listarTecnicos();
		int i = in.nextInt();
		if(i < d.getNumTecnicos() && i >= 0) {
			swapListaTecnicos(i);
			d.setTecnico(d.getNumTecnicos(), null);
			d.setNumTecnicos(d.getNumTecnicos() - 1);
			System.out.println("Técnico removido com sucesso");
		} else {
			System.out.println("Você escolheu um número inválido!");
		}
		
	}
	
	public static void editar(int i, Liga l) {
		if(i < d.getNumLigas() && i >= 0) {
			d.setLiga(i, l);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um número inválido!");
		}
	}
	
	public static void editar(int i, Time t) {
		if(i < d.getNumTimes() && i >= 0) {
			d.setTime(i, t);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um número inválido!");
		}
	}
	
	public static void editar(int i, Jogador j) {
		if(i < d.getNumJogadores() && i >= 0) {
			d.setJogador(i, j);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um número inválido!");
		}
	}
	
	public static void editar(int i, Tecnico t) {
		if(i < d.getNumTecnicos() && i >= 0) {
			d.setTecnico(i, t);
			System.out.println("Dados editados com sucesso");
		} else {
			System.out.println("Voce escolheu um número inválido!");
		}
	}
	
	public static void exibirInformacoesJogador() {
		listarJogadores();
	    System.out.println("\nDigite o número que represente o jogador para exibir suas informações:");
	    int numeroJogador = in.nextInt();
	    
	    
	    if (numeroJogador >= 0 && numeroJogador < d.getNumJogadores()) {
	        Jogador jogador = d.getJogadores()[numeroJogador];
	        System.out.println("Informações do Jogador:\n" + jogador.exibirTodasInformacoes());
	    } else {
	        System.out.println("Número de jogador inválido.");
	    }
	}
	
	public static void exibirInformacoesTecnico() {
		listarTecnicos();
	    System.out.println("\nDigite o número que represente o técnico para exibir suas informações:");
	    int numeroTecnico = in.nextInt();
	    
	    
	    if (numeroTecnico >= 0 && numeroTecnico < d.getNumTecnicos()) {
	        Tecnico tecnico = d.getTecnicos()[numeroTecnico];
	        System.out.println("Informações do Técnico:\n" + tecnico.exibirTodasInformacoes());
	    } else {
	        System.out.println("Número de técnico inválido.");
	    }
	}
	
	public static void exibirInformacoesLiga() {
		listarLigas();
	    System.out.println("\nDigite o número que represente a liga para exibir suas informações:");
	    int numeroLiga = in.nextInt();
	    
	    
	    if (numeroLiga >= 0 && numeroLiga < d.getNumLigas()) {
	        Liga liga = d.getLigas()[numeroLiga];
	        System.out.println("Informações da Liga:\n" + liga.exibirTodasInformacoes());
	    } else {
	        System.out.println("Número de liga inválido.");
	    }
	}
	
	public static void exibirInformacoesTime() {
		listarTimes();
	    System.out.println("\nDigite o número que represente o time para exibir suas informações:");
	    int numeroTime = in.nextInt();
	    
	    
	    if (numeroTime >= 0 && numeroTime < d.getNumTimes()) {
	        Time time = d.getTimes()[numeroTime];
	        System.out.println("Informações do Time:\n" + time.exibirTodasInformacoes());
	    } else {
	        System.out.println("Número de time inválido.");
	    }
	}
	
	public static void listarTimesComPontuacao() {
	    System.out.println("\nLista de Times em Ordem de Pontuação:\n");
	    for (int i = 0; i < d.getNumTimes(); i++) {
	        Time time = d.getTimes()[i];
	        System.out.println(i+1 + "° lugar | " + time.getNomeTime() + " | " + time.getPontuacao() + " pontos");
	    }
	    System.out.println();
	}
	public static void editarPontuacao() {
		listarTimes();
		System.out.println("\nDigite o número do time para editar a pontuação: ");
		int numeroTime = in.nextInt();
		
		if (numeroTime >= 0 && numeroTime < d.getNumTimes()) {
	        Time time = d.getTimes()[numeroTime];
	        System.out.println("\nDigite o número do resultado: ");
	        int op = -1;
	        while(op != 0 && op != 1 && op != 2) {
	        	System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n");
	        	System.out.print("0 - O time ganhou\n");
	        	System.out.print("1 - O time perdeu\n");
	        	System.out.print("2 - O time empatou\n");
	        	System.out.print("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-= \n");
				op = in.nextInt();
				switch (op) {
			 	case 0:
			 		System.out.println("Ganhou (+3 pontos)");
			 		time.setQtdVitorias(time.getQtdVitorias()+1);
			 		break;
			 	case 1: 
			 		System.out.println("Perdeu");
			 		time.setQtdDerrotas(time.getQtdDerrotas()+1);
			 		break;
			 	case 2:
			 		System.out.println("Empatou (+1 ponto)");
			 		time.setQtdEmpates(time.getQtdEmpates()+1);
			 		break;  
				}
	        }
		} else {
	        System.out.println("Número de time inválido.");
		}
		
	}
}