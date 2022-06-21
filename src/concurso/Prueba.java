package concurso;
import java.util.Scanner;
public abstract class Prueba {
	/*
	 * @Arias Hernandez Jose Manuel
	 */

	
	int R, D, C, S;
	private static int saldo;
	static Scanner leer=new Scanner(System.in);
	
	public void Operaciones() {
		int menu=0;
		int opcion=0;
		
	do {	
		do{
			System.out.println("Seleccione la accion que desea realizar");
			System.out.println("	1.-Hacer un retiro");
			System.out.println("	2.-Hcer un deposito");
			System.out.println("	3.-Consultar saldo");
			System.out.println("    4.-Salir");
			opcion=leer.nextInt();
			
			if(opcion>4 && opcion<1) {
				menu=1;
			}
			else {
				System.out.println("_______________________________________");
				System.out.println("Opcion no disponible");
			}
		}while (menu == 0);

		if(opcion == 1) {
			
		}else if(opcion== 2) {
			
		}else if(opcion==3) {
			
		}else if(opcion==4) {
			System.out.println("____________________________________");
			System.out.println("Gracia por su preferencia");
			System.out.println("____________________________________");
			menu=2;
		}
	}while (menu !=2);
}
	public void Retiro() {
		R=leer.nextInt();
	}
	
	public void Deposito() {
		D=leer.nextInt();
	}
	
	public int getSaldo() {
		return saldo;
	}
	
	public void setSaldo(int saldo) {
		this.saldo=saldo;
	}
}

		

