package familia;
/*
La clase principal es abuelos con dos atributos que van a ser color de piel y tipo de sangre, 
Generar dos clases primos clase primos tiene color de piel y sangre mas otros 2 atributos y la clase hijos 3 atributos mas
y una mas que se llame familia con un arreglo de 6 atributos
a la clase de figuras darle datos por usuario
*/
/*
* @Arias Hernández José Manuel
*/
public class Abuelos {
  
  protected String tipoSangre, colorPiel;
  
  public Abuelos(String tipoSangre, String colorPiel){
      this.tipoSangre=tipoSangre;
      this.colorPiel=colorPiel;
  }
  
  public String gettipoSangre(){
      return tipoSangre;
  }
  
  public String getcolorPiel(){
      return colorPiel;
  }
  
  public String datosPublic(){
	  System.out.println("-----Datos del abuelo-----");
      return ("Tipo de sangre: "+tipoSangre+ "\nColor de piel: "+colorPiel);
  }
}