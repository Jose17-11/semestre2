package unidad3;
import java.util.Scanner;
public class Ciclo {
	
	//Arias Hernández José Manuel
	//Programa sencillo con ciclo for
	Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
		
		for (int i=1; i<10; i+=2) {
			if(i==10) {
				break;
			}
			System.out.println("El resultado es: "+i);
		}
	}

}
