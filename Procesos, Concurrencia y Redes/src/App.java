public class App {
    public static void main(String[] args) {

         //Sección 1
        //Ejercicio 1.1 (Extendiendo la clase Thread)
        //Creamos varias instancias de la clase.
        //System.out.println("---EJERCICIO 1.1---");
        TareaHilo hilo1 = new TareaHilo();
        //TareaHilo hilo2 = new TareaHilo();
        //TareaHilo hilo3 = new TareaHilo();
        
        hilo1.start();
        //hilo2.start();
        //hilo3.start();


        //Sección 1
        //Ejercicio 1.2 (Implementando la interfaz Runnable)
        //Crear una instancia de la clase TareaRunnable.
        //System.out.println("---EJERCICIO 1.2---");
        TareaRunnable tarea = new TareaRunnable();

        //Crear hilos y les pasamos la tarea.
        Thread Hilo1 = new Thread(tarea);
        //Thread Hilo2 = new Thread(tarea);
        //Thread Hilo3 = new Thread(tarea);

        //Se ejecutan.
        Hilo1.start();
        //Hilo2.start();
        //Hilo3.start();

        //Sección 2
        //Ejercicio 2.1 (Simulando una anomalía)
        //Se crea una sola instancia (compartida).
        //System.out.println("---EJERCICIO 2.1---");
        Contador contador = new Contador();

         //Crear dos hilos con la misma tarea
        Thread hiloA = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                contador.incrementar();
            }
        });

        Thread hiloB = new Thread(() -> {
            for (int i = 0; i < 10000; i++) {
                contador.incrementar();
            }
        });

        //Se ejecutan los hilos.
        hiloA.start();
        hiloB.start();

        try {
            //Esperamos a que terminen.
            hiloA.join();
            hiloB.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Resultado final
        System.out.println("Valor final: " + contador.valor);


        //Sección 4
        //Ejercicio 4.1 (Identidad y Prioridades)
        Thread hilo = new Thread(new TareaLarga());

        hilo.start();

        try {
            //Espera a que termine el hilo
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Main continúa después del hilo");

        //Sección 4
        //Ejercicio 4.2 (Espera e Interrupción)
        Thread hiloX = new Thread(new TareaLarga());

        hiloX.start();

        try {
            Thread.sleep(2000); //Dejamos que trabaje un poco
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //Interrumpimos el hilo.
        hilo.interrupt();
    }
}
