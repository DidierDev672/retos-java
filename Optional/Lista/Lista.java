package Optional.Lista;

import java.util.Optional;

public class Lista {

    public static void main(String[] args) {
        PersonList personList = new PersonList();

        Optional<Person> foundPerson = personList.findPersonByName("Alice");
        if (foundPerson.isPresent()) {
            System.out.println("Persona encontrada: " + foundPerson.get());
        } else {
            System.out.println("Persona no encontrada");
        }

        // Usando orElse para proporcionar un valor por defecto si la persona no se
        // encuentra
        Person defaultPerson = foundPerson.orElse(new Person("Desconocido", 0));
        System.out.println("Persona o valor por defecto: " + defaultPerson);

        // Usando ifPresent para ejecutar una acción si la persona está presente
        foundPerson.ifPresent(person -> System.out.println("Persona encontrada usando ifPresente: " + person));
    }

}
