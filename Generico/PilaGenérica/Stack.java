package Generico.PilaGenérica;

// Paso 1: Crea la interfaz genérica para la pila.
public interface Stack<T> {
    void push(T item); // Añadir un elemento a la pila.

    T pop(); // Eliminar y devolver el elemento superior de la pila.

    boolean isEmpty(); // Verificar si la pila esta vacia.
}
