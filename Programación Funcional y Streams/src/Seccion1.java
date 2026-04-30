import java.util.ArrayList;
import java.util.List;
import java.util.function.*;

public class Seccion1 {
    public static void main(String[] args) {
        //SECCIÓN 1 (Expresiones Lambda e Interfaces Funcionales)------------

        //Ejercicio 1.1 (Interfaces Base)------------------------------------

        //1.Predicate
        Predicate<Integer> esPar = n -> n % 2 == 0;
        System.out.println(esPar.test(2));
        System.out.println(esPar.test(7));
        
        //2.Function
        Function<String, Integer> longitud = texto -> texto.length();
        System.out.println(longitud.apply("Clase de Programacion"));

        //3.Consumer
        Consumer<Integer> imprimir = n -> System.out.println(n);
        imprimir.accept(6);

        //4.Supplier
        Supplier<Double> aleatorio = () -> Math.random();
        System.out.println(aleatorio.get());

        //Ejercicio 1.2 (Ordenación con Comparator)----------------------------

        List<String> textos = new ArrayList<>();
        textos.add("Programacion");
        textos.add("EStadistica");
        textos.add("Sistemas");
        textos.add("Datos");

        textos.sort(((a,b) -> a.length() - b.length()));
        System.out.println(textos);

        //Ejercicio 1.3 (Variantes Primitivas)---------------------------------

        ToIntFunction<String> longitud2 = texto2 -> texto2.length();
        System.out.println(longitud2.applyAsInt("Primer Cuatrimestre"));

        IntPredicate esPar2 = n -> n % 2 == 0;
        System.out.println(esPar2.test(6));
        System.out.println(esPar2.test(11));
    }
}
