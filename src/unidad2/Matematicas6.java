package unidad2;
import java.util.Scanner;
public class Matematicas6 {
	
	Scanner leer=new Scanner(System.in);
	
	//atributos
	int num1;
	int num2;
	int num3;
	int multi;
	
	//Constructor
	Matematicas6 () {
		this.num1=num3;
		this.num2=multi;
	}
	
	Matematicas6 (int num3, int multi) {
		this.num3=num3;
		this.multi=multi;
	}
	
	//Primer metodo
	void multiplicacion() {
		System.out.println("Mis metodos");
		System.out.println("Primer numero");
		num1=leer.nextInt();
		System.out.println("segundo numero");
		num2=leer.nextInt();
		multi=num1*num2;
		System.out.println("La multiplicacion es: "+multi);
	}
	
	//Segundo metodo
	void multiplicacion(int numero2) {
		System.out.println("segundo metodo");
		System.out.println("tercer numero");
		num1=leer.nextInt();
		System.out.println("cuarto numero");
		num2=leer.nextInt();
		multi=num1*numero2;
		System.out.println("La segunda multiplicacion es: "+multi);		
	}
	
	//Tercer metodo
	void multiplicacion(Double numero3, Double numero4) {
		System.out.println("tercer metodo");
		System.out.println("quinto numero");
		num1=leer.nextInt();
		System.out.println("sexto numero");
		num2=leer.nextInt();
		System.out.println("La multiplicacion es: "+multi);
	}
	
	public static void main(String[] args) {
		Matematicas6 multiplicacion=new Matematicas6();
		multiplicacion.multiplicacion();
		multiplicacion.multiplicacion();
		multiplicacion.multiplicacion();
	}
}
