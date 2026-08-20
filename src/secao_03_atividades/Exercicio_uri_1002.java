package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1002 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double n = 3.14159;
		double raio = sc.nextDouble();
		double area = n * (raio * raio); //Ao quadrado, multiplicado por ele mesmo.
		
		//"%.4f"para 4 casas decimais e "%n" no final para quebra de linha.
		System.out.printf("A=%.4f%n", area);
		
		sc.close();

	}

}
