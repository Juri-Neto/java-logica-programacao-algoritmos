package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_resolvido_03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Foi usado "next" e não "nextLine" porque queremos ler apenas uma palavra
		//até o espaço em branco. Caso tivesse usado "nextLine" talvez até precisasse de 
		//"nextLine" extras para corrigir a quebra de linha pendente que acaba armazenando
		//quebra de linha e registrando valores em branco na variável. O que não é o caso aqui.
		String nome1= sc.next();
		int idade1 = sc.nextInt();
		String nome2 = sc.next();
		int idade2 = sc.nextInt();
		//Precisa usar parênteses na soma se não ele vai 
		//resolver a divisão primeiro.
		//Se usar "2" e não "2.0" o valor é arredondado, portanto variáveis double
		//sempre declarar com ponto. Da pra fazer casting, fazendo "(double)" no inicio
		//da expressão caso esteja "2" e não "2.0".
		double idadeMedia = (idade1 + idade2) / 2.0;
		
		System.out.printf("A idade média de %s e %s é de %.1f anos%n", nome1, nome2, idadeMedia);
		
		
		sc.close();
		
	}

}
