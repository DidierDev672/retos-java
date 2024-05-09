package Polimorfismo;

public class Calculadora {

    public static void main(String[] args) {
        int Resultsumar = sumar(12, 34);
        double SumaDecimal = equal(12.5, 34.5);

        System.out.println("Resultado de la suma: " + Resultsumar);
        System.out.println("Resultado de la suma de decimales: " + SumaDecimal);
    }

    public static int sumar(int a, int b) {
        return a + b;
    }

    public static double equal(double a, double b) {
        return a + b;
    }
}
