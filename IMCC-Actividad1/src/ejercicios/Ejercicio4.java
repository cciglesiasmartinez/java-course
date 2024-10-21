package ejercicios;

import java.util.Scanner;

/** 
 * Leer números hasta que se introduzca un cero. Para cada uno indicar si es 
 * par o impar. Al final mostrar las siguientes Estadísticas:
 * Cuantos son pares e impares
 * Cuanto suman los pares y cuanto los impares.
 */
public class Ejercicio4 {

	public static void main(String[] args) {
		
		int numero = 1;
		int totalPares = 0;
		int totalImpares = 0;
		int sumaPares = 0;
		int sumaImpares = 0;
		
		Scanner entradaTeclado = new Scanner(System.in);
		
		while (numero != 0) {
			System.out.println("Introduce un numero:");
			numero = entradaTeclado.nextInt();
			entradaTeclado.nextLine();
			// Cuidado con este caso, si el número es 0 el bucle todavía se ejecutará una vez más
			if ( numero != 0) {
				if ( ( numero % 2 ) == 0 ) {
					totalPares++;
					sumaPares += numero;
				} else {
					totalImpares++;
					sumaImpares += numero;
				}
			}
		}
		
		System.out.println("Has escrito " + totalPares + " pares y " + totalImpares + " impares");
		System.out.println("La suma de los pares es " + sumaPares + " y la de los impares es " + sumaImpares);
		entradaTeclado.close();
	}

}
