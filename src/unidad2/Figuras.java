package unidad2;
import java.util.Scanner;
public class Figuras {
	
	static Scanner leer=new Scanner (System.in);
	
	int base;
	int altura1; 
	int radio;
	int basemenor;
	int basemayor;
	int lado1;
	int lado2;
	int altura2;
	//Area de triangulo
	public void AreaTriangulo(int base, int altura) {
		System.out.println("*****************************");
		System.out.println("*****Area del triangulo*****");
		System.out.println("Escribe la base del triangulo");
		base=leer.nextInt();
		System.out.println("Escribe la altura del triangulo");
		altura1=leer.nextInt();
		int areat=base*altura1;
		System.out.println("El area del triangulo es: "+areat);
		System.out.println("*****************************");
		System.out.println();
	}
	
	public void AreaCuadrado (int lado1, int lado2) {
		System.out.println("*****************************");
		System.out.println("*****Area del cuadrado*****");
		lado1=10;
		lado2=15;
		int areaCu=lado1*lado2;
		System.out.println("El area del cuadrado es: "+areaCu);
		System.out.println("*****************************");
		System.out.println(); 
	}
	
	public double circulo(double radio){
		 double circulo;
		 radio=15;
			System.out.println("*****************************");
	        System.out.println("*****AREA DEL CIRCULO*****");
	        circulo= (radio*radio)*3.1416;
	        
	        System.out.println("El area del circulo es : "+circulo);
			System.out.println("*****************************");
			System.out.println();
	        return circulo;
	    }
	
	public double trapecio(double b,double B,double h ){
		 double trap;
		 b=20;
		 B=10;
		 h=5;
			System.out.println("*****************************");
	        System.out.println("*****AREA DEL TRAPECIO*****");
	        trap= ((b+B)*h)/2;
	        
	        System.out.println("El area del trapecio es : "+trap);
			System.out.println("*****************************");
			System.out.println();
	        return trap;
	    }
	public static void main(String[] args) {
		System.out.println("*****************************");
		System.out.println("Sacar areas");
		Figuras areas=new Figuras();
		areas.AreaCuadrado(0, 0);
		areas.AreaTriangulo(0, 0);
		areas.trapecio(0, 0, 0);
		areas.circulo(0);
	}

}
