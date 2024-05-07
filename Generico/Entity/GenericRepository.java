package Generico.Entity;

import java.util.Optional;

//? Interfaz genérica para un repositorio con métodos CRUD.
public interface GenericRepository<T> {
    Optional<T> create(); // Intentar crear una nueva entidad.
}
