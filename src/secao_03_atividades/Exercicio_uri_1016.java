package secao_03_atividades;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_uri_1016 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int distancia = sc.nextInt();
		int carroX = 60;
		int carroY = 90;
		//Quanto tempo leva para o carro Y tomar distancia desejada contra o carro X.
		int tempoMinutos = (carroX / carroY) + distancia * 2;
		
		System.out.println(tempoMinutos + " minutos");
		
		sc.close();

	}

}
