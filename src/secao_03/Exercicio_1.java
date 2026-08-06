package secao_03;

import java.util.Locale;


/*
 * 17. Exercicio Saída de dados em Java.
 * Atividade com exemplos feito ao longo da aula 
 * utilizando diversos exemplos com print, println
 * printf para saída de dados.
 */
public class Exercicio_1 {

	public static void main(String[] args) {
		
		System.out.println("Hello World!");
		System.out.println("Bom dia!");
		
		System.out.print("Conteúdo sem quebra de linha...");
		System.out.println(" Tá vendo?");//Note que o 32 está em baixo porque tem quebra de linha agora.
		
		int y = 32; //Boa prática é organizar as variáveis no topo mas para esta atividade tudo bem.
		double x = 10.35784;
		
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f%n", x); //Duas casas decimais.
		System.out.printf("%.4f%n", x); //Quatro casas decimais.
		System.out.printf("%.0f%n", x); //Arredondado.
		Locale.setDefault(Locale.US); /*Para funcionar precisa usar antes da declaração do Scanner ou do print especifico 
		                              que você quiser. Vai usar "." a partir da sua declaração.*/
		System.out.printf("%.4f%n", x); //Utilizando "." ao invés de "," daqui pra baixo.
		System.out.println("RESULTADO = " + x + " METROS"); //Concatenado normal.
		System.out.printf("RESULTADO = %.2f metros%n", x); //Concatenado utilizando printf.
		
		//Variaveis para novo exemplo utilizando marcadores para concatenar. Para este exercicio tudo ser aqui.
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		

	}

}
