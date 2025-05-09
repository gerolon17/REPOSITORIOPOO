package co.edu.uniquindio.poo.AppP1;
import co.edu.uniquindio.poo.model.Circulo;
import co.edu.uniquindio.poo.model.Cuadrado;
import co.edu.uniquindio.poo.model.TrianguloEquilatero;
import co.edu.uniquindio.poo.model.Figura;

public class Main {
    public static void main(String[] args) {
      
        java.util.List<Figura> figuras = new java.util.ArrayList<>();
        figuras.add(new Circulo(5));
        figuras.add(new Cuadrado(7));
        figuras.add(new TrianguloEquilatero(6));

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getClass().getSimpleName());
            System.out.println("Área: " + String.format("%.2f", figura.calcularArea()));
            System.out.println("Perímetro: " + String.format("%.2f", figura.calcularPerimetro()));
            System.out.println("--------------------");
        }
    }
}