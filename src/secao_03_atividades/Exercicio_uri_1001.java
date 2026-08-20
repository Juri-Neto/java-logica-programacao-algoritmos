package secao_03_atividades;

import java.util.Scanner;

public class Exercicio_uri_1001 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Declarei as variáveis e já fiz a leitura na mesma linha
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		//Declarei a variável junto com a expressão na mesma linha
		int X = A + B;
		
		//Println imprime o fim de linha (quebra de linha)
		System.out.println("X = " + X); 
		
		//Fecha o scanner
		sc.close(); 

	}

}
