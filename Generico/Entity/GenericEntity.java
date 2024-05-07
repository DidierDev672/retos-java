package Generico.Entity;

import java.util.UUID;

//? Clase genérica para la entidad
class GenericEntity {
    private UUID id;

    public GenericEntity() {
        this.id = UUID.randomUUID(); // Generar un UUID aleatorio para la cantidad.
    }

    public UUID getId() {
        return id;
    }

}