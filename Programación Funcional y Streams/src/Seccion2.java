import java.util.stream.Stream;

public class Seccion2 {
    public static void main(String[] args) {
        //SECCIÓN 2 (Creación, Filtrado y Extracción de Datos en Streams)------------
        
        //Ejercicio 2.1 (Creación y Extracción)------------------------------------
        long resultado = Stream.of(2, 3, 3, 4, 5, 6, 7, 8) //Stream.of(...) crea el flujo.
        .distinct() //Elimina duplicados.
        .skip(1) //Salta el primer elemento.
        .limit(3) //Se queda con los primeros 3 elementos.
        .count(); //Cuenta cuántos elementos hay.

        System.out.print("Cantidad final: " + resultado);

        //Ejercicio 2.2 (Filtrado y Procesamiento Intermedio)------------------
        long resultado2 = Stream.of(2, 4, 3, 3, 6, 7, 9)
        .filter(s -> s > 3) //Filtra valores mayores a 3. (s cada elemento del stream). Filtra con condición.
        .peek(n -> System.out.println("Valor: " + n)) //Para ver qué está pasando en el flujo. NO modifica los datos, solo imprime mientras pasan.
        .count();

        System.out.println("Cantidad final: " + resultado2);
    }
}
