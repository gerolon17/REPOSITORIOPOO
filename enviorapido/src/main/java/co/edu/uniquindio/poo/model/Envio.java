
package co.edu.uniquindio.poo.model;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Envio {
    private String cedulaCliente;
    private String codigo;
    private double costoTotal;
    private ZonaEntrega zonaEntrega;
    private LocalDate fecha;
    private List<Paquete> listaPaquetes = new ArrayList<>();


    public Envio(String cedulaCliente, String codigo, double costoTotal, ZonaEntrega zonaEntrega, LocalDate fecha){
        this.cedulaCliente = cedulaCliente;
        this.codigo = codigo;
        this.costoTotal = costoTotal;
        this.zonaEntrega = zonaEntrega;
        this.fecha = fecha;
      
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public ZonaEntrega getZonaEntrega() {
        return zonaEntrega;
    }

    public void setZonaEntrega(ZonaEntrega zonaEntrega) {
        this.zonaEntrega = zonaEntrega;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public List<Paquete> getListaPaquetes() {
        return listaPaquetes;
    }

    public void setListaPaquetes(List<Paquete> listaPaquetes) {
        this.listaPaquetes = listaPaquetes;
    }

    public void agregarPaquete(String codigo, double peso){
        Paquete paquete = new Paquete(codigo, peso);

        listaPaquetes.add(paquete);
    }
}
