package co.edu.uniquindio.poo.Model;
import java.time.LocalDate;

public class Transaccion {
    private LocalDate hora;
    private double monto;
    private String codigoTransaccion;
    private EstadoTransaccion estado;
    private String cuentaOrigen;
    private String cuentaDestino;

    public Transaccion(LocalDate hora, double monto, String codigoTransaccion, EstadoTransaccion estado,
        String cuentaOrigen, String cuentaDestino) {
        this.hora = hora;
        this.monto = monto;
        this.codigoTransaccion = codigoTransaccion;
        this.estado = estado;
        this.cuentaOrigen = cuentaOrigen;
        this.cuentaDestino = cuentaDestino;
    }

    public LocalDate getHora() {
        return hora;
    }

    public void setHora(LocalDate hora) {
        this.hora = hora;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getCodigoTransaccion() {
        return codigoTransaccion;
    }

    public void setCodigoTransaccion(String codigoTransaccion) {
        this.codigoTransaccion = codigoTransaccion;
    }

    public EstadoTransaccion getEstado() {
        return estado;
    }

    public void setEstado(EstadoTransaccion estado) {
        this.estado = estado;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public void retirarMonto(double monto) {
        this.monto -= monto;
        System.out.println("Se ha retirado " + monto + " de la cuenta " + cuentaOrigen);
    }

    public void depositarMonto(double monto) {
        this.monto += monto;
        System.out.println("Se ha depositado " + monto + " a la cuenta " + cuentaDestino);
    }

}
