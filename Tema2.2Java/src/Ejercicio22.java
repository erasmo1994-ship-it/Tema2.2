import java.util.Scanner;

public class Ejercicio22 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, sumatorio = 0;
		
		System.out.println("Ingresa un numero");
		numero = teclado.nextInt();
		
		for (int i = 1; i < numero; i++) {
			if (numero % i == 0) {
				sumatorio = sumatorio + i;
			System.out.println(i);
			
			}
			}if (sumatorio == numero) {
				System.out.println("El numero es perfecto");
			}else {
				System.out.println("El numero no es perfecto");
			}
				

			
		}

	}


