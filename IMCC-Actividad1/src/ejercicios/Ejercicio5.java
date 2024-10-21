package ejercicios;

import java.util.Scanner;

/**
 * Pedimos por pantalla un nombre y una contraseña:
 * Si el nombre coincide con “sara”, preguntamos por la contraseña y si 
 * 'coincide con “sarita”, escribimos el mensaje “usuario y contraseña 
 * correctas, bienvenido a la aplicación”.
 * Si el nombre NO es “sara” Escribimos usuario incorrecto”.
 * Si el nombre es correcto y la contraseña NO, Escribimos “contraseña 
 * incorrecta”.
 */

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entradaTeclado = new Scanner(System.in);
		
		System.out.println("Introduce un nombre de usuario: ");
		String usuario = entradaTeclado.next();
		if (usuario.matches("sara")) {
			System.out.println("Intrdouce una contraseña: ");
			entradaTeclado.nextLine();
			String clave = entradaTeclado.next();
			if (clave.matches("sarita")) {
				System.out.println("Usuario y contraseña correctos, bienvenido a la aplicación.");
			} else {
				System.out.println("Contraseña incorrecta");
			}
		} else {
			System.out.println("Usuario incorrecto");
		}
		System.out.println("Fin de programa");
		entradaTeclado.close();
	}

}
