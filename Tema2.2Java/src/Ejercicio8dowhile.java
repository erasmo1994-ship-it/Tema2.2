import java.util.Scanner;
public class Ejercicio8dowhile {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroAleatorio = (int) (Math.random() * 100);
		System.out.println("El aleatorio es: " + numeroAleatorio);
		int turno = 1;
		int respuesta;
		do {
			System.out.println("Intenta adivinar un numero");
			System.out.println("Tienes 10 turnos");
			System.out.println("Vas por el turno: " + turno);
			respuesta = teclado.nextInt();
			if (respuesta == numeroAleatorio) {
				System.out.println("Has acertado");
			}else {
				System.out.println("Fallaste");
				int diferencia = numeroAleatorio - respuesta;
				if (diferencia < 10) {
					System.out.println("Caliente");
				}
			}
			turno++;
		}while (respuesta != numeroAleatorio && turno <= 10);
		teclado.close();
		if (respuesta != numeroAleatorio) {
			System.out.println("Has perdido");
		}else {
			System.out.println("Has ganado!!!");
		}		
	}

}
