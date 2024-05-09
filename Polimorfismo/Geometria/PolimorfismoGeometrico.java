package Polimorfismo.Geometria;

// Clase principal para probar el polimorfismo
public class PolimorfismoGeometrico {
    public static void main(String[] args) {
        // Creamos una lista de formas geométricas
        FormaGeometrica[] formas = {
                new Circulo(5),
                new Cuadrado(4),
                new TrianguloEquilatero(3)
        };

        // Iteramos sobre las formas y mostramos sus áreas y perímetros
        for (FormaGeometrica forma : formas) {
            System.out.println("Forma: " + forma.getClass().getSimpleName());
            System.out.println("Area: " + forma.calcularArea());
            System.out.println("Perímetros: " + forma.calcularPerimetro());
            System.out.println("--------------------------------------------------");
        }
    }
}
