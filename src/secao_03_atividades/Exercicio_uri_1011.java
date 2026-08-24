package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1011 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio = sc.nextDouble();
		//Boa prática usar meus valores com "." e mantém 
		//a escrita do resultado correta também com ponto flutuante.
		double volume = ((4.0 / 3.0) * 3.14159) * Math.pow(raio, 3.0);
		
		System.out.printf("VOLUME = %.3f%n", volume);
		
		sc.close();

	}

}
