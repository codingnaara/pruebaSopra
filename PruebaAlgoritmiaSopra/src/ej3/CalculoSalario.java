package ej3;

import java.util.Scanner;

public class CalculoSalario {
	
	private static Scanner sc;
	
	private static void inicializa () {
		sc  = new Scanner(System.in);
	}
	
	private static int horasTrabajadas() {
        System.out.print("Ingrese la cantidad de horas trabajadas: ");
        return Integer.parseInt(sc.nextLine());
	}
	
	private static double tarifa() {
		System.out.print("Ingrese la tarifa por hora: ");
        return sc.nextDouble();
	}
	
	private static double calculaSueldo(int horasTrabajadas, double tarifa) {
		
		double sueldo;
		
        if (horasTrabajadas > 40) {
            int horasExtras = horasTrabajadas - 40;
            double tarifaExtra = tarifa * 1.5; 
            sueldo = (40 * tarifa) + (horasExtras * tarifaExtra);
        } else {
            sueldo = horasTrabajadas * tarifa;
        }
        
        return sueldo;
	}
	
	private static void dispose() {
		if(sc!=null)sc.close();
	}

    public static void main(String[] args) {
    	
    	inicializa();

    	int horasTrabajadas = horasTrabajadas();

    	double tarifa = tarifa();

        double sueldo = calculaSueldo(horasTrabajadas, tarifa);

        System.out.printf("El sueldo del trabajador es: %.2f\n", sueldo);

        dispose();
    }
}
