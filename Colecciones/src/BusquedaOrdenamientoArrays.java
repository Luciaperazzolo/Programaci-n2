import java.util.Arrays;

public class BusquedaOrdenamientoArrays {
    public static void main(String[] args) {

        //Arreglo con nombres desordenados
        String[] nombres = {"Lucia", "Agostina", "Gianella", "Santiago"};

        //Ordenar
        Arrays.sort(nombres); //Reorganiza el arreglo origina con los String, lo hace en orden alfabético.

        //Buscar nombre específico
        int posicion = Arrays.binarySearch(nombres, "Gianella"); //Es una búsqueda muy rápida, pero obligatoriamente el arreglo debe estar ordenado antes de usarla, de lo contrario dará resultados incorrectos.

        System.out.println("Posición: " + posicion);
    }
}
