package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1010 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//codPeca1 e codPeca2 é solicitado mas não utilizado para escrita, por isso o aviso na IDE.
		int codPeca1 = sc.nextInt();
		int numPecas1 = sc.nextInt();
		double valorUnitPecas1 = sc.nextDouble();
		
		int codPeca2 = sc.nextInt();
		int numPecas2 = sc.nextInt();
		double valorUnitPecas2 = sc.nextDouble();
		
		//Var já definida com a expressão, primeiro resolve o que tiver entre parênteses e por final faz a soma.
		double valorPagar = (valorUnitPecas1 * numPecas1) + (valorUnitPecas2 * numPecas2); 
		
		System.out.printf("VALOR A PAGAR: R$ %.2f%n", valorPagar);
		
		sc.close();

	}

}
