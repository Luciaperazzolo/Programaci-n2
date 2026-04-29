import java.util.HashMap;

public class RegistroUsuariosHashMap {
    public static void main(String[] args) {
        //Crear el mapa (Clave: ID, Valor: Nombre)
        HashMap<Integer, String> usuario = new HashMap<>();

        //Agregar datos
        usuario.put(1, "Lucia");
        usuario.put(2, "Agostina");
        usuario.put(3, "Bianca");

        //Recuperar un nombre
        String nombre = usuario.get(2);

        //Actualizar un nombre
        usuario.replace(3, "Ivana");

        System.out.println("Este es el mapa actualizado: " + usuario);

        //Eliminar un nombre
        usuario.remove(3);

        //Mostrar como quedo el mapa
        System.out.println("Este es el nombre recuperado: " + nombre);
        System.out.println("ESte es el mapa final: " + usuario);


    }
}
