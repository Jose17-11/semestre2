package grupo;
/**
 * @Arias Hernández José Manuel
 */
public class CatalogoFig {
    
    public static void main(String[] args){
        PropiedadesF miCatalogo[]=new PropiedadesF[3];

        miCatalogo[0]=new PropiedadesF(12,"Prisma" );
        miCatalogo[1]=new Cuadrado("Azul", "noble", 12,"Cuadrado");
        miCatalogo[2]=new Triangulo(5,"Triangulo",7 );
        
        //for (int i=0; i<miCatalogo.length; i++){
           // System.out.println("\n**************************");
         //   System.out.println(miCatalogo[i].datosPublic());
       // }
        for(PropiedadesF x: miCatalogo){
        	System.out.println();
            System.out.println("***************************");
            System.out.println(x.datosPublic());
            
        }
       // PropiedadesF miCatalogo2[][][]=new PropiedadesF[3][3][3];
        //for(){
            
        //}
        
    }
    
}