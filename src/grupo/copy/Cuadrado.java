package grupo.copy;
import java.util.Scanner;
public class Cuadrado extends PropiedadesF{
    
    private String color, textura;

	Scanner leer=new Scanner(System.in);
    
    public Cuadrado(String color, String textura, int base, String nombreF){
    	
        
        super(base, nombreF);
        this.color=color;
        this.textura=textura;
  	  System.out.println("Ingresa que figura va a ser:");
  	  color=leer.nextLine();
	  System.out.println("Ingresa la base de la figura:");
  	  textura=leer.nextLine();
        
    }
    
    public String getcolor(){
        return color;
    }
    public String gettextura(){
        return textura;
    }
    
    public String datosPublic (){
    	System.out.println();
  	  System.out.println("-----Datos del Cuadrado-----");
        return ("Geometria: " + nombreF + "\nBase: " +base + "\ncolor: "+color +"\ntextura: "+textura);
    }
    
}