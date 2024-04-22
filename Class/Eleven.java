package Class;

//! Si una fabrica produce 300 unidades de un producto en 8 horas,
//! Cuantas horas tardaran en producir 450 unidades del mismo producto?

public class Eleven {
    public static void main(String[] args) {
        int unity = 300;
        int units = 450;
        int hours = 8;

        int result = Result(unity, units, hours);
        System.err.println("El numero de horas que tardaran la fabrica en producir 450 unidades es: " + result);
    }

    public static int Result(int unity, int units, int hours) {
        int result = (units * hours) / unity;
        return result;
    }
}
