import java.util.*;
import java.util.stream.Collectors;

//Ejercicio 4.4 (Reducción a Colección)---------------------------
public class Persona {
    private String nombre;
    private String dni;

    //CONSTRUCTOR
    public Persona (String nombre, String dni){
        this.nombre = nombre;
        this.dni = dni;
    }

    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getDni(){
        return dni;
    }
}

class EjemploMapaPersonas {
    public static void main(String[] args) {
        //Lista de personas.
        List<Persona> personas = Arrays.asList(
            new Persona("Ana", "123"),
            new Persona("Luis", "456"),
            new Persona("María", "789")
        );

        //Se genera el mapa a partir del Stream.
        Map<String, String> mapaPersonas = personas.stream()
            .collect(Collectors.toMap(p -> p.getDni(), p -> p.getNombre()));

        //Y se imprime.
        System.out.println("Mapa de personas: " + mapaPersonas);
    }
}
