package unidad6;
import java.io.File;
import java.util.Scanner;
public class Documento extends Proyecto{
	
    public static void main(String[] args) 
    		throws Exception{
        File doc =new File("C:\\Users\\soy_l\\eclipse\\java-2021-122\\semestre-2\\semestre-2\\src\\unidad6\\Proyecto.txt");
        Scanner archivo = new Scanner(doc);
        
        System.out.println();
        while (archivo.hasNextLine())
            System.out.println(archivo.nextLine());
        System.out.println();
        System.out.println("*********************************************");
        System.out.println();
        }
}