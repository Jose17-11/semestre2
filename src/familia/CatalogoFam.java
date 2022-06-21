package familia;

import grupo.Cuadrado;
import grupo.PropiedadesF;
import grupo.Triangulo;

/**
 * @Arias Hernández José Manuel
 */
public class CatalogoFam {
	
	public static void main(String[] args) {
		Abuelos miCatalogo[]=new Abuelos[3];

        miCatalogo[0]=new Abuelos("a+","moreno" );
		miCatalogo[1]=new Hijos("cafes", "Rizado", "Robusto", "o+", "Moreno");
        miCatalogo[2]=new Primos(25 ,70, "o+","wero");
        
        for(Abuelos x: miCatalogo){
        	System.out.println();
            System.out.println("***************************");
            System.out.println(x.datosPublic());
            
        }
	}

}
