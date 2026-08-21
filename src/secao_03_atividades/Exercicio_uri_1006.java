package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1006 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A = sc.nextDouble();
		double B = sc.nextDouble();
		double C = sc.nextDouble();
		double media = ((A * 2) + (B * 3) + (C * 5)) / 10;
		
		//Tentei fazer com println mas acusou erro na escrita
		//do valor da media, usei o printf e limitei para uma
		//casa decimal como solicitado e funcionou.
		System.out.printf("MEDIA = %.1f%n", media);
		
		
		sc.close();

	}

}
