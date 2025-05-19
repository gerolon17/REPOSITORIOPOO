package co.edu.uniquindio.poo.Model;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nombre;
    private String direccion;
    private String nit;
    private List<CuentaBancaria> cuentasBancarias;
    private List<Persona> empleados;
    private List<Persona> clientes;

    public Banco(String nombre, String direccion, String nit, List<CuentaBancaria> cuentasBancarias, List<Persona> empleados, List<Persona> clientes){
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.cuentasBancarias = cuentasBancarias;
        this.empleados = empleados;
        this.clientes = clientes;
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

    public List<CuentaBancaria> getCuentasBancarias() {
        return cuentasBancarias;
    }

    public void setCuentasBancarias(List<CuentaBancaria> cuentasBancarias) {
        this.cuentasBancarias = cuentasBancarias;
    }

    public List<Persona> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Persona> empleados) {
        this.empleados = empleados;
    }

    public List<Persona> getClientes() {
        return clientes;
    }

    public void setClientes(List<Persona> clientes) {
        this.clientes = clientes;
    }

    public void deporitarDinero(String numeroCuentaDestino, String numeroCuentaOrigen, double monto){
        for(CuentaBancaria cuentaOrigen: cuentasBancarias){
            if(cuentaOrigen.getNumeroCuenta().equals(numeroCuentaOrigen)){

                if(cuentaOrigen.getSaldoCuenta() >= monto){

                    for (CuentaBancaria cuenta : cuentasBancarias) {

                        if (cuenta.getNumeroCuenta().equals(numeroCuentaDestino)) {

                            cuenta.setSaldoCuenta(cuenta.getSaldoCuenta() + monto);

            }
        }
                    cuentaOrigen.setSaldoCuenta(cuentaOrigen.getSaldoCuenta() - monto);
                    System.out.println("Se ha depositado " + monto + " a la cuenta " + numeroCuentaDestino);
                } else {
                    System.out.println("No hay suficiente saldo en la cuenta de origen");
                }
                break;
            }
        }
    }

    
}
