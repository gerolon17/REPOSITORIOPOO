/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Moto;
import co.edu.uniquindio.poo.model.Paquete;
import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.EnvioRapido;
import co.edu.uniquindio.poo.model.Furgoneta;
import co.edu.uniquindio.poo.model.RutaEnvio;
import co.edu.uniquindio.poo.model.Transmision;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.ZonaEntrega;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCalcularEnvioCostoCamion() {
        LOG.info("Iniciado test calcular envio costo camion");
        Vehiculo camion = new Camion("ABC-123", "Mazda", "WW", 6000);
        RutaEnvio ruta = new RutaEnvio(3, 1500);
        Envio envio = new Envio("123456", "2222", 0, ZonaEntrega.URBANA, LocalDate.of(2023, 11, 20));
        envio.agregarPaquete("12345", 16);
        envio.agregarPaquete("54368", 40);


        double costoEsperado = 428000;
        double costoMetodo = camion.costoEnvio(envio.getListaPaquetes(), ruta, envio.getZonaEntrega());
        
        assertTrue(costoEsperado == costoMetodo);
        LOG.info("Finalizando test calcular envio costo camion");
    }

    @Test
    public void calcularEnvioCostoMoto(){
        LOG.info("Iniciando Test moto calcular envio");

        Vehiculo moto = new Moto("RRR-222", "Susuki", "Ninja", "600");
        Envio envio = new Envio("120394", "34567", 0, ZonaEntrega.URBANA, LocalDate.of(2025, 6, 22));
        RutaEnvio ruta = new RutaEnvio(2, 200);
        envio.agregarPaquete("9393993", 2);
        envio.agregarPaquete("239499", 5);
        envio.agregarPaquete("029349", 1);
        
        double costoEsperado = 24000;
        double costoMetodo = moto.costoEnvio(envio.getListaPaquetes(), ruta, envio.getZonaEntrega());

        assertTrue(costoEsperado == costoMetodo);
        LOG.info("Finalizando test calcular envio costo moto");
    }

    @Test
    public void calcularEnvioCostoFurgoneta(){
        LOG.info("Iniciando de test furgoneta");

        Vehiculo furgoneta = new Furgoneta("ADF-366", "Volkswagen", "AE", Transmision.AUTOMATICA);
        Envio envio = new Envio("30948143", "1093490", 0, ZonaEntrega.RURAL, LocalDate.of(2025, 7, 22));
        RutaEnvio ruta = new RutaEnvio(5, 2000);
        envio.agregarPaquete("20943204", 20);
        envio.agregarPaquete("2984934", 5);
        envio.agregarPaquete("9494949", 8);
        envio.agregarPaquete("1029324", 11);

        double costoEsperado = 6010000;
        double costoMetodo = furgoneta.costoEnvio(envio.getListaPaquetes(), ruta, envio.getZonaEntrega());

        assertTrue(costoEsperado == costoMetodo);
        LOG.info("Finalizando test furgoneta");
    }

    @Test
    public void obtenerEnviosPesoMayor50(){
        EnvioRapido envioRapido = new EnvioRapido("Envio Rapido", "Cra 14#10N-63", "122446");
        Envio envio = new Envio("129322494", "1039409320", 0, ZonaEntrega.RURAL, LocalDate.of(2025, 5, 12));
        Envio envio1 = new Envio("12394328", "10394094332", 0, ZonaEntrega.URBANA, LocalDate.of(2026, 7, 11));
        Envio envio2 = new Envio("1293298324", "1039432432", 0, ZonaEntrega.RURAL, LocalDate.of(2025, 6, 4));
        envio.agregarPaquete("329024", 32);
        envio.agregarPaquete("39432402394", 28);

        envio1.agregarPaquete("32902324", 2);
        envio1.agregarPaquete("394302394", 28);
        envio2.agregarPaquete("329024", 32);
        envio2.agregarPaquete("39432402394", 18);

        envioRapido.agregarEnvio(envio.getCedulaCliente(), envio.getCodigo(), envio.getCostoTotal(), envio.getZonaEntrega(), envio.getFecha());
        envioRapido.agregarEnvio(envio1.getCedulaCliente(), envio1.getCodigo(), envio1.getCostoTotal(), envio1.getZonaEntrega(), envio1.getFecha());
        envioRapido.agregarEnvio(envio2.getCedulaCliente(), envio2.getCodigo(), envio2.getCostoTotal(), envio2.getZonaEntrega(), envio2.getFecha());

        List<Envio> listaTestResul = new ArrayList<>();
        listaTestResul.add(envio);
        listaTestResul.add(envio2);

        List<Envio> listaEnvioss = new ArrayList<>();
        for(Envio envioo: envioRapido.getListaEnvios()){
            double pesoContador = 0;
            for(Paquete paquete: envioo.getListaPaquetes()){
                pesoContador = pesoContador + paquete.getPeso();
            }
            if(pesoContador >= 50){
                listaEnvioss.add(envioo);
            }
                                
        }
        assertTrue(listaEnvioss == listaTestResul);

    }

}
