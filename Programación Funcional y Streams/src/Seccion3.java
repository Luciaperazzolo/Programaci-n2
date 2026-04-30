import java.util.List;
import java.util.stream.Stream;

public class Seccion3 {
    public static void main(String[] args) {
        //SECCIÓN 3 (Transformación, Aplanamiento y Ordenación)------------
        //map() siempre devuelve un nuevo Stream transformado.

        //Ejercicio 3.1 (Transformación con Map)---------------------------
        Stream.of("Juan", "Maria", "Ana")
        .map(s -> s.toUpperCase()) //map transforma cada elemento, a cada nombre lo convierte a mayúsculas.
        .forEach(s -> System.out.println(s)); //

        //Ejercicio 3.2 (Map a tipos primitivos))---------------------------
        //mapToInt() devuelve IntStream.
        int suma = Stream.of("Juan", "Maria", "Ana")
        .mapToInt(s -> s.length()) //Convierte String a int.
        .sum(); //Suma todos los valores.

        System.out.println("Suma total: " + suma);

        //Ejercicio 3.3 (Aplanamiento con flatMap)---------------------------
        List<List<String>> datos = List.of(
            List.of("Juan", "Maria"),
            List.of("Ana", "Pedro"),
            List.of("Luis")
        );

        long resultado = datos.stream()
            .flatMap(l -> l.stream()) //flatMap convierte muchos streams en uno solo.
            .filter(s -> s.length() > 4)
            .count();

        System.out.println("Cantidad: " + resultado);

        //Ejercicio 3.4 (Ordenación)---------------------------
        //Orden natural.
        System.out.println("Orden natural:");
        Stream.of("Juan", "Maria", "Ana", "Pedro")
            .sorted()
            .forEach(System.out::println);

        //Orden por longitud.
        System.out.println("\nOrden por longitud:");
        Stream.of("Juan", "Maria", "Ana", "Pedro")
            .sorted((a, b) -> a.length() - b.length())
            .forEach(System.out::println);
    }
}
