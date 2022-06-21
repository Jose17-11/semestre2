package unidad4;
import java.util.Scanner;
public class Prueba {

	Scanner leer=new Scanner(System.in);
	int num1, num2, suma;
	
	private void Suma() {

		System.out.println("Ingresa el primer valor");
		num1=leer.nextInt();
		System.out.println("Ingresa el segundo valor");
		num2=leer.nextInt();
		suma=num1+num2;
		System.out.println("El resultado es: "+suma);
	}
	
	public static void main (String[] args) {
		Prueba Suma=new Prueba();

		System.out.println("*****Sumas*****");
		System.out.println();
		System.out.println("*****Suma 1*****");
		Suma.Suma();
		System.out.println();
		System.out.println("*****Suma 2*****");
		Suma.Suma();
		System.out.println();
		System.out.println("*****Suma 3*****");
		Suma.Suma();
		System.out.println();
		System.out.println("*****Suma 4*****");
		Suma.Suma();
		System.out.println();
		System.out.println("*****Suma 5*****");
		Suma.Suma();
		System.out.println();
		
		System.out.println("Fin de las sumas");
	}
	

}
