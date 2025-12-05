
public class Ejercicio11 {

	public static void main(String[] args) {

		int numero = 0;
		int contadorPrimos = 0 ;

		do {

			int contador = 0;
			numero++;

			for (int i = 1; i <= numero; i++) {
				if (numero % i == 0) {
					contador++;

				}
			}
			
			if(contador == 2) {
				contadorPrimos++;
				//NUMERO PRIMO
				System.out.println(numero);
				System.out.println("Es numero primo");
			}
			
		} while (contadorPrimos != 15);

	}
}
