import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
 
public class Start {
 
 
    public static void main(String[] args) {
 
        String ruta = "";
  
        Scanner entradaDatos = new Scanner(System.in);
 
        System.out.println("Introduce la ruta del archivo a sobrescribir ");
        ruta = entradaDatos.next();
        File archivo = new File(ruta);
        // creación de objeto 
 
        try {
 
            FileWriter fR = new FileWriter(archivo, false);
            // fichero en modo escritura
 
            PrintWriter pW = new PrintWriter(fR);
            // permite la escitura sobre  fR
 
            pW.print("MACHACADO");
            // ejecuta la escritura del valor introducido
            System.out.println("El fichero se modifico");
            // muestra un aviso de fichero modificado
            fR.close();
            pW.close();
            //cerramos
 
        } catch (IOException e) {
            // detalle de la excepción si el fichero no puede abrirse
            e.printStackTrace();
            System.out.println("El fichero no puede abrirse");
        }
    }
}