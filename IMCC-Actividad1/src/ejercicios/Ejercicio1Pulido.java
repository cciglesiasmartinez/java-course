package ejercicios;

import java.util.Scanner;

public class Ejercicio1Pulido {
	
	/**
	 * Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, 
	 * Suficiente, Bien, Notable y sobresaliente. Si la nota introducida 
	 * no está en el rango mostrar el mensaje “Nota errónea”.
	 * @param args
	 */
	
	public static void main(String[] args) {
		
		// Inicializa una instancia de Scanner para la entrada de teclado
		Scanner entradaTeclado = new Scanner(System.in);
		
		// Llamamos al método pideUnaNota enviándole como argumento
		// nuestra entradaTeclado (Scanner)
		pideUnaNota(entradaTeclado);
		
	}
	
	// Este método de ayuda nos permitirá controlar si el valor de entrada
	// es válido o no y funcionará de manera recursiva.
	private static void pideUnaNota(Scanner entradaTeclado) {
		try {
			
			// Pedimos la nota por consola.
			System.out.println("Introduce una nota entre 0 y 10: ");
			
			// Leemos el valor provisto como entero
			int nota = entradaTeclado.nextInt();
			
			// En caso de que todo haya salido bien, enviamos el valor 
			// a otro método de ayuda que procesará la lógica pedida.
			procesarNota(nota);
			
			// Y finalizamos la instancia de Scanner
			entradaTeclado.close();
			
		} catch (Exception e) {
			
			// En caso de error, notificamos el error capturado
			System.out.println("Se ha producido un error: " + e);
			
			// Limpiamos el buffer del Scanner para evitar un bucle infinito.
			entradaTeclado.nextLine();
			
			// Creamos una nueva instancia del Scanner
			Scanner nuevaEntradaTeclado = new Scanner(System.in);
			
			// Y volvemos a llamar a este mismo método con ella
			pideUnaNota(nuevaEntradaTeclado);
		}
	}
	
	private static void procesarNota(int nota) {
		
		// Procesamos la nota con una estructura switch
		switch (nota) {
			case 0:
				System.out.println("Insuficiente");
				System.out.println("Programa terminado.");
				break;
			case 1:
				System.out.println("Insuficiente");
				System.out.println("Programa terminado.");
				break;
			case 2:
				System.out.println("Insuficiente");
				System.out.println("Programa terminado.");
				break;
			case 3:
				System.out.println("Insuficiente");
				System.out.println("Programa terminado.");
				break;
			case 4:
				System.out.println("Insuficiente");
				System.out.println("Programa terminado.");
				break;
			case 5:
				System.out.println("Suficiente");
				System.out.println("Programa terminado.");
				break;
			case 6:
				System.out.println("Bien");
				System.out.println("Programa terminado.");
				break;
			case 7:
				System.out.println("Notable");
				System.out.println("Programa terminado.");
				break;
			case 8:
				System.out.println("Notable");
				System.out.println("Programa terminado.");
				break;
			case 9:
				System.out.println("Sobresaliente");
				System.out.println("Programa terminado.");
				break;
			case 10:
				System.out.println("Sobresaliente");
				System.out.println("Programa terminado.");
				break;
			default:
				System.out.println("Número incorrecto.");
				Scanner nuevaEntradaTeclado = new Scanner(System.in);
				pideUnaNota(nuevaEntradaTeclado);
				break;
		}
		
	}
	
}
