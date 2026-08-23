package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_02 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double base = sc.nextDouble();
		double altura = sc.nextDouble();
		
		double AREA = base * altura;
		//Sempre que trabalhar com números double, lembrar de adicionar "2.0" e não "2"
		//o "." é uma boa prática.
		//Outra forma: = 2.0 * (base + altura);
		double PERIMETRO = (2.0 * base) + (2.0 * altura);
		//Na diagonal usei a função matemática para encontrar raiz quadrada mas
		//a expressão matemática ta organizada dentro dos parênteses.
		//Outra forma: = Math.sqrt(Math.pow(base, 2.0) + Math.pow(altura, 2.0));
		double DIAGONAL = Math.sqrt((base * base) + (altura * altura)); 
		
		System.out.printf("AREA = %.4f%n", AREA);
		System.out.printf("PERIMETRO = %.4f%n", PERIMETRO);
		System.out.printf("DIAGONAL = %.4f%n", DIAGONAL);
		
		sc.close();

	}

}
