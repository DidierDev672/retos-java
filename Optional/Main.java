package Optional;

import java.util.Optional;

public class Main {
    /**
     * Divide dos números y devuelve un Optional con el resultado.
     * Si el divisor es cero, devuelve un Optional vació para evitar errores de
     * divisiones por cero.
     * 
     * @param dividend El dividendo
     * @param divisor  El divisor.
     * @return Un optional con el resultado de la division o un Optional vació si el
     */

    public static Optional<Double> divide(double dividend, double divisor) {
        if (divisor == 0) {
            return Optional.empty(); // ? No se puede dividir por cero, devuelve un Optional vacío.
        } else {
            return Optional.of(dividend / divisor); // ? Devuelve el resultado como un Optional.
        }
    }

    public static void main(String[] args) {
        Optional<Double> result1 = divide(10, 2); // ? Resultado esperado: 5.0
        Optional<Double> result2 = divide(10, 0); // ? Resultado esperado: Optional vacío

        // ? Usa isPresent() para verificar si el resultado está presente
        if (result1.isPresent()) {
            System.out.println("El resultado de 10 dividido por es: " + result1.get());
        } else {
            System.out.println("No se puede dividir por cero");
        }
        // ? Usa ifPresent() para realizar una acción si el resultado está presente
        result2.ifPresent(value -> System.out.println("El resultado es: " + value));

        // ? Usa orElse() para proporcionar un valor por defecto si el Optional está
        // vacío
        double safeResult = result2.orElse(Double.NaN); // ? NaN (Not a Number) se usa cuando no hay resultado
        System.out.println("Resultado seguro de la division: " + safeResult);
    }
}
