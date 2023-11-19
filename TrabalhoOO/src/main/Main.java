package main;

import classes.Liga;
import classes.Time;

public class Main {
	public static void main(String[] args) {
		Liga liga1 = new Liga("Seria A", null, null, null, null,null,null);
		Time time1 = new Time("Fluminense", 1, 2, 3, 15);
		Time time2 = new Time("Vasco", 1, 2, 3, 10);
		
		System.out.println(time1.getPontuacao());
		liga1.visualizarTabela();
		
		

		
		
	}

}

