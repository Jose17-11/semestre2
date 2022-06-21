package unidad5;
import java.util.Scanner;
/**
 * @Arias Hernández José Manuel
 */
public class Entrada {
    public static void main(String[]args){
        Scanner leer=new Scanner(System.in);
        Entrada obj=new Entrada();
        
        try {
            System.out.println("Ingrese un número");
            int bait = leer.nextInt();
            System.out.println("Su numero es: "+bait);
    } catch(Exception err) {
            System.out.println("Solo se pueden ingresar numero");
            obj.Entrada();
    }
    }        
    private String[] args;
    
    void Entrada() {
        Entrada.main(args);
        }
}