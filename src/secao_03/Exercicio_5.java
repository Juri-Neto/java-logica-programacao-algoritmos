package secao_03;

import java.util.Scanner;

/*
 * Entrada de dados em Java - Parte 2
 * 
 * Exemplos propostos durante a aula.
 */

public class Exercicio_5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		//ex1
		
		String s1, s2, s3;

		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);


		
		//ex2
		
		int x;
		String a1, a2, a3;

		x = sc.nextInt();
		sc.nextLine();
		a1 = sc.nextLine();
		a2 = sc.nextLine();
		a3 = sc.nextLine();

		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(a1);
		System.out.println(a2);
		System.out.println(a3);
		
		sc.close();

	}

}
