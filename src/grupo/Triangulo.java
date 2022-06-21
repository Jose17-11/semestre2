package grupo;
/**
 * @Arias Hernández José Manuel
 */
public class Triangulo extends PropiedadesF{
    private int altura;
    
    public Triangulo(int base, String nombreF, int altura){
     super (base, nombreF);
     this.altura=altura;
    }
    
    public int getaltura(){
        return altura;
    }
    
    public String datosPublic (){
  	  System.out.println("-----Datos del Triangulo-----");
        return ("Geometria: " + nombreF + "\nBase: " + base + "\nAltura: " + altura);
    }
}