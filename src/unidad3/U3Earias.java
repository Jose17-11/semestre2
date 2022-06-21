package unidad3;
import java.util.Scanner;
public class U3Earias {
    /**
 * metodo suma que no retorna y los datos son fijos, multiplos de 100, menu con 4 opciones 
 * y opcion uno suma, opcion 2 al llenado de un arreglo de 7 elementos tipo cadena
 * y los muestran del ultimo al primero, 
 * la opcion 3 ejecuta un while desplegando los multiplos del numero que el usuario ingrese, 
 * y la opcion 4 sera un if que le pregunte si quiere calcular su edad que determine la edad de una persona 
 * cuando la persona introdusca el año de nacimiento y en caso de que no solo mandar un saludo y el menu se tiene 
 * que estar repitiendo mientras que el usuario no de salir
 * @Arias Hernandez Jose Manuel
 */   
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args){
        int num1, num2;
        int x;
        do {
            
        System.out.println("****Menu****");
        System.out.println("1.-Suma.");
        System.out.println("2.-Arreglo de 7 palabras.");
        System.out.println("3.-Multiplos de un numero.");
        System.out.println("4.-Calcular edad.");
        System.out.println("5.-Salir");
        System.out.println("Ingresa la opcion que deceas realizar");
        x=leer.nextInt();
        
        switch(x){
                
        case 1 -> {
            System.out.println("1.-Suma.");
            num1=5;
            num2=10;
            int suma=num1+num2;
            System.out.println("5");
            System.out.println("10");
            System.out.println("La suma es: "+suma);
                }
            
        case 2 -> {
            System.out.println("Lista de palabras");
            int contador=1;
            String palabra[]=new String[7];
            for(int i=0;i<palabra.length;i++) {
                System.out.println("palabra"+contador+": ");
                palabra[i]=leer.next();
                contador+=1;
            }
            contador=1;
            for (String palabra1 : palabra) {
                System.out.println(contador+". " + palabra1);
                contador+=1;
            }
                }

            
            
        case 3 -> {
            int i;
            System.out.println("Ingrese un numero");
            i=leer.nextInt();
            
            while(i<10){
                System.out.println(i++);
                i++;
            }   }

            
        case 4 -> {
            System.out.println("4.-Calcular edad.");
            System.out.println("¿Quieres Calcular tu edad?");
            System.out.println("1.-Si.");
            System.out.println("2.-No.");
            int fecha=leer.nextInt();
            
            
            if(fecha>0 && fecha<2){
                System.out.println("Ingresa tu año de nacimiento");
                int num=leer.nextInt();
                num=2022-num;
                System.out.println("Tu edad es: "+num);
                
            }
            if(fecha>1 && fecha<3){
                System.out.println("Muchas gracias hasta luego");
            }   }
        case 5 -> System.out.println("*****Fin del programa");
        default -> System.out.println("El numero que ingresaste no es valido");
            
    }
    }while(x!=5);
}
}