package pruebas;
import java.util.Scanner;
public class Caguamear {
	
	public static void main (String[] args) {
		Scanner leer=new Scanner(System.in);
		byte edad;
		
		System.out.println("¿Podras entrar a caguamear.?");
		System.out.println();
		System.out.println("Ingresa tu edad");
		edad=leer.nextByte();
		
		if (edad<18 && edad>0) {
			System.out.println("Tu no tienes permitido caguamear");
		}
		else if(edad>17) {
			System.out.println("Felicidades puedes caguamear agusto ;)");
		}
		else {

			System.out.println("Dato no reconocido");
		}
	}

}
