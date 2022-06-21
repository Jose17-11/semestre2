package unidad4_ejercicios_b;
import java.util.Scanner;
public class Father {
	
	protected String ojos="verdes", cabello="lasio", piel="moreno claro", estatura, complexion, colorCabello; 
	public void IngresarDatos() {
		
		Scanner leer=new Scanner(System.in);
		System.out.println("*****Datos de la clase padre*****");
		System.out.println("Ingresa los siguientes datos");
		System.out.println();
		System.out.println("¿Cómo te consideras de altura?, (alto, medio, bajo)");
		estatura=leer.nextLine();
		System.out.println("¿Qué complexión tienes?, (sobrepeso, promedio, delgado)");
		complexion=leer.nextLine();
		System.out.println("¿Qué color de cabello tienes?, (negro, cafe, otro)");
		colorCabello=leer.nextLine();
		
	}
	
	public void SalidaDeDatos() {
		System.out.println();
		System.out.println("*****Datos del padre*****");
		System.out.println("Color de ojos: "+ojos);
		System.out.println("Tipo de cabello: "+cabello);
		System.out.println("Color de piel: "+piel);
		System.out.println("Tipo de altura: "+estatura);
		System.out.println("Tu complexión: "+complexion);
		System.out.println("Color de cabello: "+colorCabello);
	}

}
