package Optional.Lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PersonList {
    private final List<Person> people;

    public PersonList() {
        people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
    }

    /**
     * Busca una persona por nombre y devuelve un Optional que puede contener a la
     * persona si se encuentra.
     *
     * @param name El nombre de la persona a buscar.
     * @return Un Optional con la persona si se encuentra, o un Optional vacío si
     *         no.
     */

    public Optional<Person> findPersonByName(String name) {
        return people.stream()
                .filter(person -> person.getName().equalsIgnoreCase(name))
                .findFirst(); // ? Retorna un Optional con el primer resultado encontrado.
    }
}
