package secao_03;


//18. Processamento de dados em Java e como fazer Casting

public class Exercicio_3 {

	public static void main(String[] args) {
		
		//ex 1
		int x,y;
		
		x = 5;
		y = 2 * x;
		
		System.out.println(x);
		System.out.println(y);
		System.out.println();//quebra de linha para visualizar melhor no console
		
		
		//ex 2
		int z;
		double i;
		
		z = 5;
		i = 2 * z;
		
		System.out.println(z);
		System.out.println(i);
		System.out.println(); //quebra de linha para visualizar melhor no console
		
		
		//ex 3
		double b,B,h,area;
		
		b = 6.0;
		B = 8.0;
		h = 5.0;
		
		area = (b + B) / 2.0 * h;
		
		System.out.println(area);
		System.out.println();
		
		
		//ex4
		int a, e;
		double resultado;
		
		a = 5;
		e = 2;
		
		resultado = a / e; //Sem casting
		
		System.out.println(resultado);
		System.out.println();
		
		
		//ex4.1 utilizando Casting
		int v,g;
		double resultado2;
		
		v = 5;
		g = 2;
		
		resultado2 = (double) v / g; //Com casting 
		
		System.out.println(resultado2);
		System.out.println();
		

		//ex5 sem casting e com casting
		double j;
		int k;
		
		j = 5.0;
		//k = j; (Não é permitido converter double para int pois o compilador acha que vai perder informação, precisa de Casting).
		k = (int)j; //(int) Força o compilador a aceitar mesmo com perda das casas decimais (informação) a conversão para int.
		System.out.println(k);
	}

}
