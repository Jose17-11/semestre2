package unidad3;
import java.util.Scanner;
public class Menu {
	
	// Arias Hernández José Manuel
	static Scanner leer=new Scanner(System.in);
	public static void main(String[] args) {
			
			//Menu principal
			int y;
			System.out.println("*****Menu*****");
			System.out.println("1.Suma.");
			System.out.println("2.Resta.");
			System.out.println("3.Multiplicacion.");
			System.out.println("4.Lista de muebles");
			System.out.println("5.Arreglo numerico.");
			System.out.println("6.Abecedario.");
			System.out.println("7. Salir.");
			System.out.println();
			System.out.println("Ingresa una opcion");
			y=leer.nextInt();
			System.out.println();
			
			switch(y) {
			
			// Caso 1, 2 y 3 operaciones matematicas  
			case 1:
				  System.out.println("Suma de dos numeros");
				  System.out.println("Ingresa un numero");
				int	num1=leer.nextInt();
					System.out.println("Ingresa un numero");
				int	num2=leer.nextInt();
			    int suma=num1+num2;
			    System.out.println("La suma es: "+suma);
			    break;
			    
			  case 2:
				  System.out.println("Resta de dos numeros");
				  System.out.println("Ingresa un numero");
					num1=leer.nextInt();
					System.out.println("Ingresa un numero");
					num2=leer.nextInt();
				    int resta=num1-num2;
				    System.out.println("La resta es: "+resta);
			    break;
			    
			  case 3:
				  	System.out.println("Multiplicacion de dos numeros");
				    System.out.println("Ingresa un numero");
					num1=leer.nextInt();
					System.out.println("Ingresa un numero");
					num2=leer.nextInt();
				    int mul=num1*num2;
				    System.out.println("La multiplicacion es: "+mul);
			    break;
			    
			//Caso 4 arreglo de lista de muebles
			  case 4:
					
						String arreglo[]=new String[4];
						System.out.println("Arreglo: Muebles");
						   arreglo[0]="Ropero";
						   arreglo[1]="Cama";
						   arreglo[2]="Mesa";
						   arreglo[3]="Silla";
						   for(int i=0;i<arreglo.length;i++) {
							   System.out.println(arreglo[i]);
							  	
						
					  
				  }
			    break;
			    
			  case 5:
				  int tamaño;
				   System.out.println("Ingresa el tamaño del arreglo numerico");
				   tamaño=leer.nextInt();
				  
				  int nombre[]=new int[tamaño];
			   for(int i=0;i<nombre.length;i++) {
				   System.out.println("Ingresa un numero");
			    		nombre[i]=leer.nextInt();
						}
			   
			    	System.out.println("______________________________________");
			    	System.out.println("______________________________________");
			    	System.out.println("Arreglo numerico");
			    	
			    	for(int i=0;i<nombre.length;i++) {
					
			    		System.out.println(nombre[i]);
					}
			    
			    	break;
			  //Caso 6 arreglo becedario
			  case 6:   
				  
				  String abecedario[]=new String[26];
				  abecedario[0]="a";
				  abecedario[1]="b";
				  abecedario[2]="c";
				  abecedario[3]="d";
				  abecedario[4]="e";
				  abecedario[5]="f";
				  abecedario[6]="g";
				  abecedario[7]="h";
				  abecedario[8]="i";
				  abecedario[9]="j";
				  abecedario[10]="k";
				  abecedario[11]="l";
				  abecedario[12]="m";
				  abecedario[13]="n";
				  abecedario[14]="ñ";
				  abecedario[15]="o";
				  abecedario[16]="p";
				  abecedario[17]="q";
				  abecedario[18]="r";
				  abecedario[19]="s";
				  abecedario[20]="t";
				  abecedario[21]="u";
				  abecedario[22]="v";
				  abecedario[23]="x";
				  abecedario[24]="y";
				  abecedario[25]="z";
				  System.out.println("*****ABECEDARIO*****");
				  System.out.println("1.De a - z  ");
				  System.out.println("2.De z - a  ");
				  System.out.println("3. Salir");
				  System.out.println();
				  System.out.println("Elige una opcion:");
				  int sw=leer.nextInt();
				  
				  switch(sw){
				  case 1:
					  //Condicion 1 en el caso 1 de la "a" a la "z" 
					  for(int i=0;i<abecedario.length;i++) {
						 System.out.println(abecedario[i]); 
					  }
					  break;
					  
					//Condicion 2 en el caso 2 de la "z" a la "a"  
				  case 2:
						  for(int i=25;i>-1;i-=1) {
								 System.out.println(abecedario[i]); 
							  }
						  break;
						
						//Salida en caso de que se ingrese alguna opcion que no este en el menu  
				  case 3:
					  
					  break;
					  default:
						  System.out.println("NUMERO NO VALIDO");
						  break;
				  	}
				  break;
				  
			  case 7:
					
				  break;
					//Salida en caso de que se ingrese alguna opcion que no este en el menu  
				  default:
					  System.out.println("NUMERO NO VALIDO");
					  System.out.println();
			    
				}
				System.out.println("*****FIN DEL PROGRAMA*****");
		}

}
