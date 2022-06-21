package familia;

/*
* @Arias Hernández José Manuel
*/
public class Hijos extends Abuelos{
	private String colorOjos, cabello, complexion;
	
	public Hijos(String colorOjos, String cabello, String complexion, String tipoSangre, String colorPiel){
        super (tipoSangre, colorPiel);
        this.colorOjos=colorOjos;
        this.cabello=cabello;
        this.complexion=complexion;
	}
	
	public String colorOjos(){
        return colorOjos;
    }
    
    public String cabello(){
        return cabello;
    }
    
    public String complexion(){
        return complexion;
    }
    
    public String datosPublic(){
    	System.out.println();
  	  System.out.println("-----Datos del hijo-----");
        return ("Tipo de sangre: "+tipoSangre+ "\nColor de piel: "+colorPiel+"\nColor de ojos: "+colorOjos+ "\nCabello: " + cabello + "\nComplexion: " +complexion);
    }
}