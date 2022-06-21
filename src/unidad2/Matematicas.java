package unidad2;
import java.util.Scanner;
/**
 * @author Arias Hernandez Jose Manuel
 *
 */
public class Matematicas {
	int dato1=5;
	int dato2=3;
	//Metodo publico de resta
	
	public void resta() {
		int resultado=dato1-dato2;
		System.out.println("El resultado es: "+resultado);
	}
	//Metodo publico que no retorna y que recibe parametros
	public int resta2() {
		int resultado=dato1-dato2;
		return resultado;
	}
	//metodo publico que no retorna y que recibe parametros
	public void restaparametro(int valor1, int valor2) {
		int resultado=valor1-valor2;
		System.out.println("El valor es: "+resultado);
	}
	//Metodo publico que retorna y que recibe parametros
	public int restaparametro2(int valor1, int valor2) {
		int resultado=valor1-valor2;
		return resultado;
	}
	//
	public static void main(String[]args) {
		try (Scanner leer = new Scanner(System.in)) {
			int x, y;
			
			
			System.out.println("Ingrese el primer numero");
			x=leer.nextInt();
			
			System.out.println("Ingrese el segundo numero");
			y=leer.nextInt();
			
			Matematicas operacion=new Matematicas();
			System.out.println("Metodos sin parametros");
			System.out.println("Metodo sin retorno");
			
			operacion.resta();
			

			System.out.println("Metodo con retorno");
			System.out.println("El resultado de la resta2 es: "+operacion.resta2());
			
			System.out.println("Metodo con retorno");
			operacion.restaparametro(x,y);
			
			System.out.println("nMetodo con parametro que retorna");
			System.out.print("El resultado es: ");
			System.out.println(operacion.restaparametro2(x, y));
		}
	}

}
