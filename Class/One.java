package Class;

public class One {
    // ! Si 5 litros de agua pesan 5kg, Cuantos pesaran 7 litros de agua?
    public static void main(String[] args) {
        double value1 = 1;
        double value2 = 7;
        double result = 1;

        double result2 = calculate(value1, value2, result);

        System.out.println("7 Litros pesan: " + result2);
    }

    public static double calculate(double value1, double value2, double result1) {
        return (result1 * value2) / value1;
    }
}
