package ejercicios;

import java.util.Scanner;

/**
 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, 
 * Suficiente, Bien, Notable y sobresaliente. Si la nota introducida 
 * no está en el rango mostrar el mensaje “Nota errónea”.
 */
public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		// Inicializa una instancia de Scanner para la entrada de teclado
		Scanner entradaTeclado = new Scanner(System.in);
		
		// Pedir nota por consola
		System.out.println("Introduce una nota entre 0 y 10: ");
		
		// Almacenamos la nota introducida como entero
		int nota = entradaTeclado.nextInt();
				
		// Procesamos la nota con una estructura switch
		switch (nota) {
			case 0:
				System.out.println("Insuficiente");
				break;
			case 1:
				System.out.println("Insuficiente");
				break;
			case 2:
				System.out.println("Insuficiente");
				break;
			case 3:
				System.out.println("Insuficiente");
				break;
			case 4:
				System.out.println("Insuficiente");
				break;
			case 5:
				System.out.println("Suficiente");
				break;
			case 6:
				System.out.println("Bien");
				break;
			case 7:
				System.out.println("Notable");
				break;
			case 8:
				System.out.println("Notable");
				break;
			case 9:
				System.out.println("Sobresaliente");
				break;
			case 10:
				System.out.println("Sobresaliente");
				break;
			default:
				System.out.println("Numero incorrecto.");
				break;
		}
		
		// Cerramos la entrada de teclado y damos por terminado el programa
		entradaTeclado.close();
		
	}

}
