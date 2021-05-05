package exercicios;

import java.util.Scanner;

public class Exercício1 {

	public static void main(String[] args) {
		int ano, dia=0, mes, total=0, bissexto=0;
		
		Scanner ler = new Scanner(System.in);
		
		
		System.out.println("Fale sua idade: ");
		ano = ler.nextInt();
		
		System.out.println("E quantos meses: ");
		mes = ler.nextInt();
		
		System.out.println("E quantos dias: ");
		dia = ler.nextInt();
		
		bissexto = ano/4;
				
		total = (ano*365) +(mes*30) + (dia) + bissexto;
		
		System.out.println("Você viveu " + total + " dias");
		
		ler.close();
		
	}

}
