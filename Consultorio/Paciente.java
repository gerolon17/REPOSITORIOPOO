import java.time.LocalDate;

public class Paciente {
    private String nombre;
    private String nroHistoria;
    private int edad;
    private String telefono;
    private String direccion;
    private LocalDate fechaUltimaConsulta;
    private int cantidadTratamientos;

    public Paciente(String nombre, String nroHistoria, int edad, String telefono, String direccion, LocalDate fechaUltimaConsulta, int cantidadTratamientos){
        this.nombre = nombre;
        this.nroHistoria = nroHistoria;
        this.edad = edad;
        this.telefono = telefono;
        this.direccion = direccion;
        this.fechaUltimaConsulta = fechaUltimaConsulta;
        this.cantidadTratamientos = cantidadTratamientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNroHistoria() {
        return nroHistoria;
    }

    public void setNroHistoria(String nroHistoria) {
        this.nroHistoria = nroHistoria;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public LocalDate getFechaUltimaConsulta() {
        return fechaUltimaConsulta;
    }

    public void setFechaUltimaConsulta(LocalDate fechaUltimaConsulta) {
        this.fechaUltimaConsulta = fechaUltimaConsulta;
    }

    public int getCantidadTratamientos() {
        return cantidadTratamientos;
    }

    public void setCantidadTratamientos(int cantidadTratamientos) {
        this.cantidadTratamientos = cantidadTratamientos;
    }

    
}
