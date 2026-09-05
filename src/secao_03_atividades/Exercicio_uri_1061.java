package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1061 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		//Strings de lixo para serem utilizadas na entrada
		//sem precisar serem salvas e influenciar na saida.
		String lixoDia1 = sc.next();
		int diaInicio = sc.nextInt();

		int h1 = sc.nextInt();
		String lixoDoisPontos1 = sc.next();
		int m1 = sc.nextInt();
		String lixoDoisPontos2 = sc.next();
		int s1 = sc.nextInt();
		
		//Transforma todos os valores em um valor completo de segundos do dia inicial
		int totalInicioSegundos = (diaInicio * 86400) + (h1 * 3600) + (m1 * 60) + s1;
		
		
		String lixoDia2 = sc.next();
		int diaFinal = sc.nextInt();
		
		int h2 = sc.nextInt();
		String lixoDoisPontos3 = sc.next();
		int m2 = sc.nextInt();
		String lixoDoisPontos4 = sc.next();
		int s2 = sc.nextInt();
		
		//Transforma todos os valores em um valor completo de segundos do dia final
		int totalTerminoSegundos = (diaFinal * 86400) + (h2 * 3600) + (m2 * 60) + s2;
		
		//Subtrai para encontrar quantidade total de segundos dos termino e inicio.
		int totalSegundos = totalTerminoSegundos - totalInicioSegundos;
		
		//Vai fazendo divisão e reutilizando a variavel para
		//encontrar o resto do valor novo encontrado para ir 
		//atribuindo as novas variáveis W,X,Y,Z.
		int W = totalSegundos / 86400;
		totalSegundos = totalSegundos % 86400;
		int X = totalSegundos / 3600;
		totalSegundos = totalSegundos % 3600;
		int Y = totalSegundos / 60;
		totalSegundos = totalSegundos % 60;
		int Z = totalSegundos;
		
		System.out.println(W + " dia(s)");
		System.out.println(X + " hora(s)");
		System.out.println(Y + " minuto(s)");
		System.out.println(Z + " segundo(s)");
				
		sc.close();

	}

}
