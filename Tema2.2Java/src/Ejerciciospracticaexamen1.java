import java.util.Scanner;

public class Ejerciciospracticaexamen1 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		int numero, c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 5;
		double sumaPotencias = 0;
		System.out.println("Ingresa un numero entre 100 y 9999: ");
		numero = teclado.nextInt();
		int num = numero;
		teclado.close();
		if (numero < 100 || numero > 99.999) {
			System.out.println("El numero no esta dentro del rango");
		}
			else if(numero >= 100 && numero <= 999) {
				c1 = numero % 10;
				numero = c1 / 10;
				sumaPotencias = Math.pow(c1,3);
				c2 = numero % 10;
				numero = c2 / 10;
				sumaPotencias = Math.pow(c2,3);
				c3 = numero % 10;
				numero = c3 / 10;
				sumaPotencias = Math.pow(c3,3);
				sumaPotencias = Math.pow(c1,3)+ Math.pow(c2,3)+Math.pow(c3,3);
				System.out.println("El numero es narcicista");
				
				
				
			}
			
			
		//}else {
			System.out.println("El numero no es valido");
			System.out.println("Finaliza");
			
		}

	}


