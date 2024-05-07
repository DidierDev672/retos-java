package Generico;

import java.util.Optional;

public interface Repository<T, ID> {
    void add(T item); //? Agregar un elemento al repositorio.

    Optional<T> getById(ID id); //? Obtiene un elemento por su ID.

    void remove(ID id); //? Elimina un elemento por su ID.
}
