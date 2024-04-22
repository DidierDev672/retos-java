package Class;

//! Si 3 trabajadores tardan 4 días en construir una casa, 
//! ¿Cuantos trabajadores se necesitan para construir la misma casa en 2 días?

public class Six {
    public static void main(String[] args) {
        int worker = 3;
        int day = 4;
        int daytime = 2;

        int result = (worker * day) / daytime;
        System.err.println("Los trabajadores que necesitan para construir la casa en dos días: " + result);
    }

    public static int Result(int worker, int day, int daytime) {
        int result = (worker * day) / daytime;
        return result;
    }
}
