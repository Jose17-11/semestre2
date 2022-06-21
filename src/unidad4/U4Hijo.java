package unidad4;
import java.util.Scanner;
public class U4Hijo extends U4Padre {

	public void ComparacionoNip() {
	int a=4;
	for (int i=0; i<4; i++) {
	
		System.out.println("Ingresa tu nip");
		nip=leer.nextInt();
		if(contra==nip) {
			for(;;) {
				System.out.println("Cantidad de dinero a retirar: ");
				retiro=leer.nextInt();
				if(retiro<=saldo) {
					saldo=saldo-retiro;
					break;
				}
				
				else if(saldo<=0) {
					System.out.println("Ya no tienes fondos");
					retiro=0;
					break;
				}
				
				else {
					System.out.println("No tiene esa cantidad de dinero \n Dinero disponible: "+saldo);
				}
			}
			break;
			}
		a-=1;
		System.out.println("Contraseña invalida\nTe quedan: "+a+" intentos");
		}
	}
		
}