package unidad3;
import java.util.Scanner;
public class ArregloMuebles {
	
	

	//Arreglo
	//Arias Hernandez Jose Manuel
	static Scanner leer=new Scanner(System.in);
		
		//Arreglo
		public void arreglo() {
			String arreglo[]=new String[4];
			System.out.println("Arreglo: Muebles");
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
		   ArregloMuebles Tipo=new ArregloMuebles();
		   System.out.println("Ingresa el tamaño del arreglo numerico");
		   tamaño=leer.nextInt();
		   
		   
		   int nombre[]=new int[tamaño];
		   for(int i=0;i<nombre.length;i++) {
			   System.out.println("Ingresa un numero");
		    		nombre[i]=leer.nextInt();
					}
		   
		    	System.out.println("______________________________________");
		    	Tipo.arreglo();
		    	System.out.println("______________________________________");
		    	System.out.println("Arreglo numerico");
		    	
		    	for(int i=0;i<nombre.length;i++) {
				
		    		System.out.println(nombre[i]);
				}
			
	   }

}

