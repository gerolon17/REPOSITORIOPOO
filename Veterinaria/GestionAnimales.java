package Veterinaria;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionAnimales {
    private String nombre;
    private String especie;
    private String raza;
    private byte edad;
    private String genero;

public void SetNombre(String nombre){
    this.nombre = nombre;
}

public void SetEspecie(String especie){
    this.especie = especie;
}

public void SetRaza(String raza){
    this.raza = raza;
}

public void SetEdad(byte edad){
    this.edad = edad;
}

public void SetGenero(String genero){
    this.genero = genero;
}

public String getNombre(){
    return nombre;
}

public String getEspecie(){
    return especie;
}

public String getRaza(){
    return raza;
}

public byte getEdad(){
    return edad;
}

public String getGenero(){
    return genero;
}


public GestionAnimales(String nombre, String especie, String raza, byte edad, String genero){
    this.nombre = nombre;
    this.especie = especie;
    this.raza = raza;
    this.edad = edad;
    this.genero = genero;
}

public void anadirMascota(List <GestionAnimales> lista){
    Scanner sc = new Scanner(System.in);
    System.out.println("Cuantas mascotas deseas agregar?");
    int nroMascotas = sc.nextInt();
    int contador = 0;
    while(contador!=nroMascotas){
        System.out.println("Que nombre tiene la mascota " + contador + "?");
        String nombreM = sc.next();
        System.out.println("Que especie es la mascota " + contador + "?");
        String especieM = sc.next();
        System.out.println("Que raza es la mascota " + contador + "?");
        String razaM = sc.next();
        System.out.println("Que edad tiene la mascota " + contador + "?");
        byte edadM = sc.nextByte();
        System.out.println("Que genero tiene la mascota " + contador + "?");
        String generoM = sc.next();
        GestionAnimales mascotaA = new GestionAnimales(nombreM, especieM, razaM, edadM, generoM);
        lista.add(mascotaA);
        contador = contador+1;
    }
}

public void imprimirMascotas(List <GestionAnimales> lista){
    int contador = 0;
    while(contador != lista.size()){
        System.out.println(lista.get(contador).getNombre());
        System.out.println(lista.get(contador).getEspecie());
        System.out.println(lista.get(contador).getRaza());
        System.out.println(lista.get(contador).getEdad());
        System.out.println(lista.get(contador).getGenero());
        contador = contador+1;
    }
}

public static void main(String[] args){
    List <GestionAnimales> lista = new ArrayList<GestionAnimales>();

    GestionAnimales gest = new GestionAnimales("null", "null", "null", (byte)0, "null");

    gest.anadirMascota(lista);
    gest.imprimirMascotas(lista);
}
//En la clase main va todo relacionado con el usuario.
//En el paquete model, ninguna clase va a tener cosas del usuario.

}
