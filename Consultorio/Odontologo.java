public class Odontologo{

    private String iD;
    private String nombre;
    private String nroLProfesional;
    private String especialidad;

    public Odontologo(String iD, String nombre, String nroLProfesional, String especialidad){
        this.iD = iD;
        this.nombre = nombre;
        this. nroLProfesional = nroLProfesional;
        this.especialidad = especialidad;
    }

    public String getId(){
        return iD;
    }

    public String getNombre(){
        return nombre;
    }

    public String getNroLProfesional(){
        return nroLProfesional;
    }
    
    public String getEspecialidad(){
        return especialidad;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNroLProfesional(String nroLProfesional) {
        this.nroLProfesional = nroLProfesional;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
}