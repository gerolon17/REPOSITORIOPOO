package co.edu.uniquindio.poo.Model;

public class Persona {
    private String nombre;
    private String numeroId;
    private String telefono;
    private String direccion;

    Persona(String nombre, String numeroId, String telefono, String direccion){
        this.nombre = nombre;
        this.numeroId = numeroId;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroId() {
        return numeroId;
    }

    public void setNumeroId(String numeroId) {
        this.numeroId = numeroId;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    
}
