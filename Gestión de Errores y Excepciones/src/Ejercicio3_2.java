//Definición de la excepción personalizada (Unchecked)
//Hereda de RuntimeException, por lo que el try-catch es opcional.
class ProductoInvalidoException extends RuntimeException{
    public ProductoInvalidoException(String mensaje){
        super(mensaje);
    }
}

class Producto {
    private String nombre;
    private double precio;

    //Constructor
    public Producto(String nombre, double precio){
        if(precio <= 0){
            //Lanzamos el error porque un precio negativo es un error de lógica.
            throw new ProductoInvalidoException("Precio inválido: " + precio);
        }
        this.nombre = nombre;
        this.precio = precio;
    }
    
}

public class Ejercicio3_2 {
    public static void main(String[] args) {
        //Sección 3: Creación e Implementación de Excepciones Personalizadas-----------
        //Ejercicio 3.2 (Excepción Unchecked Personalizada).
        System.out.println("----EJERCICIO 3.2----");

        System.out.println("Intentando crear producto...");
        Producto P = new Producto("Computadora", -100.5);

        //Esta línea nunca se imprimirá porque el programa se detiene arriba
        System.out.println("Producto creado con éxito.");

        
    }
}
