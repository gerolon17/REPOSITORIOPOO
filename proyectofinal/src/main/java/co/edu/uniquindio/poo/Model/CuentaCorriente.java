package co.edu.uniquindio.poo.Model;

public class CuentaCorriente extends CuentaBancaria{
    private double sobreGiroActual;

    public CuentaCorriente(String idCliente, String numeroCuenta, double saldoCuenta, double sobreGiroActual){
        super(idCliente, numeroCuenta, saldoCuenta);
        this.sobreGiroActual = sobreGiroActual;
    }

    public double getSobreGiroActual() {
        return sobreGiroActual;
    }

    public void setSobreGiroActual(double sobreGiroActual) {
        this.sobreGiroActual = sobreGiroActual;
    }

    
}
