import java.util.Scanner;
public class Ejercicio4ifFor {	
	public static void main(String[] args) {

		int nInf,nSup;
		int i;	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduzca un número");
		nInf = teclado.nextInt();
		System.out.println("Introduzca otro número");
		nSup = teclado.nextInt();
		
		if(nInf > nSup) {
			//SWAP ENTRE DOS VARIABLES
			int aux = nInf;
			nInf = nSup;
			nSup = aux;
		}
		for ( i = nInf; i <= nSup; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		teclado.close();
	}

}
