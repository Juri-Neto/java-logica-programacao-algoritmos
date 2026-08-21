package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1014 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int totalPercorrido = sc.nextInt();
		double totalGasto = sc.nextDouble();
		double consumoMedio = totalPercorrido / totalGasto;
		
		//Escrevendo com 3 casas decimais e quebra de linha no final.
		System.out.printf("%.3f km/l%n", consumoMedio); 
		
		
		sc.close();

	}

}
