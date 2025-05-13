package co.edu.uniquindio.poo.Model;

public abstract class CuentaBancaria {
    private String idCliente;
    private String numeroCuenta;
    private double saldoCuenta;

    public CuentaBancaria(String idCliente, String numeroCuenta, double saldoCuenta){
        this.idCliente = idCliente;
        this.numeroCuenta = numeroCuenta;
        this.saldoCuenta = saldoCuenta;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoCuenta() {
        return saldoCuenta;
    }

    public void setSaldoCuenta(double saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    
}
