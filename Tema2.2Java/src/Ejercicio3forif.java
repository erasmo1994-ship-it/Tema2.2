
import java.util.Scanner;

public class Ejercicio3forif {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero = 7;
		int i = 0;		
		System.out.println("Introduce un número");
		numero = teclado.nextInt();
		for ( i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				System.out.println("El multiplo es: " + i);
			}
		}
		teclado.close();
	}

}
