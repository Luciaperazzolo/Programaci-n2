class TareaLarga implements Runnable {
    //Sección 4
    //Ejercicio 4.1 (Identidad y Prioridades)

    @Override
    public void run() {

        System.out.println("Hilo largo iniciado");

        try {
            Thread.sleep(3000); //Simula tarea larga
        } catch (InterruptedException e) {
            System.out.println("Hilo interrumpido durante sleep");
        }

        System.out.println("Hilo largo terminado");
    }
}
