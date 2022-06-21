package unidad2;
import java.util.Scanner;
public class Matematicas5 {
	
	Scanner leer=new Scanner(System.in);
	
	//atributos
	int x=100;
	int suma;
	
	void sumaA() {
		System.out.println("Parametros");
		System.out.println("ingresa un numero");
		int numero=leer.nextInt();
		
		suma=x+numero;
	
		System.out.println("Resultado: "+suma);
	}
	
	void sumaA(int dato1) {
		suma=x+dato1;
		System.out.println("Resultado: "+suma);
	}
	
	void sumaA(double dato) {
		double suma=x+dato;
		System.out.println("Resultado: "+suma);
	}
	
	public static void main (String[] args) {
		Matematicas5 sumas=new Matematicas5();
		System.out.println("Sobrecarga de Metodos");
		sumas.sumaA(20.55);
		sumas.sumaA();
		sumas.sumaA(123);
	}
	//Matematicas6: Crear 3 metodos del mismo nombre 1 sin para, 2 
	//con un parametro y 3 con 2 parametros, y la creacion de 2 
	//constructores que inicialicen con dos atributos
}
