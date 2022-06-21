package unidad4_ejercicios_b;
import java.util.Scanner;
public class Vehiculo extends Ejercicio42 {
	
	private String marca, modelo;
	private float precio;
	
	Scanner leer=new Scanner(System.in);
	public Vehiculo() {
		this.marca=marca;
		this.modelo=modelo;
		this.precio=precio;
	}
	
	public void EntradaDeDatos() {
		
		System.out.println("*****Ingresar datos de los automoviles*****");
		System.out.println("ingresa la marca del automovil");
		marca=leer.nextLine();
		System.out.println("Ingresa el modelo del automovil");
		modelo=leer.nextLine();
		System.out.println("Ingresa el precio del automovil");
		precio=leer.nextFloat();
	}
	public static void main(String[] args) {
		Vehiculo salida=new Vehiculo();
		
	}
	

}
