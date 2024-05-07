package Generico.PilaGenérica;

// Paso 2: Implementa una clase que utilice un array interno para almacenar elementos.
import java.util.ArrayList;
import java.util.List;

public class ArrayStack<T> implements Stack<T> {
    private final List<T> items = new ArrayList<>(); // Almacén interno.

    @Override
    public boolean isEmpty() {
        return items.isEmpty(); // Verificar si la pila está vacía.
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("The stack is empty");
        }
        return items.remove(items.size() - 1); // Eliminar y devolver el último elemento.
    }

    @Override
    public void push(T item) {
        items.add(item); // Añadir elemento a la pila.

    }

}
