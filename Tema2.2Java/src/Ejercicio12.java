import java.util.Scanner;
 
public class Ejercicio12 {
 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int contadorCeros = 0;
		int suma = 0;
		int numero = 0;
		while (contadorCeros != 5) {
			
			System.out.println("intro numero");
			numero = teclado.nextInt();
			
			suma = suma + numero;
			if (numero == 0) {
				contadorCeros++;
				System.out.println(suma);
				
			}
			
		}
	}
 
}