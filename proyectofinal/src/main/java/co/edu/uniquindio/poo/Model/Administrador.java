package co.edu.uniquindio.poo.Model;
import java.util.List;

public class Administrador extends Persona{
    private double salario;
    private String pin;
    
    public Administrador(String nombre, String numeroId, String telefono, String direccion, double salario, String pin){
        super(nombre, numeroId, telefono, direccion);
        this.salario = salario;
        this.pin = pin;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void registrarEmpleado(String nombre, String numeroId, String telefono, String direccion, String id, double salario, List<Persona> listadoEmpleados) {
     
        Cajero cajero = new Cajero(nombre, numeroId, telefono, direccion, id, salario);
        listadoEmpleados.add(cajero);

        System.out.println("Empleado registrado exitosamente.");
    }

    public void eliminarEmpleado(String numeroId, List<Persona> listadoEmpleados) {
        for (int i = 0; i < listadoEmpleados.size(); i++) {
            if (listadoEmpleados.get(i).getNumeroId().equals(numeroId)) {
                listadoEmpleados.remove(i);
                System.out.println("Empleado eliminado exitosamente.");
                return;
            }
        }
        System.out.println("Empleado no encontrado.");
    }

    public void monitorearTransacciones(List<Transaccion> transacciones, String codigoTransaccion) {
        for (Transaccion transaccion : transacciones) {
            if(transaccion.getCodigoTransaccion().equals(codigoTransaccion)) {
                System.out.println("Transacción encontrada:");
                System.out.println("Hora: " + transaccion.getHora());
        }else{
            System.out.println("Transacción no encontrada.");
            }
        }
    }

    public void generarReporteDeTransaccion(List<Transaccion> transacciones, String codigoTransaccion) {

        for (Transaccion transaccion : transacciones) {
            if(transaccion.getCodigoTransaccion().equals(codigoTransaccion)) {
                System.out.println("Transacción encontrada:");
                System.out.println("Hora: " + transaccion.getHora());
                System.out.println("Monto: " + transaccion.getMonto());
                System.out.println("Código de Transacción: " + transaccion.getCodigoTransaccion());
                System.out.println("Estado: " + transaccion.getEstado());
                System.out.println("Cuenta Origen: " + transaccion.getCuentaOrigen());
        }else{
            System.out.println("Transacción no encontrada.");
            }
        }
    }
}
