public class Contador {
    //Sección 2
    //Ejercicio 2.1 (Simulando una anomalía)

    int valor = 0;

    public synchronized void incrementar (){
        
        synchronized (this) { //Bloque sincronizado
            valor++;
        }
    }
}
