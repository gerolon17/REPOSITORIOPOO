package co.edu.uniquindio.poo.model;

import java.util.List;

public class Furgoneta extends Vehiculo{
    private Transmision transmision;

    public Furgoneta(String placa, String marca, String modelo, Transmision transmision){
        super(placa, marca, modelo);
        this.transmision = transmision;
    }

    public Transmision getTransmision() {
        return transmision;
    }

    public void setTransmision(Transmision transmision) {
        this.transmision = transmision;
    }

    @Override
    public double costoEnvio(List<Paquete> listaPaquetes, RutaEnvio ruta, ZonaEntrega zonaEntrega){
        double costo = (ruta.getDistancia()*3000) + 10000;

        return costo;
    }
}
