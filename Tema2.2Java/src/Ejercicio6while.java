import java.util.Scanner;

public class Ejercicio6while {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, digito;
		int numeroInvertido = 0;
		System.out.println(" Introduzca un número ");
		numero = teclado.nextInt();
		numero = Math.abs(numero);
		while (numero > 0) {
			digito = numero % 10;
			System.out.println("Digito: " + digito);
			numero = numero / 10;
			System.out.println("Numero: " + numero);
			numeroInvertido = numeroInvertido * 10 + digito;
			System.out.println("Numero invertido: " + numeroInvertido);
		}
		System.out.print("Número invertido " + numeroInvertido);
		teclado.close();
	}

}
