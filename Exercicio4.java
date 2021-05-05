package exercicios;

import java.util.Scanner;

public class Exercicio4 {

	public static void main(String[] args) {
		double a, b, c, d=0, r, s;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Escreva a: ");
		a = ler.nextDouble();
		
		System.out.println("Escreva b: ");
		b = ler.nextDouble();
		
		System.out.println("Escreva c: ");
		c = ler.nextDouble();
		
		r = (a+b) * (a+b);
		s = (b+c) * (b+c);
		d = (r+s) / 2;
		
		System.out.println("R é igual a: " + r);
		System.out.println("\nS é igual a: " + s);
		System.out.println("\nD é igual a: " + d);
		
		ler.close();
		
		
		

	}

}
