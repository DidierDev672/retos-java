package Objetos;

// Clase que representa un motor
class Motor {
    int power;

    public Motor(int power) {
        this.power = power;
    }
}

// Clase que representa un coche
class CocheModel {
    String modelo;
    Motor motor; // ! Composición: Un coche tiene un motor.

    public CocheModel(String modelo, int powerMotor) {
        this.modelo = modelo;
        this.motor = new Motor(powerMotor);
    }

    // Método para mostrar información
    void ShowInformation() {
        System.out.println("Modelo: " + modelo + ", Potencial del motor: " + motor.power + " HP");
    }
}

// Crear objetos e interactuar con ellos.
public class Coche {
    public static void main(String[] args) {
        // Crear un objeto de la clase Coche
        CocheModel cModel = new CocheModel("Toyota Corolla", 130);

        // Llamar a un método
        cModel.ShowInformation();
    }

}
