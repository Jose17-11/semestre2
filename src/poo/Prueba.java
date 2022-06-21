package poo;

import java.util.Scanner;

public class Prueba {
static Scanner t=new Scanner(System.in);
	public static void main(String[] args) {
		int a;
		do {
			int x,n1,n2;
			System.out.println("-----BIENVENIDO AL PROGRAMA-----");
			System.out.println("          MENU   ");
			System.out.println("1. Suma de dos numeros. ");
			System.out.println("2. Resta de dos numeros ");
			System.out.println("3. Multiplicacion de dos numeros. ");
			System.out.println("4. Lista de animales. ");
			System.out.println("5. Abecedario. ");
			System.out.println("6. Salir. ");
			System.out.println();
			System.out.println("Ingresa una opcion");
			x=t.nextInt();
			System.out.println();
			
			switch(x) {
			  
			  case 1:
				  System.out.println("Ingresa un numero");
					n1=t.nextInt();
					System.out.println("Ingresa un numero");
					n2=t.nextInt();
			    System.out.println("Suma de dos numeros");
			    int suma=n1+n2;
			    System.out.println("La suma es: "+suma);
			    
			    break;
			  case 2:
				  System.out.println("Ingresa un numero");
					n1=t.nextInt();
					System.out.println("Ingresa un numero");
					n2=t.nextInt();
				  System.out.println("Resta de dos numeros");
				    int resta=n1-n2;
				    System.out.println("La suma es: "+resta);
				   
			    break;
			  case 3:
				    System.out.println("Ingresa un numero");
					n1=t.nextInt();
					System.out.println("Ingresa un numero");
					n2=t.nextInt();
				  System.out.println("Multiplicación de dos numeros");
				    int mul=n1*n2;
				    System.out.println("La suma es: "+mul);
				    
			    break;
			  
			    
			  case 4:
				  int con=1;
				  String animal[]=new String[4];
				  for(int i=0;i<animal.length;i++) {
					  System.out.println("Ingresa el nombre del animal "+con+": ");
					  animal[i]=t.next();
					  con+=1;
				  }
				  con=1;
				  System.out.println();
				  System.out.println("---Lista de animales---");
				  for(int i=0;i<animal.length;i++) {
					  
					  System.out.println(con+". "+animal[i]);
					  con+=1; 
					  
				  }
				 
				    
			    break;
			  case 5:
				  
				  
				  String abe[]=new String[27];
				  abe[0]="a";
				  abe[1]="b";
				  abe[2]="c";
				  abe[3]="d";
				  abe[4]="e";
				  abe[5]="f";
				  abe[6]="g";
				  abe[7]="h";
				  abe[8]="i";
				  abe[9]="j";
				  abe[10]="k";
				  abe[11]="l";
				  abe[12]="ll";
				  abe[13]="m";
				  abe[14]="n";
				  abe[15]="ñ";
				  abe[16]="o";
				  abe[17]="p";
				  abe[18]="q";
				  abe[19]="r";
				  abe[20]="s";
				  abe[21]="t";
				  abe[22]="u";
				  abe[23]="v";
				  abe[24]="x";
				  abe[25]="y";
				  abe[26]="z";
				  System.out.println("----ABECEDARIO----");
				  System.out.println("1. a-z  ");
				  System.out.println("2. z-a  ");
				  System.out.println("3. Salir");
				  System.out.println();
				  System.out.println("Elige una opcion:");
				  int op=t.nextInt();
				  switch(op){
				  case 1:
					  for(int i=0;i<abe.length;i++) {
						 System.out.println(abe[i]); 
					  }
					  break;
					  
				  case 2:
					  for(int i=26;i>-1;i-=1) {
							 System.out.println(abe[i]); 
						  }
					  
					  break;
				  case 3:
					  
					  break;
				  
					  
				  default:
					    System.out.println("NUMERO NO VALIDO");
					    System.out.println();
					    
					  
				  }
				  System.out.println("-----FIN DEL PROGRAMA-----");
				    
			    break;
			  case 6:            
				  
				    
			    break;
			  default:
			    System.out.println("NUMERO NO VALIDO");
			    System.out.println();
			    
			}
			System.out.println("-----FIN DEL PROGRAMA-----");
			
			System.out.println("Si desea terminar el programa ingresa el numero 5");
			a=t.nextInt();
		}while(a<5 || a>5); 
System.out.println("-----HASTA LA PRÓXIMA -----");
	}

}
