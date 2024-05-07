package Optional.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main {
    /*
     * Filtrar lista de números y obtener el primero
     * En este ejercicio, trabajarás con una lista de números enteros y filtrarás
     * para obtener el primer número
     * que es mayor que un valor específico.
     * 
     * @@ Requerimientos
     * Crea una lista de números enteros.
     * Filtra la lista para encontrar el primer número mayor que 10.
     * Si encuentras un número, devuelve un mensaje que indique el número
     * encontrado.
     * Si no, devuelve un mensaje que indique que no se encontró ningún número.
     */

    public Optional<Integer> findFirstGreaterThan(List<Integer> numbers, int threshold) {
        return numbers.stream()
                .filter(n -> n > threshold)
                .findFirst();
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(8);
        numbers.add(15);
        numbers.add(22);
        numbers.add(7);

        Main finder = new Main();
        Optional<Integer> result = finder.findFirstGreaterThan(numbers, 10);

        if (result.isPresent()) {
            System.out.println("First number greater than 10: " + result.get());
        } else {
            System.out.println("No numbers greater than 10 were found.");
        }
    }

}
