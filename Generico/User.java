package Generico;

import java.util.UUID;

// Clase de usuario que se utilizará en el repositorio.
public class User {
    private UUID id;
    private String name;

    public User(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
