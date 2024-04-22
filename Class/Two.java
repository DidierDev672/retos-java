package Class;

//! Si 8 metros de tela cuestan $24, cuanto costaran 12 metros de tela?

public class Two {
    public static void main(String[] main) {
        double value1 = 8;
        double value2 = 12;
        double result1 = 24;

        double result2 = Calculate(value1, value2, result1);

        System.out.println("12 metros de tela tiene un valor: " + result2);
    }

    public static double Calculate(double value1, double value2, double result1) {
        return (result1 * value2) / value1;
    }
}
