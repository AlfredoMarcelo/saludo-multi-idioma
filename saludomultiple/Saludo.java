package saludomultiple;

import java.util.Scanner;

public class Saludo {
	
	public static void main(String[] args) {
		//instrucciones
		System.out.println("Selecciona el número del idioma en que deseas ser saludado: \n1. Espanol\n2. Ingles\n3. Frances\n =====");
		//Scanner para capturar el dato
		Scanner teclado = new Scanner( System.in);
		//se asigna el dato a la variable string idioma
		int idioma = teclado.nextInt();
		
		switch(idioma) {
			case 1:
				System.out.println("Hola Mundo");
				break;
			case 2:
				System.out.println("Hello World");
				break;
			case 3:
				System.out.println("Salut Monde");
				break;
		}
		
	}
}
