/*
 * Objetivo: Realizar las operaciones matematicas
 * Nombre: Elisabeth Ramos Serón 
 * Fecha: 28/10/2026
 */


package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {
	
	public enum OperacionesMatematicas {OPERACION, FUERZA_PESO, NUMERO_VUELTAS, AREA_CIRCULO};

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int variableX;
		int masa;
		double gravedad = 9.8;
		double frecuencia;
		int tiempo;
		double radio;
		
		System.out.println("CALCULO DE EXPREXIONES FISICAS Y MATEMATICAS");
		System.out.println("----------------------------------------------");
		
		//Valor de X
		System.out.print("Introduce el valor de x: ");
		variableX = teclado.nextInt();
		
		//Valor de la masa
		System.out.print("Introduce el valor de la masa: ");
		masa = teclado.nextInt();
		
		//Valor del tiempo
		System.out.print("Introduce el valor del tiempo: ");
		tiempo = teclado.nextInt();
		
		//Valor de la frecuencia 
		System.out.print("Introduce el valor de la frecuencia: ");
		frecuencia = teclado.nextDouble();
		
		//Valor del radio 
		System.out.print("Introduce el valor para el radio: ");
		radio = teclado.nextDouble();
		
		System.out.println("\nRESULTADOS");
		System.out.println("----------------------------------------------");
		
		//OPERACION = (x + (x/4.0)) / (6.0 - (x/2.0))
		double operacion = (variableX + (variableX/4.0)) / (6.0 - (variableX / 2.0)); 
		OperacionesMatematicas resultadoOperacion = OperacionesMatematicas.OPERACION;
		
		System.out.println(resultadoOperacion + ": " + operacion);
		
		//FUERZA_PESO = (m * g)
		double fuerzaPeso = (masa * gravedad); //Cast de int a double
		OperacionesMatematicas resultadoFuerza = OperacionesMatematicas.FUERZA_PESO;
		
		System.out.println(resultadoFuerza + ": " + fuerzaPeso);
		
		//NUMERO_VUELTAS = (f * t)
		double numeroVueltas = (frecuencia * tiempo);
		OperacionesMatematicas resultadoVueltas = OperacionesMatematicas.NUMERO_VUELTAS;
		
		System.out.println(resultadoVueltas + ": " + (int) numeroVueltas); //Cast explícito para que las vueltas las imprima de tipo entero.
		
		
		//AREA_CIRCULO = (PI * (r)^2)
		double areaCirculo = (Math.PI * (radio * radio));
		OperacionesMatematicas resultadoArea = OperacionesMatematicas.AREA_CIRCULO;
		System.out.println(resultadoArea + ": " + areaCirculo);
	
		teclado.close();
	}
}
