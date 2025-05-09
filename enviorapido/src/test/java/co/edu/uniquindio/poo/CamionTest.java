/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.sql.Date;
import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

import co.edu.uniquindio.poo.model.Camion;
import co.edu.uniquindio.poo.model.Envio;
import co.edu.uniquindio.poo.model.RutaEnvio;
import co.edu.uniquindio.poo.model.Vehiculo;
import co.edu.uniquindio.poo.model.ZonaEntrega;

/**
 * Unit test for simple App.
 */
public class CamionTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCalcularEnvioCostoCamion() {
        LOG.info("Iniciado test calcular envio costo camion");
        Vehiculo camion = new Camion("ABC-123", "Mazda", "WW", 6000);
        RutaEnvio ruta = new RutaEnvio(3, 1500);
        Envio envio = new Envio("123456", "2222", 0, ZonaEntrega.URBANA, LocalDate.of(5, 5, 2025));
        envio.agregarPaquete("12345", 16);
        envio.agregarPaquete("54368", 40);


        double costoEsperado = 428000;
        double costoMetodo = camion.costoEnvio(envio.getListaPaquetes(), ruta, envio.getZonaEntrega());
        
        assertTrue(costoEsperado == costoMetodo);
        LOG.info("Finalizando test calcular envio costo camion");
    }
}
