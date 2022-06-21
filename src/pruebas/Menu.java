package pruebas;
import java.util.Scanner;
public class Menu {
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		byte y;
		
		System.out.println("*****Menu*****");
		System.out.println();
		System.out.println("1.- Suma");
		System.out.println("2.- Resta");
		System.out.println("3.- Multiplicación");
		System.out.println("4.- Division");
		System.out.println("5.- Salir");
		System.out.println();
		System.out.println("Digite la opcion que quiera realizar");
		y=leer.nextByte();
		
		switch (y) {
		case 1:
			int a, b, suma;
			System.out.println("*****Suma*****");
			System.out.println("Ingrese el primer dato");
			a=leer.nextInt();
			System.out.println("Ingrese el segundo dato");
			b=leer.nextInt();
			suma=a+b;
			System.out.println("La suma es: "+suma);
			break;
		case 2:
			int c, d, resta;
			System.out.println("*****Resta*****");
			System.out.println("Ingrese el primer dato");
			c=leer.nextInt();
			System.out.println("Ingrese el segundo dato");
			d=leer.nextInt();
			resta=c-d;
			System.out.println("La resta es: "+resta);
			break;
		case 3:
			int e, f, multi;
			System.out.println("*****Multiplicacion*****");
			System.out.println("Ingrese el primer dato");
			e=leer.nextInt();
			System.out.println("Ingrese el segundo dato");
			f=leer.nextInt();
			multi=e*f;
			System.out.println("La multiplicacion es: "+multi);
			break;
		case 4:
			Double g, h, div;
			System.out.println("*****Multiplicacion*****");
			System.out.println("Ingrese el primer dato");
			g=leer.nextDouble();
			System.out.println("Ingrese el segundo dato");
			h=leer.nextDouble();
			div=g/h;
			System.out.println("El resultado es: "+div);
			break;
		case 5:
			System.out.println("*****FIN DEL PROGRAMA*****");
			break;
		}
		System.out.println("*****FIN DEL PROGRAMA*****");
	}
	/*
	 * clase padre "Dad", con aspectos humanos que heredamos humanamente, con 6 atributos y crear la clase hija con nombre "Son" 
	 * y le añadimos 5 interacciones o aspectos que sean propios del padre, 3 datos que esten definidos y 3 solicitdos de la clase padre, 3 datos que se pidan 
	 * y compararlos con los del padre los otros 2 del hijo ya definidos
	 */

}
