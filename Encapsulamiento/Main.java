package Encapsulamiento;

class Estudiante {
    private String nombre;
    private int edad;

    // Getter para acceder al nombre
    public String getNombre() {
        return nombre;
    }

    // Setter para modificar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Getter para acceder a la edad
    public int getEdad() {
        return edad;
    }

    // Setter para modificar la edad con control
    public void setEdad(int edad) {
        if (edad >= 0) { // Control para evitar valores negativos
            this.edad = edad;
        } else {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante();

        // Usar setters para configurar los atributos
        estudiante.setNombre("Juan");
        estudiante.setEdad(21);

        // usar setters para obtener información
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Edad: " + estudiante.getEdad());

        // Intentar establecer una edad negativa (esto lanzará una excepción)
        // try {
        // estudiante.setEdad(-5);
        // } catch (IllegalAccessError e) {
        // System.out.println("Error: " + e.getMessage());
        // }
    }
}