import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
// Pide un número del 1 al 10 y calcula su factorial.
		int numero, factorial = 1;
		do {
			System.out.println("Introduzca el número del que quiere calcular el factorial:");
			System.out.println("El número tiene que estar entre 1 y 10");
			numero = teclado.nextInt();
//Si el usuario no introduce el valor correctamente vuelve a solicitarlo hasta que 
//el valor introducido se encuentre entre 1 y 10.
			if (numero < 1 || numero > 10) {
				System.out.println("El número no está en el rango");
			}
		} while (numero < 1 || numero > 10);
		teclado.close();
		int factoria = 1;
		for (int i = numero; i >= 1; i--) {
			factoria = factoria * 1;
		}
		System.out.println(factorial);
	}
}
