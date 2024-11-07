package ej1;

import java.util.Scanner;

public class parImpar {
	
	private static Scanner sc;
	
	private static void inicializa () {
		sc  = new Scanner(System.in);
	}
	
	
	private static void dispose() {
		if(sc!=null)sc.close();
	}
	
	public static int leerNumero() {
		
		System.out.println("Introduce un número entero ");
		return Integer.parseInt(sc.nextLine());
	}

	public static void main(String[] args) {
	
		inicializa();
		
		int numero = leerNumero();
		
		System.out.printf("El número %d es %s%n", numero, numero % 2 == 0 ? "par" : "impar");
		
	
		    for(int i = numero; i >= 0; i -= 2) {
		        System.out.print(i + " ");
		    }
		    System.out.println();
		
		dispose();
		
	}

}
