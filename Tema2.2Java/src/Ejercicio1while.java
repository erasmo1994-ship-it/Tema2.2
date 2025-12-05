import java.util.Scanner;

public class Ejercicio1while {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int num; // Declarar la variable que almacenará el numero ingresado
		int suma = 0; // Declaran variable e incializar		
		
		while (suma < 100) {
			System.out.println("Ingresa un número");
			num = teclado.nextInt();
			if (num >= 0) {
			suma = suma + num;
			System.out.println("El acumulado es: " + suma);
			
			}else {
				System.out.println("El numero tiene que ser mayor que cero");
				
			}
		}

		System.out.println("FINAL");
		teclado.close();
	

}
	}


