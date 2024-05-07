package Generico.Util;

//? Uso del método genérico para encontrar el máximo.
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 15, 5, 25, 20);
        Integer max = GenericUtils.findMax(numbers);
        System.out.println("Maximum value: " + max); // ? Output: 25
    }
}
