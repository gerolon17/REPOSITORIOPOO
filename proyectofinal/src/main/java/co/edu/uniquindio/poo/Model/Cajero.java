package co.edu.uniquindio.poo.Model;

public class Cajero extends Persona{
    private String id;
    private double salario;
    
    public Cajero(String nombre, String numeroId, String telefono, String direccion, String id, double salario){
        super(nombre, numeroId, telefono, direccion);
        this.id = id;
        this.salario = salario;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    
    
}
