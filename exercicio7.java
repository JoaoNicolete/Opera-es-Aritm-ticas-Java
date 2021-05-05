package exercicios;

import java.util.Scanner;

public class exercicio7 {

	public static void main(String[] args) {
		double a, b, c, d, E, f, x, y;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira o valor de a: ");
		a = ler.nextDouble();
		
		System.out.println("Insira o valor de b: ");
		b = ler.nextDouble();
		
		System.out.println("Insira o valor de c: ");
		c = ler.nextDouble();
		
		System.out.println("Insira o valor de d: ");
		d = ler.nextDouble();
		
		System.out.println("Insira o valor de e: ");
		E = ler.nextDouble();
		
		System.out.println("Insira o valor de f: ");
		f = ler.nextDouble();
		
		x = (((c*E)-(b*f))/((a*E)-(b*d)));
		y = (((a*f)-(c*d))/((a*E)-(b*d)));
		
		System.out.println("X é igual a " + x + " e y é igual a " + y);
		
		ler.close();
		
		

	}

}
