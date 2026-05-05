public class TareaLarga2 implements Runnable{
    //Sección 4
    //Ejercicio 4.2 (Espera e Interrupción)

    @Override
    public void run() {

        System.out.println("Hilo iniciado");

        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("Trabajando...");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Hilo fue interrumpido");
        }

        System.out.println("Hilo finalizado");
    }
}
