package Objetos;

//! Definición de la clase
class Person {
    String name;
    int age;

    // * Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método para mostrar información
    void showInformation() {
        System.out.println("Name: " + name + ", age: " + age);
    }
}

// * Crear objetos e interactuar con ellos */
public class main {
    public static void main(String[] args) {
        // * Crear un objeto de la clase Persona
        Person person1 = new Person("Jaun", 25);

        // * Acceder a sus atributos */
        System.out.println("Name of the person 1: " + person1);

        // * Llamar a un método */
        person1.showInformation();
    }
}
