package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1008 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int numFuncionario = sc.nextInt();
		int horasTrabalhadas = sc.nextInt();
		double valorPorHora = sc.nextDouble();
		double salario = valorPorHora * horasTrabalhadas; //Calculo para encontrar salário.
		
		System.out.println("NUMBER = " + numFuncionario); //Println para mais simples.
		System.out.printf("SALARY = U$ %.2f%n", salario); //Printf para formatação mais especifica.
		
		
		
		sc.close();
		
	}

}
