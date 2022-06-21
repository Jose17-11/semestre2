package unidad4;
import java.util.Scanner;
public class U4Cajero {
	
	public static void main(String[] args) {
		Scanner leer=new Scanner(System.in);
		int num;
		U4Padre salida=new U4Padre();
		U4Hijo salida2=new U4Hijo();
		for(;;) {
			salida2.ComparacionoNip();
			salida.Cajero();
			System.out.println("Desea finalizar el programa precione 1");
			num=leer.nextInt();
			
			if(num==1) {
				break;
			}
			System.out.println("****************************************");
		}
	}
}