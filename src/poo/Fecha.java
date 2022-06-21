package poo;
import java.util.Scanner;
	public class Fecha {
		Scanner leer=new Scanner(System.in);
		String mes;
		int dia;
		
		public Fecha (String _mes, int dia) {

			_mes = mes;
			this.dia = dia;	
		}
		
		public void mostrarDatos() {
			System.out.println("Valor de mes es: "+mes);
			System.out.println("Valor de mes es: "+dia);
		}
				
}		