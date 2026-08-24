package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1013 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int valor1 = sc.nextInt();
		int valor2 = sc.nextInt();
		int valor3 = sc.nextInt();
		
		//"Math.max" é uma função que faz o trabalho de encontrar valor maiores entre variáveis.
		//Depois de feito, pesquisei e daria para resolver tudo dentro de uma variável só, mas a expressão
		//ficaria muito grande, ruim de ler e fazer manutenção, no entanto apesar de ter usado 2 variáveis para solucionar,
		//ficou de fácil leitura.
		int valorMaior1 = (valor1 + valor2 + Math.abs(valor1 - valor2)) / 2;
		int valorMaiorFinal = (valorMaior1 + valor3 + Math.abs(valorMaior1 - valor3)) / 2;
		
		System.out.println(valorMaiorFinal + " eh o maior");
		
		sc.close();

	}

}
