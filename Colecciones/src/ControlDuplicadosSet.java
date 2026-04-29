import java.util.HashSet;

public class ControlDuplicadosSet {
    public static void main(String[] args) {
        
        HashSet<Integer> conjunto = new HashSet<>(); //El HashSet usa un código especial (hashCode) para saber si un objeto ya existe.
                                                    //Si intentas meterlo de nuevo, simplemente lo ignora.
        
        //Insertar 3 veces el mismo número
        conjunto.add(50);
        conjunto.add(20);
        conjunto.add(10);

        System.out.println("Este es el conjunto de numeros: " + conjunto.size());

        //Comprobar si existe
        if (conjunto.contains(50)){
            System.out.println("El número 50 está en el conjunto.");
        }

        //Eliminar
        conjunto.remove(50);

        System.out.println("Contenido final del set: " + conjunto);

    }
}
