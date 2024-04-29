package Herencia.One;

/*
 * Crea una superclase Vehiculo con propiedades comunes como marca y modelo. Luego,
 * crea dos subclases Auto y Moto, cada una con comportamientos específicos. Implemente 
 * métodos para mostrar información del vehículo y para realizar acciones particulares de cada
 * subclase.
 */

//? Superclass con atributos
class Vehiculo {
    String marca;
    String modelo;

    void mostrarInformacion() {
        System.out.println("Marca: " + marca + ", Modelo: " + modelo);
    }
}

// ? Subclase para autos
class Auto extends Vehiculo {
    int puertas;

    // Sobrescribir para mostrar información de puertas
    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Puertas: " + puertas);
    }

    void tocarBocina() {
        System.out.println("!Beep Beep!");
    }
}

// ? Subclase para motos
class Moto extends Vehiculo {
    boolean tieneParabrisas;

    @Override
    void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tiene parabrisas: " + (tieneParabrisas ? "Si" : "No"));
    }

    void acelerar() {
        System.out.println("!Vroon Vroon!");
    }
}

public class One {
    public static void main(String[] args) {
        Auto auto = new Auto();
        auto.marca = "Toyota";
        auto.modelo = "Corolla";
        auto.puertas = 4;

        Moto moto = new Moto();
        moto.marca = "Yahama";
        moto.modelo = "R1";
        moto.tieneParabrisas = true;

        // Mostrar información y ejecutar acciones específicas
        auto.mostrarInformacion();
        auto.tocarBocina();

        moto.mostrarInformacion();
        moto.acelerar();
    }
}
