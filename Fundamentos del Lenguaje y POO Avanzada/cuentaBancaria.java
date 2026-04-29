public class cuentaBancaria{
    private double saldo;
    private int numeroCuenta;

    //GETTERS
    public double getSaldo(){
        return saldo;
    }
    public int getnumeroCuenta(){
        return numeroCuenta;
    }

    //SETTERS
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setnumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }

    //Método depositar
    public void depositar(double monto){
        if(monto > 0){
            saldo += monto;
            System.out.println("Su saldo es: " + saldo);
        }
    }



}