package exercicios;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int segundos, minutos, horas, restoSegundos;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Quantos segundos durou o evento?");
		segundos = ler.nextInt();
		
		horas = segundos / 3600;
		minutos = (segundos%3600)/60;
		restoSegundos = (segundos%3600)%30;
		
		System.out.println("O evento durou " + horas + " horas, " + minutos + " minutos e " + restoSegundos + " segundos");
		
		ler.close();

	}

}
