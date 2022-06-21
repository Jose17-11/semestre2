package unidad3;
import java.util.Scanner;
public class Ejercicio3 {
		
		//Arias Hernández José Manuel
		static Scanner leer=new Scanner(System.in);
		public static void main(String[] args) {
			//Menu de las operaciones
			int i,num1,num2;
			System.out.println("-----Operaciones-----");
			System.out.println("1.Suma.");
			System.out.println("2.Resta.");
			System.out.println("3.Multiplicacion.");
			System.out.println("4.Salir. ");
			System.out.println();
			System.out.println("Ingresa el numero de la operacion que decea realizar");
			i=leer.nextInt();
			System.out.println();
			
			//Switch con 3 casos de operaciones matematicas
			switch(i) {
			  //Operacion suma
			  case 1:
				  System.out.println("Suma de dos numeros");
				  System.out.println("Ingresa un numero");
					num1=leer.nextInt();
					System.out.println("Ingresa un numero");
					num2=leer.nextInt();
			    int suma=num1+num2;
			    System.out.println("La suma es: "+suma);
			    System.out.println("*****Fin*****");
			    break;
			    
			  //Operacion resta  
			  case 2:
				  System.out.println("Resta de dos numeros");
				  System.out.println("Ingresa un numero");
					num1=leer.nextInt();
					System.out.println("Ingresa un numero");
					num2=leer.nextInt();
				    int resta=num1-num2;
				    System.out.println("La resta es: "+resta);
				    System.out.println("*****Fin*****");
			    break;
			    
			  //Operacion multiplicacion  
			  case 3:
				  	System.out.println("Multiplicacion de dos numeros");
				    System.out.println("Ingresa un numero");
					num1=leer.nextInt();
					System.out.println("Ingresa un numero");
					num2=leer.nextInt();
				    int mul=num1*num2;
				    System.out.println("La multiplicacion es: "+mul);
				    System.out.println("*****Fin*****");
			    break;
			  //Caso para finalizar el programa  
			  case 4:
				  System.out.println("*****Fin*****");
			    break;
			    
			  //Declaracion en caso de que se ingrese un numero que no este en el menu  
			  default:
			    System.out.println("Opcion no valida");
			    System.out.println("*****Fin*****");
			

			}

	}

}
