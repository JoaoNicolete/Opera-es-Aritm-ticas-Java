package Exerc�cios;

import java.util.Scanner;
import java.lang.Math;

public class exercicio4 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		double numero, quadrado, raiz;
		
		System.out.println("Digite o n�mero: ");
		numero = ler.nextInt();
		
		if((numero%2) == 0) {
			raiz = (Math.sqrt(numero));
			System.out.println("Este n�mero � par");
			System.out.println("A raiz � " + raiz);
			
		} else {
			quadrado = numero * numero;
			System.out.println("Este n�mero � impar");
			System.out.println("O quadrado � " + quadrado);
		}
		ler.close();
	}
	
	
}
