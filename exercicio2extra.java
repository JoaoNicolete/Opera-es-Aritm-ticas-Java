package Exercícios;

import java.util.Scanner;

public class exercicio2Novo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Insira o primeiro número: ");
		numero1 = ler.nextInt();
		
		System.out.println("Insira o segundo número: ");
		numero2 = ler.nextInt();
		
		System.out.println("Insira o terceiro número: ");
		numero3 = ler.nextInt();
		
		if(numero1>numero2 && numero2>numero3) {
			System.out.println("A sequência é: " + numero3 + ", " +  numero2 + ", " + numero1);
			
		} else if(numero1>numero3 && numero2<numero3) {
			System.out.println("A sequência é: " + numero2 + ", " + numero3 + ", " +  numero1);
			
		}else if(numero2>numero1 && numero1<numero3) {
			System.out.println("A sequência é: " + numero1 + ", " + numero3 + ", " + numero2);
			
		}else if(numero2>numero1 && numero1>numero3) {
			System.out.println("A sequência é: " + numero3 + ", " + numero1 + ", " + numero2);
			
		}else if(numero1>numero2 && numero2>numero3) {
			System.out.println("A sequência é: " + numero3 + ", " + numero2 + ", " + numero1);
			
		}else if(numero1>numero2 && numero2<numero3) {
			System.out.println("A sequência é: " + numero2 + ", " + numero3 + ", " + numero1);
			
		}

		ler.close();
	}

}
