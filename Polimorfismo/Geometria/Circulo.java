package Polimorfismo.Geometria;

//? Subclase que representa un círculo

public class Circulo extends FormaGeometrica {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

}
