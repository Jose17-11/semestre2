package pruebas;
import java.util.Scanner;
public class Usuario {
	
	public static void main(String[] args) {
		
		String usuario, correo="chema8130@gmail.com";
		String contrase�a, caracter="1q2w3e4r5t";
		
		Scanner leer=new Scanner(System.in);
		System.out.println("*****Ingreso de datos*****");
		System.out.println("ingresa tu usuario");
		usuario=leer.nextLine();
		System.out.println("ingresa tu contrase�a");
		contrase�a=leer.nextLine();
		
		if (usuario!=correo && contrase�a!=caracter) {
			System.out.println("Sesion iniciada ");
		}
		else {
			System.out.println("Datos incorrectos");
		}
	}
}
