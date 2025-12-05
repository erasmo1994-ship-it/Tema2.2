import java.util.Scanner;
 
public class Ejercicio18dowhile {
 
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int opcion, num1 = 0, num2 = 0, total;
 
		do {
			System.out.println("1 SUMA");
			System.out.println("2 RESTA");
			System.out.println("3 MULTIPLICAR");
			System.out.println("4 DIVIDIR");
			System.out.println("5 SALIR");
			System.out.println("Ingresa una opcion");
			opcion = teclado.nextInt();
			if (opcion < 0) {
				System.out.println("Finaliza");
 
			}
			switch (opcion) {
 
			case 1:
				System.out.println("Ingresa lo que quieras sumar");
				num1 = teclado.nextInt();
				System.out.println("Ingresa otro numero");
				num2 = teclado.nextInt();
				total = num1 + num2;
				System.out.println("El total es: " + total);
				break;
			case 2:
				System.out.println("Ingresa lo que quieras restar");
				num1 = teclado.nextInt();
				System.out.println("Ingresa otro numero");
				num2 = teclado.nextInt();
				total = num1 - num2;
				System.out.println("El total es: " + total);
				break;
			case 3:
				System.out.println("Ingresa lo que quieras multiplicar");
				num1 = teclado.nextInt();
				System.out.println("Ingresa otro numero");
				num2 = teclado.nextInt();
				total = num1 * num2;
				System.out.println("El total es: " + total);
				break;
			case 4:
				System.out.println("Ingresa lo que quieras vividir");
				num1 = teclado.nextInt();
				System.out.println("Ingresa otro numero");
				num2 = teclado.nextInt();
				total = num1 / num2;
				System.out.println("El total es: " + total);
				break;
			default:
				break;
			}
		} while (opcion != 5);
		System.out.println("SALIR");
 
	}
 
}
 