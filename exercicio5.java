package exercicios;

import java.util.Scanner;

public class exercicio5 {

	public static void main(String[] args) {
		int nota1, nota2, nota3, media;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira a nota 1 ");
		nota1 = ler.nextInt();
		
		System.out.println("Insira a nota 2 ");
		nota2 = ler.nextInt();
		
		System.out.println("Insira a nota 3 ");
		nota3 = ler.nextInt();
		
		media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;
		
		System.out.println("A média é " + media);
		
		ler.close();

	}

}
