package secao_03;

import java.util.Locale;

/* O exercicio proposto foi feito de duas maneiras, uma com varios prints 
 * e outro com um printf somente que foi deixado como comentário */

//17. Saída de dados em Java//

public class Exercicio_2 {

	public static void main(String[] args) {
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30; 
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.println("Products: ");
		System.out.printf("%s, which price is $ %.2f%n", product1, price1);
		System.out.printf("%s, which price is $ %.2f%n", product2, price2);
		System.out.println();
		System.out.printf("Record: %d years old, code %d and gender %s%n", age, code, gender);
		System.out.println();
		System.out.printf("Measure with eighe decimal places: %.8f%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f%n", measure);
		
		
		//System.out.printf("Products:%n%s, which price is $ %.2f%n%s, which price is $ %.2f%n%nRecord: %d years old, code %d and gender: %s%n%nMeasure with eight decimal places: %.8f%nRouded (three decimal places): %.3f%nUS decimal point: %.3f%n ", product1, price1, product2, price2, age, code, gender, measure, measure, measure);

	}

}
