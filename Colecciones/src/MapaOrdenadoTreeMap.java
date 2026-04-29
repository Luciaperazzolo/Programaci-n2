import java.util.TreeMap;

public class MapaOrdenadoTreeMap {
    public static void main(String[] args) {
        TreeMap<Integer, String> mapaOrdenado = new TreeMap<>();

        //Agregamos los IDs desordenados
        mapaOrdenado.put(20, "Perro");
        mapaOrdenado.put(40, "Gato");
        mapaOrdenado.put(80, "Caballo");

        //Obtener claves y recorrerlas
        System.out.println("Registros ordenados por ID: ");
        for (Integer id : mapaOrdenado.keySet()) {
            System.out.println("ID: " + id + " - Nombre: " + mapaOrdenado.get(id));
        }
    }
}
