package co.edu.uniquindio.poo.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EnvioRapido {
    private String nombre;
    private String direccion;
    private String nit;
    private List<Cliente> listaClientes = new ArrayList<>();
    private List<Vehiculo> listaVehiculos = new ArrayList<>();
    private List<Envio> listaEnvios = new ArrayList<>();

    public EnvioRapido(String nombre, String direccion, String nit){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public List<Cliente> getListaClientes() {
        return listaClientes;
    }

    public void setListaClientes(List<Cliente> listaClientes) {
        this.listaClientes = listaClientes;
    }

    public List<Vehiculo> getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    

    public void agregarCliente(String nombre, String cedula, String correo, String direccion){
        Cliente cliente = new Cliente(nombre, cedula, correo, direccion);

        listaClientes.add(cliente);
    }

    

    public void agregarEnvio(String cedulaCliente, String codigo, double costoTotal, ZonaEntrega zonaEntrega, LocalDate fecha){
        Envio envio = new Envio(cedulaCliente, codigo, costoTotal, zonaEntrega, fecha);

        listaEnvios.add(envio);
    }

    public List<Envio> getListaEnvios() {
        return listaEnvios;
    }

    public void setListaEnvios(List<Envio> listaEnvios) {
        this.listaEnvios = listaEnvios;
    }
    
}
