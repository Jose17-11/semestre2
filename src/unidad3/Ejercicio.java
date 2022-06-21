package unidad3;
import java.util.Scanner;
public class Ejercicio {
	
	

	//Arreglo
	//Arias Hernandez Jose Manuel
	static Scanner leer=new Scanner(System.in);
		public void arreglo() {
			String arreglo[]=new String[4];
			System.out.println("Primer arreglo: Muebles");
			   arreglo[0]="Ropero";
			   arreglo[1]="Cama";
			   arreglo[2]="Mesa";
			   arreglo[3]="Silla";
			   for(int i=0;i<arreglo.length;i++) {
				   System.out.println(arreglo[i]);
				  	}
			}
		
	   public static void main(String[] args) {
		   int tamaño;
		   Ejercicio Tipo=new Ejercicio();
		   System.out.println("Ingresa el tamaño del segundo arreglo");
		   tamaño=leer.nextInt();
		   
		   
		   int arreglo1[]=new int[tamaño];
		   for(int i=0;i<arreglo1.length;i++) {
			   System.out.println("Ingresa un numero");
		    		arreglo1[i]=leer.nextInt();
					}
		    	System.out.println("______________________________________");
		    	Tipo.arreglo();
		    	System.out.println("______________________________________");
		    	System.out.println("Segundo arreglo");
		    	
		    	for(int i=0;i<arreglo1.length;i++) {
				
		    		System.out.println(arreglo1[i]);
				}
			
	   }

}

