package ej2;

import java.util.Random;

public class ClasificacionPersonas {

    private static class Persona {
        private final String sexo;
        private final int edad;

        public Persona(String sexo, int edad) {
            this.sexo = sexo;
            this.edad = edad;
        }

        public String getSexo() {
            return sexo;
        }

        public int getEdad() {
            return edad;
        }
    }
    
    public static void leerPersonas() {
    	final int TOTAL_PERSONAS = 50;
    	
    	Persona[] PERSONAS = new Persona[TOTAL_PERSONAS];
    	Random random = new Random();
    	
    	// Datos aleatorios de personas
    	for (int i = 0; i < TOTAL_PERSONAS; i++) {
    		String sexo = random.nextBoolean() ? "M" : "F";
    		int edad = random.nextInt(80);
    		PERSONAS[i] = new Persona(sexo, edad);
    	}
    	
    	int mayoresEdad = 0;
    	int menoresEdad = 0;
    	int masculinosMayoresEdad = 0;
    	int femeninasMenoresEdad = 0;
    	int totalMujeres = 0;
    	
    	for (Persona persona : PERSONAS) {
    		if (persona.getEdad() >= 18) {
    			mayoresEdad++;
    			if (persona.getSexo().equals("M")) {
    				masculinosMayoresEdad++;
    			}
    		} else {
    			menoresEdad++;
    			if (persona.getSexo().equals("F")) {
    				femeninasMenoresEdad++;
    			}
    		}
    		if (persona.getSexo().equals("F")) {
    			totalMujeres++;
    		}
    	}
    	
    	// porcentajes
    	
    	double porcentajeMayoresEdad = (mayoresEdad * 100.0) / TOTAL_PERSONAS;
    	double porcentajeMujeres = (totalMujeres * 100.0) / TOTAL_PERSONAS;
    	
    	System.out.println("Personas mayores de edad: " + mayoresEdad);
    	System.out.println("Personas menores de edad: " + menoresEdad);
    	System.out.println("Hombres mayores de edad: " + masculinosMayoresEdad);
    	System.out.println("Mujeres menores de edad: " + femeninasMenoresEdad);
    	System.out.printf("Porcentaje de personas mayores de edad: %.2f%%\n", porcentajeMayoresEdad);
    	System.out.printf("Porcentaje de mujeres: %.2f%%\n", porcentajeMujeres);
    }

    public static void main(String[] args) {
        leerPersonas();
    }


}