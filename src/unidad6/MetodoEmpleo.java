package unidad6;
import java.util.Scanner;
public class MetodoEmpleo {
	String nombre;
	int edad, num;
	public void Empleo() {
		Scanner leer=new Scanner (System.in);
		System.out.println();
		System.out.println("*********************************************");
		System.out.println("********Ingresa los datos del empleado*******");
		System.out.println("Ingresa tu nombre");
		nombre=leer.next();
		System.out.println("Ingresa tu edad");
		edad=leer.nextInt();
		System.out.println("Ingresar numero de asociado");
		num=leer.nextInt();
		System.out.println();
		System.out.println("*********************************************");
		
		System.out.println();
		System.out.println("---------------------------------------------");
		System.out.println("**Datos del empleado**");
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Numero de empleado: "+num);
		System.out.println();
		System.out.println("*********************************************");
		System.out.println();
	}
	
}