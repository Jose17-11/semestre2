package unidad3;
public class Ejercicio31 {
	
	int a1;
	String b;
	boolean c;
	boolean g;
	
	
	Ejercicio31(int a, String b, String string) {
		this.a1=a1;
		this.b=b;
		this.c=c;
	}
	
	
	Ejercicio31 (int d, String e, boolean f){
		a1=d;
		b=e;
		g=f;
	
}

	public static void main (String args []) {
		Ejercicio31 E31=new Ejercicio31 (10, "rojo", true);
		System.out.println("a)"+E31.a1);
		System.out.println("b)"+E31.b);
		System.out.println("c)"+E31.c);
		Ejercicio31 karen=new Ejercicio31 (325, "Palabra", "A");
		System.out.println("Segundo constructor");
		System.out.println("d="+karen.a1);
		System.out.println("e="+karen.b);
		System.out.println("f="+karen.g);
	}
}