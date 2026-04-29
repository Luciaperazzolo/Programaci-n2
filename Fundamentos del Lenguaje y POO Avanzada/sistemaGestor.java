public class sistemaGestor {
    int usuario = 5;

    public static final int MAX_CONEXIONES = 10; //Es static porque pertenece a la clase, es final porque su valor no puede cambiar.

    public void mostrarDatos(){
        System.out.println("El valor máximo de conexiones es: " + MAX_CONEXIONES);
    }
}