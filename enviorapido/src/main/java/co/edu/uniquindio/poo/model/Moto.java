package co.edu.uniquindio.poo.model;

import java.util.List;

public class Moto extends Vehiculo{
    private String cilindrada;

    public Moto(String placa, String marca, String modelo, String cilindrada){
        super(placa, marca, modelo);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double costoEnvio(List<Paquete> listaPaquetes, RutaEnvio ruta, ZonaEntrega zonaEntrega){
        double valorEnvio = 0;
        if(zonaEntrega == ZonaEntrega.RURAL){
            valorEnvio = 15000;
        }else{
            valorEnvio = 8000;
        }
        double valorFinal = valorEnvio*listaPaquetes.size();

        return valorFinal;
    }
    
}
