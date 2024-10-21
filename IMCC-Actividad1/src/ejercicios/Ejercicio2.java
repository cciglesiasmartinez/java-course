package ejercicios;

/**
 * Diseñar un programa que muestre el producto y la suma de los 10 primeros 
 * números impares.
 */
public class Ejercicio2 {

	public static void main(String[] args) {
		
		/*
		 * Inicializamos todas las variables. Especial atención a numeroActual
		 * que empezará en 1 para no provocar un producto nulo. Lo mismo para 
		 * productoImpares que también inicializará a 1 para no provocar producto
		 * nulo.
		 */
		
		int contadorDeImpares = 0;
		int numeroActual = 1;
		int sumaImpares = 0;
		int productoImpares = 1;
		
		// Mientras que no tengamos 10 números impares ejecutaremos el bucle
		while(contadorDeImpares < 10) {
			// Si el número resulta impar
			if ( (numeroActual % 2) != 0) {
				// Sumamos el número a los anteriores
				sumaImpares += numeroActual;
				// Multiplicamos el número por los anteriores
				productoImpares *= numeroActual;
				// E incrementamos en 1 el contador de impares
				contadorDeImpares++;
			}
			// Para finalizar, pasamos al siguiente número
			numeroActual++;
		}
		
		// Escribimos el resultado y se termina el programa
		System.out.println("La suma es " + sumaImpares + " y el producto es " + productoImpares);
		
	}

}
