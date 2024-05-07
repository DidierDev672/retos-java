package Generico.Entity;

import java.util.Optional;

//? Implementación del repositorio genérico.
public class GenericRepositoryImpl<T> implements GenericRepository<T> {
    // Método para crear una nueva entidad.
    @Override
    public Optional<T> create() {
        try {
            // Creación de la entidad.
            @SuppressWarnings("unchecked")
            T newEntity = (T) new GenericEntity(); // El cast puede ser necesario.
            return Optional.of(newEntity); // Devuelve un Optional con la entidad.
        } catch (Exception e) {
            // Manejo de errores, retorno de un Optional vació.
            return Optional.empty();
        }
    }

}
