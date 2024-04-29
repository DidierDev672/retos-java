package Herencia.Two;

/*
 * Crea una superclass Empleado con propiedades como nombre y salarioBase. Luego, crea 
 * subclases para EmpleadoTiempoCompleto y EmpleadoTiempoParcial con cálculos 
 * específicos para el salario.
 */

//? Superclase para empleados
class Empleado {
    String nombre;
    double salarioBase;

    double calcularSalario() {
        return salarioBase;
    }
}

// ? Subclase para empleados de tiempo completo
class EmpleadoTiempoCompleto extends Empleado {
    double bonoAnual;

    @Override
    double calcularSalario() {
        return (salarioBase + bonoAnual);
    }
}

class EmpleadoTiempoParcial extends Empleado {
    int horaTrabajas;

    @Override
    double calcularSalario() {
        return salarioBase * (horaTrabajas / 40.0); // Proporcional a 40 horas/semana
    }
}

public class Two {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto completoTC = new EmpleadoTiempoCompleto();
        completoTC.nombre = "Juan";
        completoTC.salarioBase = 50000;
        completoTC.bonoAnual = 50000;

        EmpleadoTiempoParcial empleadoTiempoParcial = new EmpleadoTiempoParcial();
        empleadoTiempoParcial.nombre = "Karen";
        empleadoTiempoParcial.salarioBase = 750000;
        empleadoTiempoParcial.horaTrabajas = 8;

        System.out.println("Salario de  " + completoTC.nombre + ": " + completoTC.calcularSalario());
        System.out
                .println("Salario de " + empleadoTiempoParcial.nombre + ": " + empleadoTiempoParcial.calcularSalario());
    }
}
