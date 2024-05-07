package Generico;

import java.util.Optional;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        Repository<User, UUID> userRepository = new UserRepository();

        UUID userId = UUID.randomUUID();
        User user = new User(userId, "John Doe");

        // Agregar un usuario.
        userRepository.add(user);

        // Obtener usuario por ID.
        Optional<User> retrieveduser = userRepository.getById(userId);
        System.out.println(
                "User retrieved: " + (retrieveduser.isPresent() ? retrieveduser.get().getName() : "Not found"));

        // Eliminar usuario
        userRepository.remove(userId);
        Optional<User> afterDeletion = userRepository.getById(userId);
        System.out.println("User after deletion: " + (afterDeletion.isPresent() ? "Exists" : "Not found"));
    }
}
