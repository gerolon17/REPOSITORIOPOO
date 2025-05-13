package co.edu.uniquindio.poo.Model;

public class CuentaEmpresarial extends CuentaBancaria{
    private String nombreEmpresa;
    private String nit;

    public CuentaEmpresarial(String idCliente, String numeroCuenta, double saldoCuenta, String nombreEmpresa, String nit){
        super(idCliente, numeroCuenta, saldoCuenta);
        this.nombreEmpresa = nombreEmpresa;
        this.nit = nit;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }
    

}
