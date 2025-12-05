
import java.util.Scanner;

public class Ejercicio2while {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		int i = 1;		
		System.out.println("Introduce un número");
		numero = teclado.nextInt();

		while (i <= 10) {
			System.out.println(numero + " * " + i + " = " + (numero * i));
			i++;
		}
		teclado.close();
	}

}
