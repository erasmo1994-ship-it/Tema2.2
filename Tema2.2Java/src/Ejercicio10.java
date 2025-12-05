import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;

		int contador = 0;

		do {
			System.out.println("Ingresa un número");
			numero = teclado.nextInt();

			contador = 0;

			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					contador++;

				}
			}

		} while (contador != 2);

		if (contador != 2) {
			System.out.println("No es primo");

		} else {
			System.out.println("Es primo");
		}

	}
}
