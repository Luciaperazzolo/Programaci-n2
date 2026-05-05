//Clase que IMPLEMENTA Runnable.
public class TareaRunnable implements Runnable{

    //Sección 1
    //Ejercicio 1.2 (Implementando la interfaz Runnable)

    //Método obligatorio
     @Override
    public void run(){
        //Bucle que imprime números del 1 al 5.
        for(int i = 1; i<= 5; i++){
            //Muestra el número y el nombre del hilo.
            System.out.println("Hilo " + Thread.currentThread().getName() + ": " + i);

            try {
                Thread.sleep(500); //Pausa para ver mejor la concurrencia.
            }catch (InterruptedException e) {
                System.out.println("Error en el hilo");
            }
        }
    }    
}
