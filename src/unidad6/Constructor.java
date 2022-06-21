package unidad6;
import java.util.Scanner;
public class Constructor extends SalidaConstructor {
	float total;
	float total2;
	Scanner leer=new Scanner(System.in);
	
	public Constructor() {
		
		total=total;
		total2=total2;
	}
	
	public void Salida(){
		int[] array=new int[6];
		System.out.println();
		System.out.println("*********************************************");
		for(int i=1; i<array.length; i++) {
			System.out.println("Ingresa la calificacion: "+i);
			array[i]=leer.nextInt();
		}
		System.out.println();
		  for(int i=1;i<array.length; i++) {
			  total=total+array[i];
			  total2=total/5;
		  }
	}
	public void Salida2() {
		System.out.println("El promedio es: "+total2);
		  System.out.println("*********************************************");
		  System.out.println();
	}

}