package exercicios;

import java.util.Scanner;
import java.lang.Math;

public class exercicio6 {
	public static void main(String[] args) {
		
		double x1, y1, x2, y2, d, potencia1, potencia2;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor de x1: ");
		x1 = ler.nextDouble();
		
		System.out.println("\nInsira o valor de y1: ");
		y1 = ler.nextDouble();
		
		System.out.println("\nInsira o valor de x2: ");
		x2 = ler.nextDouble();
		
		System.out.println("\nInsira o valor de y2: ");
		y2 = ler.nextDouble();
		
		potencia1 = (x2-x1)*(x2-x1);
		potencia2 = (y2-y1)*(y2-y1);
		d = (Math.sqrt(potencia1 + potencia2));
		
		System.out.println("A distância entre os dois pontos é " + d);
		
		ler.close();
		
	}
}
