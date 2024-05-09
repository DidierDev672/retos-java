package Polimorfismo.Geometria;

// ? Subclase que representa un cuadrado
public class Cuadrado extends FormaGeometrica {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 4 * lado;
    }
}
