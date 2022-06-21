package unidad4_ejercicios_b;
import java.util.Scanner;
public class Children extends Father{
	/*
	 * @Arias Hernandez Jose Manuel
	 */
	protected String nombre, curp, rfc, matricula;
	public void RasgosHijo() {
		Scanner leer=new Scanner(System.in);
		System.out.println();
		System.out.println("*****Datos de la clase hijo******");
		System.out.println("Ingresa los datos que se te pidan");
		System.out.println();

		System.out.println("Ingresa tu nombre");
		nombre=leer.nextLine();
		System.out.println("Ingresa tu curp");
		curp=leer.nextLine();
		System.out.println("Ingresa tu RFC");
		rfc=leer.nextLine();
		System.out.println("Ingresa tu matricula");
		matricula=leer.nextLine();
	}
	
	public void SalidaDeDatos2() {
		System.out.println();
		System.out.println("*****Datos del hijo*****");
		System.out.println("Nombre: "+nombre);
		System.out.println("CURP: "+curp);
		System.out.println("RFC: "+rfc);
		System.out.println("MATRICULA: "+matricula);
		System.out.println("Color de ojos: "+ojos);
		System.out.println("Tipo de cabello:"+cabello);
		System.out.println("Color de piel: "+piel);
		System.out.println("Tipo de altura: "+estatura);
		System.out.println("Tipo de omplexión: "+complexion);
		System.out.println("Tu color de cabello: "+colorCabello);
	}

}
