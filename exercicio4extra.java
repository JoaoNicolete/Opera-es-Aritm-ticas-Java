package Exercícios;

import java.util.Scanner;
import java.lang.Math;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, quadrado, raiz;
		
		System.out.println("Digite o número: ");
		numero = ler.nextInt();
		
		if((numero%2) == 0) {
			raiz = (Math.sqrt(numero));
			System.out.println("Este número é par");
			System.out.println("A raiz é " + raiz);
			
		} else {
			quadrado = numero * numero;
			System.out.println("Este número é impar");
			System.out.println("O quadrado é " + quadrado);
		}
		ler.close();
	}
	
	
}
