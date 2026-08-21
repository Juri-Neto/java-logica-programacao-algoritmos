package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1017 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int tempoGasto = sc.nextInt();
		int velocidadeMedia = sc.nextInt();
		//Se deixar somente "12" vai arrendondar por achar que é inteiro, pode deixar 12.000 ou fazer casting como agora
		//adicinando (double) antes do "12" vai escrever o resultado corretamente.
		double quantLitros = (tempoGasto * velocidadeMedia) / (double) 12;
		
		System.out.printf("%.3f%n", quantLitros);
		
		
		sc.close();

	}

}
