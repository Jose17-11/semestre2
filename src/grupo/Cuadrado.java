package grupo;

public class Cuadrado extends PropiedadesF{
    
    private String color, textura;
    
    public Cuadrado(String color, String textura, int base, String nombreF){
        
        super(base, nombreF);
        this.color=color;
        this.textura=textura;
        
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