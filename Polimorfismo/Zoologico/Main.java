package Polimorfismo.Zoologico;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new Leon("Leon"),
                new Elefante("Elefante"),
                new Loro("Loro")
        };

        for (Animal animal : animals) {
            System.out.println("Leon: " + animal.comer());
            System.out.println("Elefante: " + animal.moverse());
            System.out.println("Loro: " + animal.hacerSonido());
            System.out.println("-------------------------------------------");
        }
    }
}
