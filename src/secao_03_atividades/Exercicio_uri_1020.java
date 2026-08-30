package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1020 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int idadeDias = sc.nextInt();
		
		//todo ano 365 dias
		//todo mes 30 dias
		//peguei o resto do idadeDias e encontrei o resto
		//novamente por 24, considerei 24 horas o dia.
		//Essa afirmação esta arrada porque a entrada já veio em dias
		//se retirar o 24 vai perceber que funciona, o 24 causaria
		//problemas com outros inputs. Não precisa do resto de 24, porque
		//já tendo resto de 30, o número sempre vai cair entre 0 e 29 para os dias
		//e se chegar a bater 30 vai ser classificado como mes. Por isso o 24
		//é um erro.
		int anos = idadeDias / 365;
		idadeDias = idadeDias % 365;
		int meses = idadeDias / 30;
		idadeDias = idadeDias % 30;
		int dias = idadeDias; //int dias = idadeDias % 24; ERRADO
		
		System.out.println(anos + " ano(s)");
		System.out.println(meses + " mes(es)");
		System.out.println(dias + " dia(s)");
		
		sc.close();

	}

}
