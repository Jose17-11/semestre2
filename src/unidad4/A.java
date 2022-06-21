package unidad4;
import java.util.Scanner;
public class A {
/*
 * @Arias Hernandez Jose Manuel
 */
	protected int num1, num2, resultado;
	
	public void IngresarDatos(){
		Scanner leer=new Scanner(System.in);
		
		System.out.println("ingresar primer valor");
		num1=leer.nextInt();
		System.out.println("Ingresa el segundo valor");
		num2=leer.nextInt();
	}
	
	public void VisualizarResultado() {
		System.out.println("Resultado:"+resultado);
	}

}
