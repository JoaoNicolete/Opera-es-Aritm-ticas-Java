package exercicios;

import java.util.Scanner;

public class Exerc�cio2 {

	public static void main(String[] args) {
		int dia, mes, ano, restoDia;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva quantos dias voc� viveu: ");
		dia = ler.nextInt();
		
		ano = dia / 365;
		mes = (dia%365)/30;
		restoDia = (dia%365)%30;
		
		System.out.println("Voc� viveu " + ano + " anos, " + mes +  " meses e " +  restoDia + " dias.");
		
		ler.close();
		

	}

}
