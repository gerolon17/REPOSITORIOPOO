package co.edu.uniquindio.poo.Model;

public class Administrador extends Persona{
    private double salario;
    private String pin;
    
    public Administrador(String nombre, String numeroId, String telefono, String direccion, double salario, String pin){
        super(nombre, numeroId, telefono, direccion);
        this.salario = salario;
        this.pin = pin;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    
}
