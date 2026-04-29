import java.util.ArrayList;

public class OperacionesArrayList {
    public static void main(String[] args) {
        
        //ArrayList
        ArrayList<String> lista = new ArrayList<>();

        //Agregar elementos a la lista
        lista.add ("Uno"); //Inserta elementos al final de la lista.
        lista.add ("Dos");
        lista.add ("Tres");

        //Método Get()
        System.out.println("Elemento en índice 1: " + lista.get(1));

        //Método Set()
        lista.set(1, "Cuatro"); //Reemplaza lo que había en esa posición.

        //Método Remove()
        lista.remove(lista.size() -1); //En las listas usamos size() en lugar de length para saber cuántos elementos hay.

        System.out.println("Lista final: " + lista);
    }
}
