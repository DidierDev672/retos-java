package Three;

import java.util.ArrayList;
import java.util.List;
/*
 * Crea una clase `Vehículo` con atributos como `marca` y  `modelo`, luego, crea dos subclases,
 * `Coche` y `Motocicleta`, cada una con sus propios atributos adicionales. Implementa un método para mostrar
 * detalles de cada vehículo.
 */

class Vehicle {
    Coche coche;
    Motorcycle motorcycle;

    public Vehicle(Coche coche, Motorcycle motorcycle) {
        this.coche = coche;
        this.motorcycle = motorcycle;
    }

}

class Coche {
    String name;
    String modelo;
    int year;
    double price;
    String color;

    public Coche(String name, String modelo, int year, double price, String color) {
        this.name = name;
        this.modelo = modelo;
        this.year = year;
        this.price = price;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "marca='" + this.name + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", year='" + this.year + '\'' +
                ", price='" + this.price + '\'' +
                ", color='" + this.color + '\'' +
                '}';
    }

}

class Motorcycle {
    String marca;
    String modelo;
    int year;
    double price;
    int cylinder; // Engine displacement in cubic centimeters (cc)

    public Motorcycle(String marca, String modelo, int year, double price, int cylinder) {
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.price = price;
        this.cylinder = cylinder;
    }

    @Override
    public String toString() {
        return "Motocicleta{" +
                "marca='" + this.marca + '\'' +
                ", modelo='" + this.modelo + '\'' +
                ", year='" + this.year + '\'' +
                ", price='" + this.price + '\'' +
                ", cylinder='" + this.cylinder + '\'' +
                '}';
    }
}

public class Three {
    public static void main(String[] args) {
        List<Coche> coche = new ArrayList<>();

        Coche coche2 = new Coche("Toyota", "Corolla", 2022, 2500.00, "White");
        coche.add(coche2);

        List<Motorcycle> motorcycles = new ArrayList<>();

        Motorcycle motorcycle = new Motorcycle("Yamaha", "R6", 2022, 1200.00, 600);
        motorcycles.add(motorcycle);

        List<Vehicle> list = new ArrayList<>();

        Vehicle vehicle = new Vehicle(coche2, motorcycle);
        list.add(vehicle);
        for (Vehicle vehicle2 : list) {
            System.err.println(vehicle2.coche.toString());
            System.out.println(vehicle2.motorcycle.toString());
        }
    }
}
