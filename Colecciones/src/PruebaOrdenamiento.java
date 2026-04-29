import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//Clase para orden personalizado alfabético 
class ComparadorPorNombre implements Comparator<Empleado> {
    @Override
    public int compare(Empleado e1, Empleado e2) {
        return e1.getNombre().compareTo(e2.getNombre());
    }
}

public class PruebaOrdenamiento {
    public static void main(String[] args) {
        List<Empleado> lista = new ArrayList<>();
        lista.add(new Empleado("Gianalla", 21));
        lista.add(new Empleado("Agostina", 22));
        lista.add(new Empleado("Lucia", 25));

        //Orden Natural (por edad usando Comparable)
        Collections.sort(lista);
        System.out.println("Orden natural (edad): " + lista);

        //Orden Personalizado (por nombre usando Comparator)
        Collections.sort(lista, new ComparadorPorNombre());
        System.out.println("Orden personalizado (nombre): " + lista);
    }
}

