package exercicios;

import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		double custoDeFabrica, distribuidor, impostos, consumidor;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Insira os custos de fábrica: ");
		custoDeFabrica = ler.nextDouble();
		
		distribuidor = (custoDeFabrica / 100) * 28;
		impostos = (custoDeFabrica / 100) * 45;
		consumidor = (custoDeFabrica + distribuidor + impostos);
		
		System.out.println("O custo final para o cliente é de " + consumidor + " reais");
		
		ler.close();
		

		
	}

}
