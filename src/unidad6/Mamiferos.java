package unidad6;
import java.util.Scanner;
public class Mamiferos extends Animales {
	
Scanner t=new Scanner(System.in);
protected int p4;

	public void Animal() {
		super.Abcd();
	    System.out.println("--Años de vida:");
	    p4=t.nextInt();

	}
	public void datosMamiferos() {
		System.out.println("**Datos del Mamifero**");
		System.out.println("Velocidad : "+p1+" \n"+"Tipo de habitad: "+p2+"\n"+"Edad : "+p3+"\n"+"Años de vida : "+p4);
	}

}