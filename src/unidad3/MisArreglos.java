package unidad3;
import java.util.Scanner;
public class MisArreglos {
	
	//Arias Hernández José Manuel
	
	public static void main (String[] args) {
		Scanner leer=new Scanner(System.in);
		
		int sueldos[]=new int[3];
		//String sueldos1[]=new String[3];
		char sueldos2[]=new char[3];
		int impuestos[]=new int[15];
		String sueldos20[]=new String[] {"pepe", "alfonso", "teodoro"};
		
		
		sueldos[0]=250;
		sueldos[1]=300;
		sueldos[2]=120;
		
		sueldos2[0]= 'w';
		sueldos2[1]= 'q';
		sueldos2[2]= '3';
		
		String sueldos1[]={"palabra", "correo", "contraseña"};
		
		System.out.println("Introdusca valores enteros");
		
		for (int i=0; i<15; i++){
			System.out.println("valor: ");
			impuestos[i]=leer.nextInt();
		}
		
		for(int x=0; x<15; x++) {
			System.out.println("Posicion: "+impuestos[x]);
		}
		
	}

}
