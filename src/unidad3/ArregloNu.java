package unidad3;
import java.util.Random;
import java.util.Scanner;
public class ArregloNu {

	
	//Arias Hernandez Jose Manuel
	Random w=new Random();
	Scanner leer=new Scanner(System.in);
	int numero;
	static int[] arreglo=new int[10];
	
	
	//Primer metodo
	public int metodo(){
		for(int a=0; a<10; a++) {
			
		}
		
	//Ingresa un numero el usuario	
		System.out.println("Ingresa un numero: ");
		numero=leer.nextInt();
		return numero;
	}
	
	//Segundo metodo
	public int [] metodos() {
		for(int a=0; a<10;a++) {
			arreglo[a]=w.nextInt(1000);
			System.out.println(arreglo[a]);
		}
		return arreglo;
	}
	
	//Metodo con el arreglo que retorna los valores
	public boolean ras(int []array, int numero) {
		boolean n=false;
		for(int a=0;a<10;a++) {
			if (array[a]==numero) {
				n=true;
			}
		}
		return n;
	}
	
	
	//Salida de datos
	public static void main(String[] args) {
		ArregloNu resultado=new ArregloNu();
		
		while(true) {
			resultado.metodos();
			resultado.metodo();
			boolean l = resultado.ras(arreglo, resultado.numero);
			if(l==false) {
				System.out.println("El numero no esta en el arreglo");
			}
			
			else {
				System.out.println("Felicidades le atinaste al numero");
				break;
			}
		}
	}
	
}