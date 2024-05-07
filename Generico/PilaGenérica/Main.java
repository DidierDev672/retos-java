package Generico.PilaGenérica;

// Paso 3: Prueba el funcionamiento de ArrayStack.

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new ArrayStack<>(); // Crea una pila para enteros.

        // Prueba operaciones básicas.
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println(stack.pop()); // Salida: 3
        System.out.println(stack.pop()); // Salida: 2
        System.out.println(stack.isEmpty()); // Salida: false
    }
}
