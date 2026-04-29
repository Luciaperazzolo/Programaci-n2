public class Usuario{
    private String nombre;
    private int edad;
    private String correo;
    private int telefono;

    //Constructor
    public Usuario(){
    }

    //Sobrecarga de constructor
    public Usuario(String nombre, int edad, String correo, int telefono){
        this.nombre = nombre;
    }

    public Usuario (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public void actualizarPerfil(String correo){
        System.out.println("Correo actualizado a: " + correo);

    }

    public void actualizarPerfil(String correo, int telefono){
        System.out.println("Correo actualizado a: " + correo);
        System.out.println("Teléfono actualizado a: " + telefono);
    }
}