package Objetos;
//? Crea una `Persona` con atributos básicos como nombre y edad. Luego, escribe un método

//? Para verificar si la persona es mayor de edad. Crea varias instancias de `Persona` y verificar su mayoría de edad.

/*
 * Pasos:
 * 1. Define las clase `Persona` con atributos `nombre` y `edad`.
 * 2. Agrega un método llamado `esMayorDeEdad()` que devuelva `true` si la edad es 18 o mas, y `false` de lo contrario.
 * 3. Crea instancia de `Persona` y utiliza el método `esMayorDeEdad()` para verificar la mayoría de edad.
 */

class Persona {
    String name;
    int age;

    public Persona(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void heOlder() {
        if (esMayorDeEdad(age)) {
            System.err.println("La persona: " + this.age + " es mayor de edad: " + this.age + " Edad.");
        } else {
            System.err.println("La persona: " + this.age + " no es mayor de edad: " + this.age + " Edad.");
        }

    }

    public static Boolean esMayorDeEdad(int age) {
        if (age >= 18) {
            return true;
        }

        return false;
    }
}

public class One {
    public static void main(String[] args) {
        Persona person1 = new Persona("Didier Arias", 27);
        Persona person2 = new Persona("Maria Paz", 3);

        person1.heOlder();
        person2.heOlder();
    }
}
