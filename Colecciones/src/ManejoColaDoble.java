import java.util.ArrayDeque;

public class ManejoColaDoble {
    public static void main(String[] args) {
        //Colección ArrayDeque
        ArrayDeque<String> fila = new ArrayDeque<>();

        //Agregar elementos al inicio y al final.
        fila.addFirst("Alumno A (Primero)");
        fila.addLast("Alumno B (último)");
        fila.addFirst("Alumno C (Nuevo Primero)");

        //Recuperar los elementos
        System.out.println("Estos son los elementos en fila: " + fila);

        //Eliminar elementos
        fila.removeFirst();
        fila.removeLast();

        System.out.println("Estos son los elementos de la fila después de remover: " + fila);
    }
}
