package grupo.copy;
import java.util.Scanner;
public class PropiedadesF {
    
    protected int base;
    protected String nombreF;
    
    //Constructor 
	Scanner leer=new Scanner(System.in);
    public PropiedadesF(int base, String nombreF){
        this.base=base;
        this.nombreF=nombreF;
  	  System.out.println("Ingresa que figura va a ser:");
  	  base=leer.nextInt();
	  System.out.println("Ingresa la base de la figura:");
  	  nombreF=leer.nextLine();
    }
    
    public int getbase(){
        return base;
    }
    public String getombreF(){
        return nombreF;
    }
    
    public String datosPublic(){
  	  System.out.println("-----Datos de la propiedad principal-----");
        return("Base: "+nombreF+"\nGeometria: "+base);
    }
    
}