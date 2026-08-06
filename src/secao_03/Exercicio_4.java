package secao_03;

import java.util.Scanner;

/*
 * Entrada de dados em Java - Parte 1
 * 
 * Exemplos propostos durante a aula.
 */

public class Exercicio_4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//ex1
		//Printar uma String, se der espaço e botar mais de uma palavra só pega a primeira.
		String x;
		x = sc.next();
		System.out.println("Você digitou: " + x);
		
		//sc.close(); - Inicialmente deixei close aqui e tentei no exemplo abaixo e deu erro pois o Scanner foi fechado antes
		//e eu tentei usar sc novamente para atribuir a uma nova variavel sendo que já tinha fechado com sc.close
		//lembrar de sempre usar no final do programa ou quando não for usar mais Scanner com certeza.
		
		
		//ex2
		//printar o número inteiro.
		int y;
		y = sc.nextInt();
		System.out.println("Você digitou: " + y);
		
		
		//ex3
		//Se quiser usar "." na entrada de dados precisa usar o Locale.US como mostrado anteriormente.
		double z;
		z = sc.nextDouble(); //se usar nextInt com double declarado funciona mas a entrada precisa ser com número inteiro.
		System.out.println("Você digitou: " + z); //println pega localidade do sistema para separador de casas decimais.
		System.out.printf("Você digitou: %.2f%n", z); //printf usa "," e não "+" para concatenar e imprime seja "," ou "."
		
		
		//ex4
		//se trocar o zero do "charAt(0)" ele vai pegar outra letra primeiro da String.
		char i;
		i = sc.next().charAt(0);
		System.out.println("Você digitou: " + i);
		
		
		//ex5
		//Digitar estes dados todos na mesma linha com espaçamentos e somente depois dar enter.
		//Funciona adicionando um de cada vez também.vez também.
		String a;
		int b;
		double c;
		a = sc.next();
		b = sc.nextInt();
		c = sc.nextDouble();
		System.out.println("Dados Digitados:");
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		sc.close(); //note que agora fechei o scanner, já que sei que não usarei mais.

	}

}
