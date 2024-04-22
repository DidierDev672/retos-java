package Class;

//! Si 15 obreros pueden construir una pared en 5 días, ¿Cuantos días tardaran 25 obreros en construir las misma pared?

public class Five {
    public static void main(String[] args) {
        double value1 = 15;
        double value2 = 25;
        double result1 = 5;

        double result2 = Result(value1, value2, result1);

        System.out.println("Los obreros tardaran en construir la misma pared en: " + result2 + " en días.");
    }

    public static double Result(double value1, double value2, double result) {
        double result2 = (result * value1) / value2;

        return result2;
    }
}
