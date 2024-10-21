package ejercicios;

/**
 * 
 * Escribir todos los números del 100 al 0 de 7 en 7. Al final mostrar las siguientes Estadísticas.
 * Cuantos números has escrito
 * Cuanto suman los números escritos
 * Cuantos de estos números son pares.
 */

public class Ejercicio3 {
	
	public static void main(String[] args) {
		System.out.println("Hola");
		
		int totalNumeros = 0;
		int totalPares = 0;
		int sumaTotalNumeros = 0;
		
		for (int i = 100; i > 0; i -= 7) {
			System.out.println(i);
			totalNumeros++;
			sumaTotalNumeros += i;
			if ( ( i % 2 ) == 0 ) {
				totalPares++;
			}
		}
		
		System.out.println("Hemos escrito " + totalNumeros + " numeros");
		System.out.println("Los numeros escritos suman " + sumaTotalNumeros);
		System.out.println("Hay " + totalPares + " numeros pares");
		
	}
	
}
