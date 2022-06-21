package unidad3;
import java.util.Scanner;
public class Ejercicio32 {
	
	Scanner leer=new Scanner(System.in);
	public void ConversionGrados(double GradosF) {
		double GradosC;
		GradosC = (GradosF-32)/1.8;
		System.out.println("Grados C: "+GradosC);
		
	}
	
	public static void main(String[] args) {
		Ejercicio32 obj=new Ejercicio32();
		int gradosC;
		System.out.println("Ingresa los Grados Fahrenheit: ");
		gradosC=obj.leer.nextInt();
		obj.ConversionGrados(gradosC);
		
	}
	
	//Definicion de herencia y esquema donde se ejemplifique
}
