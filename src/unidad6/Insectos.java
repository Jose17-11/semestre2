package unidad6;
import java.util.Scanner;
public class Insectos extends Animales {
	Scanner t=new Scanner(System.in);
	 protected int  p6;
	public void Insectoss() {

		super.Abcd();
	    System.out.println("--Medida en cm :");
	    p6=t.nextInt();
	
	}
	public void datosInsectoss() {
		System.out.println("**Datos del Reptil**");
		System.out.println("Velocidad : "+p1+" \n"+"Tipo de habitad : "+p2+"\n"+"Edad : "+p3+"\n"+"Peso : "+p6);
	}
}