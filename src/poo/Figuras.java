package poo;

import java.util.Scanner;

public class Figuras {
	
	static Scanner leer=new Scanner (System.in);
	
	int base;
	int altura1; 
	int radio;
	int basemenor;
	int basemayor;
	int lado1;
	int lado2;
	int altura2;
	float pi;
	//Area de triangulo
	public void AreaTriangulo(int base, int altura) {
		System.out.println("Area del triangulo");
		System.out.println("Escribe la base del triangulo");
		base=leer.nextInt();
		System.out.println("Escribe la altura del triangulo");
		altura1=leer.nextInt();
		int areat=base*altura1;
		System.out.println("El area del triangulo es: "+areat);
	}

}
