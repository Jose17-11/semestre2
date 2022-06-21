package unidad4;
import java.util.Scanner;
public class U4Padre {
	
	Scanner leer=new Scanner(System.in);
	static protected int saldo=5000, retiro, re, contra=1711, nip, num; 
	
	public void Cajero() {
		System.out.println("*************************************");
		System.out.println("\nRetiraste la cantidad de: "+retiro);
		System.out.println("Cantidad de dinero actual: "+saldo);
	}
}