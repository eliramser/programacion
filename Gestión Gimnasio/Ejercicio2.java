package ejercicio2;

import java.util.Scanner;

public class Ejercicio2 {

public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		//Precio base
		final double FITNESS = 10.0;
		final double YOGA = 15.0;
		final double MUSCULACION = 20.0;
		
		int opcion;
		
		System.out.println("GESTION DE UN GIMNASIO");
		System.out.println("-----------------------------");
		System.out.println("Precio de la matricula tipo 1 (FITNESS): 10.0€");
		System.out.println("Precio de la matricula tipo 2 (YOGA): 15.0€");
		System.out.println("Precio de la matricula tipo 3 (MUSUCULACIÓN): 20.0€");
		
		do {
			System.out.println("\n--- MENU DE OPERACIONES ---");
			System.out.println("1. Calcular PVP de cada matricula.");
			System.out.println("2. Aplicar oferta a un tipo de matricula (sin iva).");
			System.out.println("3. Calcular el importe total de matriculas realizadas (sin iva).");
			System.out.println("4. Salir.");
			
			System.out.print("Seleccione un opción: ");
			opcion = teclado.nextInt();
			
			//Opcion del usuario
			switch (opcion) {
			
			case 1: //Pedimos el IVA y la calculamos
				
				double iva1;
				double iva2;
				double iva3;
				double pvp;
			

				System.out.print("Ingrese el IVA para el tipo de matricula 1 (4-10-21): ");
				iva1 = teclado.nextDouble();
				
				System.out.print("Ingrese el IVA para el tipo de matricula 2 (4-10-21): ");
				iva2 = teclado.nextDouble();
				
				System.out.print("Ingrese el IVA para el tipo de matricula 3 (4-10-21): ");
				iva3 = teclado.nextDouble();
				
				//Calculo del Iva
				pvp = FITNESS + ((FITNESS * iva1) /100);
				System.out.println("El PVP de la actividad Fitness es: " + pvp + "€");
				
				pvp = YOGA + ((YOGA * iva1) /100);
				System.out.println("El PVP de la actividad Yoga es: " + pvp + "€");
				
				pvp = MUSCULACION + ((MUSCULACION * iva1) /100);
				System.out.println("El PVP de la actividad Musculacion es: " + pvp + "€");
				
				System.out.println(" ");
				break;
				
			case 2: //Aplicar oferta a un tipo de matricula
				
				double precioOferta;
				double descuento;
				int matricula;
				
				System.out.print("Seleccione el tipo de matricula: ");
				matricula = teclado.nextInt();
				
				System.out.print("Ingrese el descuento a aplicar: ");
				descuento = teclado.nextDouble();
				
				if (matricula == 1) {
					precioOferta = FITNESS - ((FITNESS * descuento) / 100);
					System.out.println("El precio final (sin iva) con descuento " + descuento + " para el tipo de matricula 1 es: " + precioOferta + "€");
				} else if (matricula == 2) {
					precioOferta = YOGA - ((YOGA * descuento) / 100);
					System.out.println("El precio final (sin iva) con descuento " + descuento + " para el tipo de matricula 2 es: " + precioOferta + "€");
					
				}else if (matricula == 3) {
					precioOferta = MUSCULACION - ((MUSCULACION * descuento) / 100);
					System.out.println("El precio final (sin iva) con descuento " + descuento + " para el tipo de matricula 3 es: " + precioOferta + "€");
					
				}else {
					System.out.println("Esa matricula no es valida.");
				}
				
				System.out.println(" ");
				break;
				
			case 3: //Calcular el importe de matriculas realizadas
				
				int matriculasFitness;
				int matriculasYoga;
				int matriculasMusculacion;
				double importeTotal;
				
				System.out.print("Introduce el numero de  matriculas  realizadas en fitness: ");
				matriculasFitness = teclado.nextInt();
				
				System.out.print("Introduce el numero de matriculas realizadas en Yoga: ");
				matriculasYoga = teclado.nextInt();
				
				System.out.print("Introduce el numero de matriculas realizadas en Musculacion: ");
				matriculasMusculacion = teclado.nextInt();
				
				importeTotal = ((FITNESS * matriculasFitness) + (YOGA * matriculasYoga) + (MUSCULACION * matriculasMusculacion));
				System.out.println("El importe total (sin iva) de las matriculas realizadas es: " + importeTotal + "€");
				
				System.out.println(" ");
				break;
			case 4:
				System.out.println("Saliendo del programa...");
				break;
				
			default:
				System.out.println("Opción no válida. Intentelo de nuevo.");
				
			}
			
			
		} while (opcion != 4);
		
		teclado.close();

	}

}
