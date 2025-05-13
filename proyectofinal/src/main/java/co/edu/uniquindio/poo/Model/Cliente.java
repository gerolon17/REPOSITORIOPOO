package co.edu.uniquindio.poo.Model;

public class Cliente extends Persona{
    private String numeroCuenta;
    private String pin;

    public Cliente(String nombre, String numeroId, String telefono, String direccion, String numeroCuenta, String pin){
        super(nombre, numeroId, telefono, direccion);
        this.numeroCuenta = numeroCuenta;
        this.pin = pin;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    
}
