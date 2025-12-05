import java.util.Scanner;
public class Ejercicio7dowhile {
	public static void main(String[] args) {		
		Scanner teclado = new Scanner(System.in);
		int numero;		
		int contador = 0;
		int numeroAdivinar = 7;		
		do {
			System.out.print("Introduce un número: ");
			numero = teclado.nextInt();
			contador ++;
			if (numero == numeroAdivinar) {
				System.out.println("Que Chimba, has adivinado");
				System.out.println("Numero de intentos es igual: " + contador);
				System.out.println("Finaliza");
			}else {
				System.out.println("Sigue intentando....");
				System.out.println("Numero de intentos es igual: " + contador);
			}				
        } while (numero != numeroAdivinar);		
		teclado.close();
		
		}

}
