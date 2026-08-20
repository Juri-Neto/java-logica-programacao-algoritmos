package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1004 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int PROD = A * B; //Produto é o valor resultado da multiplicação.
		
		System.out.println("PROD = " + PROD);
		
		sc.close();

	}

}
