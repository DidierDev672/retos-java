package Generico.Entity;

import java.util.Optional;

//?  Uso del repositorio genérico para crear una entidad.
public class Main {

    public static void main(String[] args) {
        GenericRepository<GenericEntity> repository = new GenericRepositoryImpl<>();
        Optional<GenericEntity> entityOptional = repository.create();

        // Verificar si la creación fue exitosa y obtener la entidad.
        if (entityOptional.isPresent()) {
            System.out.println("Entidad creada con ID: " + entityOptional.get().getId());
        } else {
            System.out.println("Error al crear la entidad");
        }
    }
}
