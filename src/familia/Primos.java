package familia;

/*
* @Arias Hernández José Manuel
*/
public class Primos extends Abuelos{
    
    private int edad, peso;
    
    public Primos(int edad, int fechaNacimiento, String tipoSangre, String colorPiel){
        super (tipoSangre, colorPiel);
        this.edad=edad;
        this.peso=fechaNacimiento;
    }
    
    public int getedad(){
        return edad;
    }
    
    public int getfechaNacimiento(){
        return peso;
    }
    public String datosPublic(){
  	  System.out.println("-----Datos del primo-----");
        return("Tipo de sangre: "+tipoSangre+ "\nColor de piel: "+colorPiel+"\nEdad: "+edad+"\nPeso: "+peso);
    }
    
}