import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Ingresa un némero");
			numero = teclado.nextInt();
			if (numero < 1) {
				System.out.println("El número debe ser mayor o igual a 1");
			}
		} while (numero < 1);
		System.out.println("El número es: " + numero);
		int contadorDivisores = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contadorDivisores++;
			}

		}
		if (contadorDivisores != 2) {
			System.out.println("No es primo");

		}else {
			System.out.println("Es primo");
		}
	}

}
