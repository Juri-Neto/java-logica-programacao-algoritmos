package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1003 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int SOMA = A + B;  //Soma valores lidos na var A e B.
		
		System.out.println("SOMA = " + SOMA);
		
		
		sc.close();

	}

}
