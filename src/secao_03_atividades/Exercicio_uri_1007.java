package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1007 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		int D = sc.nextInt();
		int DIFERENCA = (A * B - C * D); //Mostra diferença do produto de A e B pelo produto de C e D.
		
		System.out.println("DIFERENCA = " + DIFERENCA);
		
		sc.close();
	}

}
