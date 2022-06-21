package unidad3;
import java.util.Scanner;
public class While {

	//Arias Hernández José Manuel
	//Programa sencillo con ciclo while
	Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
		int i=0;
		while(i<10) {
			i++;
			System.out.println("contador: "+i);
		}
	}
}
