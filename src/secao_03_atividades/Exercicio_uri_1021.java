package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1021 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorMonetarioN = sc.nextDouble();
		
		int nota100 = (int) (valorMonetarioN / 100);
		valorMonetarioN = valorMonetarioN % 100;
		int nota50 = (int) (valorMonetarioN / 50);
		valorMonetarioN = valorMonetarioN % 50;
		int nota20 = (int) (valorMonetarioN / 20);
		valorMonetarioN = valorMonetarioN % 20;
		int nota10 = (int) (valorMonetarioN / 10);
		valorMonetarioN = valorMonetarioN % 10;
		int nota5 = (int) (valorMonetarioN / 5);
		valorMonetarioN = valorMonetarioN % 5;
		int nota2 = (int) (valorMonetarioN / 2);
		valorMonetarioN = valorMonetarioN % 2; //Tinha esquecido de encontrar o resto do 2 e tinha dado erro em algumas saidas.
		
		//quantidade de moedas possíveis.
		int moeda1 = (int) (valorMonetarioN / 1.00);
		valorMonetarioN = valorMonetarioN % 1.00;
		
		//a entrada tendo sido sido feito em double, fazendo o resto dela
		//diversas vezes vai deixando poeira matemática e imprecisão dos pontos
		//flutuantes, baseado no ultimo resto feito do 1.00 vai dar um valor impreciso.
		//fazendo uma nova variavel centavos, somando o restante do valor necessário para suprir 
		// a imprecisão e multiplicando por 100 temos um valor inteiro com casting.
		//Usando a nova variável centavos dar continuidade para encontrar a quantidade
		//de moedas.
		int centavos = (int) ((valorMonetarioN + 0.0001) * 100);
		
		int moeda50 = (centavos / 50);
		centavos = centavos % 50;
		int moeda25 = (centavos / 25);
		centavos = centavos % 25;
		int moeda10 = (centavos / 10);
		centavos = centavos % 10;
		int moeda05 = (centavos / 5);
		centavos = centavos % 5;
		int moeda01 = (centavos / 01);
		centavos = centavos % 01;
		
		System.out.println("NOTAS:");
		System.out.println(nota100  + " nota(s) de R$ 100.00");
		System.out.println(nota50 + " nota(s) de R$ 50.00");
		System.out.println(nota20 + " nota(s) de R$ 20.00");
		System.out.println(nota10 + " nota(s) de R$ 10.00");
		System.out.println(nota5 + " nota(s) de R$ 5.00");
		System.out.println(nota2 + " nota(s) de R$ 2.00");
		System.out.println("MOEDAS:");
		System.out.println(moeda1 + " moeda(s) de R$ 1.00");
		System.out.println(moeda50 + " moeda(s) de R$ 0.50");
		System.out.println(moeda25 + " moeda(s) de R$ 0.25");
		System.out.println(moeda10 + " moeda(s) de R$ 0.10");
		System.out.println(moeda05 + " moeda(s) de R$ 0.05");
		System.out.println(moeda01 + " moeda(s) de R$ 0.01");
		

		
		sc.close();

	}

}
