package unidad6;
import java.util.Scanner;
public class Proyecto {
	
	public static void main(String[] args) throws Exception{
		
		Scanner leer=new Scanner(System.in);

		int y;
		//Condicional do while para que una vez terminada una opción vuelva a mostrar el menu
		do {

		//Menu principal
		System.out.println("****************Menú principal***************");
		System.out.println("1.Arreglo de 10 numeros(Suma, Multiplicación, Mayor y Menor número).");
		System.out.println("2.Herencia.");
		System.out.println("3.Sacar factorial y método de empleo.");
		System.out.println("4.Constructor de calificaciones.");
		System.out.println("5.Archivo de presentación.");
		System.out.println("6.Salir.");
		System.out.println();
		System.out.println("Ingresa una opcion");
		y=leer.nextInt();
		System.out.println();
		System.out.println();
		
		//Switch (y) con cada caso del menu para seleccionar
		switch(y) {
		case 1:
			
			//Arreglo de 11 datos y solo se usaran 10 datos
			long arreglo[]=new long[11];
			int total=0;
			long totalmul=1;
			
			//Condicional for que alamcena cada dato ingresado en un espacio del arreglo
			System.out.println("*********************************************");
			for(int i = 1; i<arreglo.length; i++) {
				System.out.println("Ingrese el dato: "+"" + i + ":");
				arreglo[i]=leer.nextLong();
			}
			
			System.out.println("*********************************************");
			System.out.println();
			System.out.println();
			  	
				//Condicion for para mostrar en pantalla el arreglo completo
				System.out.println("---------------------------------------------");
				System.out.println("Los numeros del arreglo son:");
				for(long i=1; i<arreglo.length; i++) {
					System.out.print(arreglo[(int) i]+" "+"");
					System.out.print("");
				}
				System.out.println();
				System.out.println("---------------------------------------------");
				System.out.println();
				System.out.println();
			  
				  //Condicion for que suma el arreglo
				  System.out.println("*********************************************");
				  System.out.println("Suma del arreglo:");
				  for(int i=1;i<arreglo.length;i++) {
					  total+=arreglo[i];
					   
				  }
				  //Linea que muestra el resultado de la suma del arreglo
				  System.out.println(total);
				  System.out.println("*********************************************");
				  System.out.println();
				  System.out.println();
				  
				  
				  
				//Condicion 2 que multiplica el arreglo desde el primer hasta el ultimo valor
				  System.out.println("*********************************************");
				  System.out.println("Multiplicación del arreglo");
				  for(int i=1;i<arreglo.length;i++) {
					  totalmul*=arreglo[i];
					  
				  }
				  //Linea que muestra el resultado de la multiplicación
				  System.out.println(totalmul); 
				  System.out.println("*********************************************");
				  System.out.println();
				  System.out.println();
					
					
				  System.out.println("*********************************************");
				  long mayor, menor;
				  mayor=menor=arreglo[1];
				//Condicion for que ordena el arreglo de mayor a menor y almacena el mayor numero en la variable mayor
				  for(int i=1; i<arreglo.length; i++) {
					  if(arreglo[i]>mayor) {
						  mayor=arreglo[i];
					  }
				//Condicion for que ordena el arreglo de menor a mayor y almacena el menor valor en la variable menor 
					  if(arreglo[i]<menor) {
						  menor=arreglo[i];
					  }
				  }
				  //Lineas que muestran el mayor y el menor valor
				  System.out.println("El valor mayor del arreglo es: "+mayor);
				  System.out.println("El valor menor del arreglo es: "+menor);
				  System.out.println("*********************************************");
				  System.out.println();
				  break;
			  	
		case 2:
			//Caso 2 del switch donde mandamos a pedir los datos almacenados en la clase Animales
			System.out.println("**********Datos de tipos animales**********");
			Animales.main(args);
			  break;
			
		case 3:
			long factorial=1;
			long num=0;
			System.out.println("***************Factorial***************");
			System.out.println("Ingrese el numero a calcular factorial");
			long num1=num=leer.nextInt();
			
			//Condicion while que nos permite hacer el factorial
			while(num!=0) {
				
				factorial*=num;
				num--;
			}
			//Linea que nos muestra el resultado del factorial
			System.out.println("El factorial de "+num1+" es: "+factorial);
			
			//Aqui creamos un objeto empleo que manda a traer la salida de datos de la clase SalidaEmpleo
			System.out.println("**************Método Empleo*************");
			SalidaEmpleo Empleo=new SalidaEmpleo();
			Empleo.Salida2();
		
			  break;
		case 4:
			//Aqui creamos un objeto empleo que manda a traer la salida de datos de la clase constructor
			Constructor calif=new Constructor();
			Constructor.main(args);
			  break;
			  
		case 5:
			//Aqui mandamos a llamar al metodo main de la clase documento
			System.out.println("****************Presentación****************");
			Documento.main(args);
			  break;
			
			
		case 6:
			//Caso 6 que nos finaliza y da salida al programa
			  System.out.println("¡Gracias por usar nuestro programa..!");
			  System.out.println("¡Adios...!");
			  break;
			  //Elemento default del metodo switch que nos muestra un aviso y regresa al menu en caso de que el usuario igrese una opcion que no este en el menu
			  default:
				  System.out.println("¡NUMERO NO VALIDO...!");
				  System.out.println("Favor de intentar nuevamente");
				  System.out.println();
			  break;
			}
		//Condicional do while para que una vez terminada una opción vuelva a mostrar el menu
		}while(y!=6);
			
		}
}		