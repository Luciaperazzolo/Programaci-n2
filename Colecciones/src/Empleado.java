
//Implementar Comparable para definir orden por edad
public class Empleado implements Comparable<Empleado> {
    private String nombre;
    private int edad;

    //Constructor
    public Empleado(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public int getEdad(){
        return edad;
    }
    
    //Sobrescribir compareTo para ordenar por edad
    @Override
    public int compareTo(Empleado otro) {
        return Integer.compare(this.edad, otro.edad);
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años)";
    }
    
}
