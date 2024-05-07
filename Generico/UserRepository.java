package Generico;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class UserRepository implements Repository<User, UUID> {
    private final Map<UUID, User> users = new HashMap<>();

    @Override
    public void add(User item) {
        users.put(item.getId(), item);
    }

    @Override
    public Optional<User> getById(UUID id) {
        return Optional.ofNullable(users.get(id));
    }

    @Override
    public void remove(UUID id) {
        users.remove(id);
    }
}
