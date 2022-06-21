package unidad4_ejercicios_b;
import java.util.Scanner;
public class Ejercicio42 {
	
	public void EntradaDeDatos() {
		
	int n;
	Scanner leer=new Scanner(System.in);
	System.out.println("***** Ejercicio 42 *****");
	System.out.println("Ingrese el numero de vehiculos que desea ingresar");
	n=leer.nextInt();
	
	//Arreglo de numero de vehiculos que ingresara
	String[] vehiculo= new String[n];
	
	
	for(int i=0;i<n;i++) {
		System.out.println((i+1)+".- ingresa un automovil");
		vehiculo[i]=leer.next();
	}
	
	System.out.println("Los vehiculos son");
	for(String i: vehiculo) {
		System.out.println(i);
	}
		
	}
	
	public static void main(String[] args) {
		Ejercicio42 qwe=new Ejercicio42();
		
		qwe.EntradaDeDatos();
		
	}

}