import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Seccion4 {
    public static void main(String[] args) {
        //Sección 4: Automatización de Recursos-----------
        //Ejercicio 4.1 (Manejo de archivos con try-with-resources).
        System.out.println("----EJERCICIO 4.1----");
        
        //Declaramos el recurso dentro de los paréntesis del try.
        //Esto garantiza que el BufferedReader se cierre solo al final.
        try (BufferedReader br = new BufferedReader(new FileReader("personas.txt"))) {
            
            String linea;
            
            //Leemos el archivo línea por línea hasta que no haya más (null).
            while ((linea = br.readLine()) != null) {
                //Imprimimos cada línea en la consola.
                System.out.println(linea);
            }
            
            //Aquí NO necesitamos un bloque finally para cerrar 'br'. 

        } catch (IOException e) {
            //Capturamos errores de Entrada/Salida (si el archivo no existe o no se puede leer).
            System.err.println("No se pudo procesar el archivo: " + e.getMessage());
        }
    }
}
