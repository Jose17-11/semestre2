package grupo;

public class PropiedadesF {
    
    protected int base;
    protected String nombreF;
    
    //Constructor 
    public PropiedadesF(int base, String nombreF){
        this.base=base;
        this.nombreF=nombreF;
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