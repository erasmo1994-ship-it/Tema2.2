import java.util.Scanner;

public class Ejercicio20 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero;
		do {
			System.out.println("Intriduzca un numero mayor que 0: ");
			numero = teclado.nextInt();
		} while (numero < 0);
		String binario = "";
		while (numero != 0) {
			int cifra = numero % 2;
			binario = cifra + binario;
			System.out.println(binario);
			numero = numero / 2;
		}
		System.out.println("El numero binario es: " + binario);
	}
	

}
