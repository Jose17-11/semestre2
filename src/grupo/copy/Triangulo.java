package grupo.copy;
import java.util.Scanner;

/**
 * @Arias Hernández José Manuel
 */
public class Triangulo extends PropiedadesF{
    private int altura;

	Scanner leer=new Scanner(System.in);
    
    public Triangulo(int base, String nombreF, int altura){
     super (base, nombreF);
     this.altura=altura;
	  System.out.println("Ingresa que figura va a ser:");
	  altura=leer.nextInt();
    }
    
    public int getaltura(){
        return altura;
    }
    
    public String datosPublic (){
    	  System.out.println("-----Datos del Cuadrado-----");
  	  System.out.println("-----Datos del Triangulo-----");
        return ("Geometria: " + nombreF + "\nBase: " + base + "\nAltura: " + altura);
    }
}