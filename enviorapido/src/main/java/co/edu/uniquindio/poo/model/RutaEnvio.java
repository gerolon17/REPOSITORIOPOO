package co.edu.uniquindio.poo.model;

public class RutaEnvio {
    private int numeroPeajes;
    private double distancia;

    public RutaEnvio(int numeroPeajes, double distancia){
        this.numeroPeajes = numeroPeajes;
        this.distancia = distancia;
    }

    public int getNumeroPeajes() {
        return numeroPeajes;
    }

    public void setNumeroPeajes(int numeroPeajes) {
        this.numeroPeajes = numeroPeajes;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    
}
