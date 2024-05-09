package Polimorfismo.Geometria;

//? // Subclase que representa un triángulo equilátero
public class TrianguloEquilatero extends FormaGeometrica {
    private double lado;

    public TrianguloEquilatero(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        // TODO Auto-generated method stub
        return (Math.sqrt(3) / 4) * lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        // TODO Auto-generated method stub
        return 3 * lado;
    }

}
