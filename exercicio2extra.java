package Exerc�cios;

import java.util.Scanner;

public class exercicio2Novo {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Insira o primeiro n�mero: ");
		numero1 = ler.nextInt();
		
		System.out.println("Insira o segundo n�mero: ");
		numero2 = ler.nextInt();
		
		System.out.println("Insira o terceiro n�mero: ");
		numero3 = ler.nextInt();
		
		if(numero1>numero2 && numero2>numero3) {
			System.out.println("A sequ�ncia �: " + numero3 + ", " +  numero2 + ", " + numero1);
			
		} else if(numero1>numero3 && numero2<numero3) {
			System.out.println("A sequ�ncia �: " + numero2 + ", " + numero3 + ", " +  numero1);
			
		}else if(numero2>numero1 && numero1<numero3) {
			System.out.println("A sequ�ncia �: " + numero1 + ", " + numero3 + ", " + numero2);
			
		}else if(numero2>numero1 && numero1>numero3) {
			System.out.println("A sequ�ncia �: " + numero3 + ", " + numero1 + ", " + numero2);
			
		}else if(numero1>numero2 && numero2>numero3) {
			System.out.println("A sequ�ncia �: " + numero3 + ", " + numero2 + ", " + numero1);
			
		}else if(numero1>numero2 && numero2<numero3) {
			System.out.println("A sequ�ncia �: " + numero2 + ", " + numero3 + ", " + numero1);
			
		}

		ler.close();
	}

}
