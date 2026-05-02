//Definición de la excepción personalizada (Checked).
//Al heredar de Exception, obligamos a quien la use a gestionarla.
class SaldoInsuficienteException extends Exception {
    //Constructor.
    public SaldoInsuficienteException(String mensaje) {
        super(mensaje); //Pasamos el mensaje a la clase padre Exception.
    }
}

class cuentaBancaria {
    private double saldo = 100.0;
    //'throws' indica que este método puede fallar y lanza el error hacia arriba.
    public void retirar(double monto) throws SaldoInsuficienteException{
        if(monto > saldo){
            //Lanzamos la excepción manualmente
            throw new SaldoInsuficienteException("No tiene saldo suficiente para retirar" + monto);
        }
        saldo -= monto;
        System.out.println("Retiro exitoso. Saldo restante: " + saldo);
    }
    
}

public class Ejercicio3_1{
    public static void main(String[] args) {
        //Sección 3: Creación e Implementación de Excepciones Personalizadas-----------
        //Ejercicio 3.1 (Excepción Checked Personalizada).
        System.out.println("----EJERCICIO 3.1----");
        cuentaBancaria cuenta = new cuentaBancaria();

        try{
            cuenta.retirar(500.0);
        }catch(SaldoInsuficienteException e){
            System.out.println("Error Bancario: " + e.getMessage());
        }
    
    
    }
}
