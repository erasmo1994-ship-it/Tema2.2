import java.util.Scanner;

public class Ejercicio19 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Introduce un numero entre 2 y 100");
			numero = teclado.nextInt();

		} while (numero < 1 || numero > 100);
		
		for (int i = 1; i <= numero; i++) {
			
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j + " ");
			}
			System.out.println("");
		}teclado.close();

	}

}
