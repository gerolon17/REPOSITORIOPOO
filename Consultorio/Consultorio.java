import java.util.ArrayList;
import java.util.List;

public class Consultorio {
    private String nombre;
    private String direccion;
    private String nit;
    private List<Odontologo> listaOdontologos;
    private List<Paciente> listaPacientes;

    public Consultorio(String nombre, String direccion, String nit, List<Odontologo> listaOdontologos) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.nit = nit;
        this.listaOdontologos = listaOdontologos;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Paciente> getListaPacientes() {
        return listaPacientes;
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

    public void setListaPacientes(List<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }

    public List<Odontologo> getListaOdontologos() {
        return listaOdontologos;
    }

    public void setListaOdontologos(List<Odontologo> listaOdontologos) {
        this.listaOdontologos = listaOdontologos;
    }

    public void imprimirOdontologos(){
        for(int i = 0; i < listaOdontologos.size(); i++){
            System.out.println(listaOdontologos.get(i).getNombre());
            System.out.println(listaOdontologos.get(i).getId());
            System.out.println(listaOdontologos.get(i).getNroLProfesional());
            System.out.println(listaOdontologos.get(i).getEspecialidad());
        }
    }

    public Odontologo registrarMedico(String iD, String nombre, String nroLProfesional, String especialidad){
        Odontologo odontologo = new Odontologo(iD, nombre, nroLProfesional, especialidad);

        return odontologo;
    }

    public List<Paciente> revisionGratis(){
        List<Paciente> listaP = new ArrayList<>();
        for(Paciente paciente: listaPacientes){
            if(paciente.getCantidadTratamientos() >= 5){
                listaP.add(paciente);
            } 

        }
        return listaP;
    }

}
