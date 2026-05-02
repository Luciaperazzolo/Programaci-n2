public class Seccion1{
    public static void main(String[] args) {

        //Sección 1: Bloques try/catch/finally y multi-catch-----------
        
        //Ejercicio 1.1 (Bloques try/catch y captura de información).
        System.out.println("----EJERCICIO 1.1----");
        try{
            //Intentar convertir un texto que no es numérico a entero.
            String texto = ("abc");
            int numero = Integer.parseInt(texto); //Esto lanzará NumberFormatException.
        }catch(NumberFormatException e){ //(e) es el objeto que contiene toda la información del error.
            System.out.println("Mensaje: " + e.getMessage()); //Imprime el mensaje específico del error (ej. "For input string: 'abc'").
            System.out.println("Tipo de clase: " + e.getClass() .getName()); //Imprime el nombre completo de la clase de la excepción.
        }

        //Ejercicio 1.2 (El bloque finally).
        System.out.println("\n----EJERCICIO 1.2----");
        try{
            int division = 10 / 0; //Una división por cero es matemáticamente imposible.
            System.out.println("Resultado de la división: " + division); //Esta linea es la que nunca se va a ejecutar.
        }catch(ArithmeticException e){
            System.out.println("Error: no se puede dividir por cero"); //El error de cálculo.
        }finally{
            System.out.println("Limpieza final: el bloque finally se ejecutó");// sto se imprime SIEMPRE, incluso después del catch.
        }

        //Ejercicio 1.3 (Uso de multi-catch).
        System.out.println("\n----EJERCICIO 1.3----");
        String entrada = "0";

        try{
            int numero2 = Integer.parseInt(entrada); //Convertir texto a número.
            int calculo = 100 / numero2; //Realizar la división.
            System.out.println("El resultado del cálculo es: " + calculo);
        }catch(NumberFormatException | ArithmeticException e){
            //El operador '|' permite agrupar ambas excepciones.
            //Si ocurre cualquiera de las dos, entra acá.
            System.out.println("Error de cálculo o conversión");
        }
    }
}