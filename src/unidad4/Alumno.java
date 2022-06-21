package unidad4;
import java.util.Scanner;
//Clase principal
public class Alumno {
	/*
	 * @Arias Hernandez Jose Manuel
	 */
	String nombre, apellido;
	protected Double a, b, c, promedio;
	
	//Metodo de entrada de datos
	public void IngresarDatos() {
		Scanner leer=new Scanner(System.in);
		
		System.out.println("*****Ingresar datos*****");
		System.out.println("Ingresa tu numbre completo");
		nombre=leer.nextLine();
		System.out.println("Ingresa tus apellidos");
		nombre=leer.nextLine();
		System.out.println("Ingresar calificacion de Cálculo");
		a=leer.nextDouble();
		System.out.println("Ingresar calificacion de Taller");
		b=leer.nextDouble();
		System.out.println("Ingresar calificion de Programación");
		c=leer.nextDouble();
	}
	
	//Metodo que muestra el resultado
	public void Resultado() {
		System.out.println("Promedio final: "+promedio);
	}

}
