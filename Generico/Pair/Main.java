package Generico.Pair;

//? Uso de la clase genérica Pair.
public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<String, Integer>("Hello", 123);
        System.out.println("First " + pair.getFirst()); // ? Output: Hello
        System.out.println("Second: " + pair.getSecond()); // ? Output: 123
    }
}
