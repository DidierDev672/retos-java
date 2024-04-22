//! Si 6 obreros pueden construir una casa en 12 días,
//! Cuantos tiempo tardaran 9 obreros en construir la misma casa?

public class Eight {
    public static void main(String[] args) {
        double labourer = 6;
        double workman = 9;
        double days = 12;

        double result = Result(labourer, workman, days);

        System.err.println("Los 9 obreros tardaran en construir la misma casa en: " + result);
    }

    public static double Result(double labourer, double workman, double days) {
        double result = (labourer * days) / workman;
        return result;
    }
}
