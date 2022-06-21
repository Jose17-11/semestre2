package unidad6;
import java.util.Scanner;
public class Animales {
	
	Scanner t=new Scanner(System.in);
	protected String p1,p2,p3;
	
	public void Abcd() {
		System.out.println("--Velocidad :  ");
		p1=t.next();
		System.out.println("--Habitad : ");
		p2=t.next();
		System.out.println("--Edad : ");
		p3=t.next();
		
		
	}
	public void datosAnimal() {
		System.out.println("Velocidad : "+p1+"\n"+"Tipo de habitad : "+p2+"\n"+"Edad: "+p3+"\n");
	}

   
    	public static void main(String[] args) {

    		Mamiferos obj=new Mamiferos();
    		Reptiles objet=new Reptiles();
    		Insectos objeto=new Insectos();

    		System.out.println("-----Datos del Mamifero-----\n");
    		obj.Animal();
    		System.out.println("-----Datos del Reptil-----\n");
    		objet.Reptiless();
    		System.out.println("-----Datos del Insecto-----\n");
    		objeto.Insectoss();
    		
    		System.out.println();
    		System.out.println("*********************************************");
    		obj.datosMamiferos();
    		System.out.println("");
    		objet.datosReptiles();
    		System.out.println("");
    		objeto.datosInsectoss();
    		System.out.println("*********************************************");
    		System.out.println();
    		
    		
    	}
    }