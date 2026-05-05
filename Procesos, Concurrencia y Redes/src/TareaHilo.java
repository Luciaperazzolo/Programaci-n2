// Definimos una clase que HEREDA de Thread.
public class TareaHilo extends Thread{

    //Sección 1
    //Ejercicio 1.1 (Extendiendo la clase Thread)

    //Se sobrescribe el método run()
    //Este método contiene el código que va a ejecutar el hilo.
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

