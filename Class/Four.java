package Class;

//! Si 10 estudiantes pueden limpiar un aula en 2 horas, Cuantas horas tardaran 5 estudiantes en hacerlo?

public class Four {
    public static void main(String[] args) {
        double value1 = 2;
        double value2 = 10;
        double result1 = 5;

        double result2 = calculate(value1, value2, result1);
        System.out.println("Los 5 estudiantes tardaran: " + result2 + "  horas.");
    }

    public static double calculate(double value1, double value2, double result1) {
        return (value1 * value2) / result1;
    }
}
