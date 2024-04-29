package Herencia.Three;

/*
 * Crea una superclase FiguraGeometrica con una propiedad nombre y un método abstracto 
 * calcularArea. Luego, crea subclases como Cuadrado y Circulo que implementen el 
 * cálculo del área.
 */

abstract class FiguraGeometrica {
    String nombre;

    // Método abstracto para calcular el área
    abstract double calcularArea();

    void mostrarInformacion() {
        System.err.println("Figura: " + nombre + ", Area: " + calcularArea());
    }
}

class Cuadrado extends FiguraGeometrica {
    double lado;

    Cuadrado(double lado) {
        this.lado = lado;
        this.nombre = "Cuadrado";
    }

    @Override
    double calcularArea() {
        return (lado * lado);
    }
}

class Circulo extends FiguraGeometrica {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
        this.nombre = "Circulo";
    }

    @Override
    double calcularArea() {
        return (Math.PI * radio * radio);
    }

}

public class Three {
    public static void main(String[] args) {
        Cuadrado cuadrado = new Cuadrado(4);
        Circulo circulo = new Circulo(3);

        cuadrado.mostrarInformacion();
        circulo.mostrarInformacion();
    }
}
