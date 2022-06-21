package unidad6;
import java.util.Scanner;
public class Reptiles extends Animales {
Scanner t=new Scanner(System.in);
protected int p5;
	public void Reptiless() {

		super.Abcd();
	    System.out.println("--Peso :");
	    p5=t.nextInt();
	    
	}
	public void datosReptiles() {
		System.out.println("**Datos del Reptil**");
		System.out.println("Velocidad : "+p1+" \n"+"Tipo de habitad : "+p2+"\n"+"Edad : "+p3+"\n"+"Peso : "+p5);
	}
}