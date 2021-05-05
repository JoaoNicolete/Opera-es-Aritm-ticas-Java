/**
 * 
 */
package Exercícios;

import java.util.Scanner;

public class exercício1 {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int contador, numero, maior=0;
		
		for (contador=0; contador<3; contador++) {
			System.out.println("Digite o número: ");
			numero = ler.nextInt();
			
			if(numero>maior) {
				maior = numero;
			}
			
		} 	
		ler.close();
		System.out.println("O maior número é: " + maior);
		
	
	}
}
