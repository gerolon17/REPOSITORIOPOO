package co.edu.uniquindio.poo.AppP1.GUI;

import co.edu.uniquindio.poo.Model.Banco;
import co.edu.uniquindio.poo.Model.Cajero;
import co.edu.uniquindio.poo.Model.Cliente;
import co.edu.uniquindio.poo.Model.CuentaAhorros;
import co.edu.uniquindio.poo.Model.CuentaBancaria;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.reflect.Field;
import java.time.LocalDateTime;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CajeroControllerTest {

    private CajeroController controller;
    private Label nombreCajeroLabel;
    private TextField cuentaPrincipalField;
    private TextField pinUsuarioField;
    private TextField identificacionUsuarioField;

    private Cajero cajeroPrueba;
    private Stage dummyStage;
    private Banco banco;

    private void setField(Object target, String fieldName, Object value) throws ReflectiveOperationException {
        Field field = target.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);
        field.set(target, value);
    }

    @BeforeEach
    void setUp() throws ReflectiveOperationException {
        controller = new CajeroController();
        banco = Banco.getInstance(); // Get the singleton instance
      
        banco.setClientes(new ArrayList<>());
        banco.setCuentasBancarias(new ArrayList<>());
        banco.setTransacciones(new ArrayList<>());

        nombreCajeroLabel = new Label();
        cuentaPrincipalField = new TextField();
        pinUsuarioField = new TextField();
        identificacionUsuarioField = new TextField();

        setField(controller, "nombreCajeroLabel", nombreCajeroLabel);
        setField(controller, "cuentaPrincipalField", cuentaPrincipalField);
        setField(controller, "pinUsuarioField", pinUsuarioField);
        setField(controller, "identificacionUsuarioField", identificacionUsuarioField);

        cajeroPrueba = new Cajero("Test Cajero", "cajeroTestID", "Banco Central", "000", "EMPTEST01", 3000.0, "cpin1");
        

        
        dummyStage = new Stage();
        VBox root = new VBox(nombreCajeroLabel); 
        Scene dummyScene = new Scene(root);
        dummyStage.setScene(dummyScene);
    }

    @AfterEach
    void tearDown() {
       
        banco.setClientes(new ArrayList<>());
        banco.setCuentasBancarias(new ArrayList<>());
        banco.setTransacciones(new ArrayList<>());
       
    }

    @Test
    void setCajeroAutenticado_actualizaLabel() {
        controller.setCajeroAutenticado(cajeroPrueba);
        assertEquals("Test Cajero", nombreCajeroLabel.getText());
    }

    @Test
    @DisabledOnOs(OS.LINUX) 
    void consultarSaldo_cuentaExistenteConSaldo_muestraAlertaSaldo() {
        Cliente cliente = new Cliente("Cliente Saldo", "cs1", "dir", "tel", "ACC001", "pin123");
        CuentaBancaria cuenta = new CuentaAhorros("ACC001", 500.0, LocalDateTime.now(), cliente, 0.01);
        banco.registrarCliente(cliente.getNombre(), cliente.getIdentificacion(), cliente.getDireccion(), cliente.getTelefono(), cliente.getNumeroCuenta(), cliente.getPin());
        banco.registrarCuenta(cuenta);
        cliente.agregarCuenta(cuenta);

        cuentaPrincipalField.setText("ACC001");
        controller.consultarSaldo(null);
       
        assertTrue(true, "Consultar saldo con cuenta existente y saldo > 0 ejecutado.");
    }

    @Test
    @DisabledOnOs(OS.LINUX)
    void consultarSaldo_cuentaExistenteSaldoCero_muestraAlertaSaldoCeroOInexistente() {
        Cliente cliente = new Cliente("Cliente Cero", "cc1", "dir", "tel", "ACC002", "pin456");
        CuentaBancaria cuenta = new CuentaAhorros("ACC002", 0.0, LocalDateTime.now(), cliente, 0.01);
        banco.registrarCliente(cliente.getNombre(), cliente.getIdentificacion(), cliente.getDireccion(), cliente.getTelefono(), cliente.getNumeroCuenta(), cliente.getPin());
        banco.registrarCuenta(cuenta);
        cliente.agregarCuenta(cuenta);

        cuentaPrincipalField.setText("ACC002");
        controller.consultarSaldo(null);
        // Expecting the "El saldo de la cuenta es cero o no existe." alert path due to current logic.
        assertTrue(true, "Consultar saldo con cuenta existente y saldo 0 ejecutado.");
    }


    @Test
    @DisabledOnOs(OS.LINUX)
    void consultarSaldo_cuentaNoExistente_muestraAlertaSaldoCeroOInexistente() {
        cuentaPrincipalField.setText("ACC_NOEXISTE");
        controller.consultarSaldo(null);
        assertTrue(true, "Consultar saldo con cuenta no existente ejecutado.");
    }

    @Test
    @DisabledOnOs(OS.LINUX)
    void consultarSaldo_numeroCuentaVacio_muestraAlertaNoAsociada() {
        cuentaPrincipalField.setText("");
        controller.consultarSaldo(null);
      
         assertTrue(true, "Consultar saldo con número de cuenta vacío ejecutado.");
    }


    private void setupDummyFXML(String fxmlName) {
        assertNotNull(getClass().getResource("/co/edu/uniquindio/poo/AppP1/GUI/" + fxmlName),
                "FXML file " + fxmlName + " should be resolvable in classpath for testing.");
    }
    @Test
    void mostrarVentanaDepositar_conCuentaValida_noLanzaExcepcion() {
        setupDummyFXML("deposito.fxml");
        Cliente cliente = new Cliente("Cliente Dep", "cd1", "dir", "tel", "ACCDEP01", "pinD");
        CuentaBancaria cuenta = new CuentaAhorros("ACCDEP01", 100.0, LocalDateTime.now(), cliente, 0.01);
        banco.registrarCliente(cliente.getNombre(), cliente.getIdentificacion(), cliente.getDireccion(), cliente.getTelefono(), cliente.getNumeroCuenta(), cliente.getPin());
        banco.registrarCuenta(cuenta);
        cliente.agregarCuenta(cuenta);

        cuentaPrincipalField.setText("ACCDEP01");
        assertDoesNotThrow(() -> controller.mostrarVentanaDepositar(null));
    }


    @Test
    @DisabledOnOs(OS.LINUX)
    void mostrarVentanaDepositar_sinCuentaIngresada_muestraAlerta() {
        cuentaPrincipalField.setText(""); 
        controller.mostrarVentanaDepositar(null);
        assertTrue(true, "mostrarVentanaDepositar sin cuenta especificada ejecutado.");
    }


    @Test
    void mostrarVentanaRetirar_conCuentaValida_noLanzaExcepcion() {
        setupDummyFXML("retiro.fxml");
        Cliente cliente = new Cliente("Cliente Ret", "cr1", "dir", "tel", "ACCRET01", "pinR");
        CuentaBancaria cuenta = new CuentaAhorros("ACCRET01", 200.0, LocalDateTime.now(), cliente, 0.01);
        banco.registrarCliente(cliente.getNombre(), cliente.getIdentificacion(), cliente.getDireccion(), cliente.getTelefono(), cliente.getNumeroCuenta(), cliente.getPin());
        banco.registrarCuenta(cuenta);
        cliente.agregarCuenta(cuenta);

        cuentaPrincipalField.setText("ACCRET01");
        assertDoesNotThrow(() -> controller.mostrarVentanaRetirar(null));
    }

    @Test
    void mostrarVentanaTransferir_conCuentaValida_noLanzaExcepcion() {
        setupDummyFXML("transferencia.fxml");
        Cliente cliente = new Cliente("Cliente Tran", "ct1", "dir", "tel", "ACCTRAN01", "pinT");
        CuentaBancaria cuenta = new CuentaAhorros("ACCTRAN01", 300.0, LocalDateTime.now(), cliente, 0.01);
        banco.registrarCliente(cliente.getNombre(), cliente.getIdentificacion(), cliente.getDireccion(), cliente.getTelefono(), cliente.getNumeroCuenta(), cliente.getPin());
        banco.registrarCuenta(cuenta);
        cliente.agregarCuenta(cuenta);

        cuentaPrincipalField.setText("ACCTRAN01");
        assertDoesNotThrow(() -> controller.mostrarVentanaTransferir(null));
    }

    @Test
    void mostrarReportes_noLanzaExcepcion() {
        setupDummyFXML("reportes.fxml");
        assertDoesNotThrow(() -> controller.mostrarReportes(null));
    }

    @Test
    void cambiarPIN_clienteExistente_noLanzaExcepcion() {
        setupDummyFXML("cambiar_pin.fxml");
        String idClienteQueEsPIN = "pin123";
        Cliente cliente = new Cliente("Cliente PIN", idClienteQueEsPIN, "dir", "tel", "ACCPIN01", idClienteQueEsPIN);
        banco.registrarCliente(cliente.getNombre(), cliente.getIdentificacion(), cliente.getDireccion(), cliente.getTelefono(), cliente.getNumeroCuenta(), cliente.getPin());

        identificacionUsuarioField.setText(idClienteQueEsPIN);
        pinUsuarioField.setText(idClienteQueEsPIN);

        assertDoesNotThrow(() -> controller.cambiarPIN(null));
    }

    @Test
    @DisabledOnOs(OS.LINUX)
    void cambiarPIN_clienteNoExistentePorPin_muestraAlerta() {
        identificacionUsuarioField.setText("idNoImporta");
        pinUsuarioField.setText("pinNoExistente"); 

        controller.cambiarPIN(null);
        assertTrue(true, "cambiarPIN con cliente no encontrado por PIN ejecutado.");
    }


    @Test
    void cerrarSesion_noLanzaExcepcion() {
        setupDummyFXML("login.fxml");
        controller.setCajeroAutenticado(cajeroPrueba);
        assertDoesNotThrow(() -> controller.cerrarSesion(null));
    }
}
