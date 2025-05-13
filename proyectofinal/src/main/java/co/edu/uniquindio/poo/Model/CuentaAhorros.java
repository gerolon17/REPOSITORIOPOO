package co.edu.uniquindio.poo.Model;

public class CuentaAhorros extends CuentaBancaria{
    private double tasaIntereses;
    private double limTransaccion;

    public CuentaAhorros(String idCliente, String numeroCuenta, double saldoCuenta, double tasaIntereses, double limTransaccion){
        super(idCliente, numeroCuenta, saldoCuenta);
        this.tasaIntereses = tasaIntereses;
        this.limTransaccion = limTransaccion;
    }

    public double getTasaIntereses() {
        return tasaIntereses;
    }

    public void setTasaIntereses(double tasaIntereses) {
        this.tasaIntereses = tasaIntereses;
    }

    public double getLimTransaccion() {
        return limTransaccion;
    }

    public void setLimTransaccion(double limTransaccion) {
        this.limTransaccion = limTransaccion;
    }

    
}
