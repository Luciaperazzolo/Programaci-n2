public class GestionArreglosBasico {

    public static void main(String[] args) {
        
    //Array tamaño 5
    int[] numeros = new int[5]; //Reserva espacio en memoria para exactamente 5 números enteros.

    //Asignar valores al arreglo
    numeros[0] = 10;
    numeros[1] = 20;
    numeros[2] = 30;
    numeros[3] = 40;
    numeros[4] = 50;

    //Actualizar valor
    numeros[2] = 100;

    //Obtener el último número
    int ultimo = numeros[numeros.length -1]; //Es la forma segura de llegar al final sin importar qué tan grande sea el arreglo.

    System.out.println("Último número: " + ultimo);
    }
    

}
