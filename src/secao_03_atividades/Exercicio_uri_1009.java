package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1009 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		double salarioFixo = sc.nextDouble();
		double vendasMes = sc.nextDouble();
		//Na primeira entrada ele esta escrevendo 684.55 e não
		//684.54 como no exemplo mas a plataforma aceitou o resultado.
		double valorReceber = (vendasMes * 0.15) + salarioFixo;
		
		System.out.printf("TOTAL = R$ %.2f%n", valorReceber);
		
		sc.close();

	}

}
