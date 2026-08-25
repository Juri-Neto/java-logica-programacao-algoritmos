package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1019 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int segundosN = sc.nextInt();

		//Criei uma variável resto para conseguir 
		//fazer o restante das conversões.
		int horas = segundosN / 3600;
		int resto = segundosN % 3600;
		int minutos = resto / 60;
		int segundos = resto % 60;

		System.out.printf("%d:%d:%d%n", horas, minutos, segundos);
				
				
		sc.close();

	}

}
