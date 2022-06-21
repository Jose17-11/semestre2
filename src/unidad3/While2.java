package unidad3;
import java.util.Scanner;
public class While2 {

	//Arias Hernández José Manuel
	//Programa que repita cinco veces un ciclo while que realice la suma de dos numeros
	
	static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
		
		int i=1;
		while(i<=5) {
			int num1, num2;

			System.out.println("Suma:"+i);
			System.out.println("Ingresa un numero");
			num1=leer.nextInt();
			System.out.println("Ingresa un numero");
			num2=leer.nextInt();
			int suma=num1+num2;
			System.out.println("El resultado es: "+suma);
			System.out.println("__________________________________________________________________________________");
			i++;
		}
	}
}
