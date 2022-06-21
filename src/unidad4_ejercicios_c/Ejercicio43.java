package unidad4_ejercicios_c;
import java.util.Scanner;
public class Ejercicio43 {
	
	public static void main(String[] args) {

		int arreglo[]=new int[10];
		int auxiliar=0;
		Scanner leer=new Scanner(System.in);
		
		
		//Ingrese los datos el usuario
		for(int i = 0; i<arreglo.length; i++) {
			System.out.println("Ingrese el valor de la posición " + i + ":");
			arreglo[i]=leer.nextInt();
		}
		
		
		//Burbuja
		for(int i=0; i<arreglo.length; i++) {
			for(int j=0; j<arreglo.length; j++) {
				if(arreglo[i]<arreglo[j]) {
					
					auxiliar=arreglo[i];
					arreglo[i]=arreglo[j];
					arreglo[j]=auxiliar;
				}
			}
		}
		
		
		System.out.println("*****Orden de arreglo de menor valor a mayor valor*****");
		for(int i=0; i<arreglo.length; i++) {
			System.out.print(arreglo[i]+" ");
			
		}
	}
}