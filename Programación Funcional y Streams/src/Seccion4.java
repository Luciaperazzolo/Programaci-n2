import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Seccion4 {
    public static void main(String[] args) {
        //SECCIÓN 4 (Operaciones Finales y Clase Optional)------------
        
        //Ejercicio 4.1 (Comprobaciones lógicas)---------------------------
        Stream<Integer> numeros = Stream.of(2, 5, 7, 3, 6, 2, 3);
        boolean algunoMayorQue5 = numeros.anyMatch(n -> n > 5); //anyMatch devuelve true si al menos un elemento cumple la condición.

        //Para usar allMatch y noneMatch hay que crear otro Stream, porque el anterior ya se consumió.
        boolean todosMAyoresQue0 = Stream.of(2, 5, 7, 3, 6, 2, 3).allMatch(n -> n > 0); //allMatch devuelve true si todos los elementos cumplen la condición.
        boolean ningunoNegativo = Stream.of(2, 5, 7, 3, 6, 2, 3).anyMatch(n -> n < 0); //anyMAtch devuelve true si ningún elemento cumple la condición.

        System.out.println("Los números > 5: " + algunoMayorQue5);
        System.out.println("Todos los números > 0: " + todosMAyoresQue0);
        System.out.println("Ningún números es < 0: " + ningunoNegativo);

        //Ejercicio 4.2 (Búsqueda y Clase Optional)---------------------------
        Optional<Integer> primerPar = Stream.of(2, 5, 7, 3, 6, 2, 3)
            .filter(n -> n % 2 == 0) //Selecciona solo los números pares.
            .findFirst(); //Devuelve el primer elemento que cumple la condición.

        if (primerPar.isPresent()) { //isPresent comprueba si hay valor.
            System.out.println("Primer número par encontrado: " + primerPar.get()); //Extrae el valor si existe.
        } else {
            System.out.println("No se encontró ningún número par.");
        }

        //Ejercicio 4.3 (Reducción)---------------------------
        Optional<Integer> suma = Stream.of(2, 5, 7, 3, 6, 2, 3)
            .reduce((a, b) -> a + b); //Reduce combina todos los elementos del Stream en un único resultado.
                                     //Indica que queremos sumar los elementos.  
        if (suma.isPresent()) {
            System.out.println("La suma total es: " + suma.get());
        }

        //Ejercicio 4.4 (Reducción a Colección)---------------------------
        List<Integer> listaSinDuplicados = Stream.of(2, 5, 7, 3, 6, 2, 3)
            .distinct() //Elimina duplicados.
            .collect(Collectors.toList()); //Collect transforma el Stream en colecciones (List, Map, Set, ETC).

        System.out.println("Lista limpia: " + listaSinDuplicados);
    }
}
