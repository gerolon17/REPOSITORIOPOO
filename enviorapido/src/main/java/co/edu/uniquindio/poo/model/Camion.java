package co.edu.uniquindio.poo.model;

import java.util.List;

public class Camion extends Vehiculo{
    private double capacidadCarga;

    public Camion(String placa, String marca, String modelo, double capacidadCarga){
        super(placa, marca, modelo);
        this.capacidadCarga = capacidadCarga;
    }

    public double getCapacidadCarga() {
        return capacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        this.capacidadCarga = capacidadCarga;
    }

    @Override
    public double costoEnvio(List<Paquete> listaPaquetes, RutaEnvio ruta, ZonaEntrega zonaEntrega){
    
        double costoPeajes = ruta.getNumeroPeajes()*12000;
        double pesoPaquetes = 0;
        for(Paquete paquete: listaPaquetes){
            pesoPaquetes = paquete.getPeso() + pesoPaquetes;
        }

        double costoPesoPaquetes = pesoPaquetes*7000;

        double costoTotal = costoPeajes + costoPesoPaquetes;

        return costoTotal;
    }

   
}
