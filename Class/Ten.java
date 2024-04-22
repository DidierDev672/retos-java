//! Si 15kg de naranja cuesta $30
//! Cuanto costara 10kg de naranja?

public class Ten {
    public static void main(String[] args) {
        double oragen1 = 15;
        double oragen2 = 10;
        double value = 30;

        double result = Result(oragen1, oragen2, value);
        System.err.println("Los 10kg de naranja tiene un valor de: $" + result);
    }

    public static double Result(double orange1, double orange2, double value) {
        double result = (orange1 * orange2) / value;
        return result;
    }
}
