import java.util.LinkedList;
import java.util.List;

public class ComparativaListas {
    public static void main(String[] args) {
        
        //Lista Inmutable
        List<String> lista = List.of("A", "B", "C"); //Crea una lista "de solo lectura". En Java se utiliza para proteger datos.

        //Error UNSUPPORTEDOPERATIONEXCEPTION
        //lista.add("D");

        //Lista mutable
        LinkedList<String> Linked = new LinkedList<>(lista); //A diferencia del ArrayList, no usa un arreglo interno, sino "nodos" conectados.
                                                            //Es ideal si vas a estar metiendo o sacando cosas en medio de la lista frecuentemente.

        //Agregar elementos a la lista mutable
        Linked.add("F");
        Linked.add("X");

        //Se usa cuando hay solo 3 elementos
        String ultimo = Linked.getLast();
        Linked.removeLast();
        Linked.add("D");
        Linked.add(ultimo);

        System.out.println(Linked);
    }
}
