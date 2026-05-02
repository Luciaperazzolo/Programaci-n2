public class Seccion2 {
    public static void main(String[] args) {
        //Sección 2: Metodologías para la gestión y prevención de errores-----------

        
        //Ejercicio 2.2 (Uso de mensajes claros y captura específica).
        //System.out.println("----EJERCICIO 2.2----");
        try{
            registrarUsuario("Lucia", -25); //Probamos el método con un dato inválido (edad negativa).
        }catch(IllegalArgumentException e){ //La excepción técnica
            System.out.println("Error al registrar: " + e.getMessage());
        }
    }

        //Ejercicio 2.1 (Validar entradas y Fallar Rápido / Fail-fast).
        //Hay que validar los datos antes de realizar cualquier operación lógica.
        public static void registrarUsuario(String nombre, int edad){
            System.out.println("\n----EJERCICIO 2.1----");
            //Revisamos si el objeto existe y si tiene texto real. Es el primer filtro del "Fail-fast".
            if(nombre == null || nombre.isBlank()){ //Validamos si el nombre es nulo o está vacío ("") con .isBlank().
                throw new IllegalArgumentException("El nombre no puede estar vacío.");
            }
            if(edad < 0){ //Validamos la edad con un mensaje explícito.
                //Lanzamos la excepción manualmente con un mensaje claro.
                throw new IllegalArgumentException("La edad no puede ser negativa (" + edad + ").");
            }
            //Si las validaciones pasan, el código continúa normalmente.
            System.out.println("Usuario " + nombre + " registrado con éxito.");
        }
        

        
    
}
