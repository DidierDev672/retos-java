package Herencia;

// Superclase que define propiedades y comportamientos comunes
class Animal {
    // Atributos de la superclase
    String name;

    // Método común para todos los animales
    void sleep() {
        System.out.println(name + "  is sleeping.");
    }
}

// Subclase que hereda de la clase Animal
class Dog extends Animal {
    void ladrar() {
        System.out.println("!Guau guau!");
    }
}

public class Herencia {
    // Crear una instancia de Perro (subclase)
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Rex"; // Acceso al atributo heredado de Animal

        // Llamar a métodos heredados y propios de Perro
        dog.sleep(); // Salida: Rex está durmiendo.
        dog.ladrar(); // Salida: ¡Guau guau!
    }
}
