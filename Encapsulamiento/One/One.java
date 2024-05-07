package Encapsulamiento.One;

/*
 * Crea una clase CuentaBancaria con atributos encapsulados para saldo y titular. Incluye 
 * métodos para depositar, retirar y consultar el saldo, con lógica para evitar saldos negativos o 
 * retiros que excedan el saldo disponible. El ejercicio también puede involucrar el uso de 
 * excepciones para manejar errores de operación.
 */

class CuentaBancaria {
    private double saldo;
    private String titular;

    public CuentaBancaria(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitle() {
        return titular;
    }

    public void depositar(double value) {
        if (value > 0) {
            saldo += value;
        } else {
            throw new IllegalArgumentException("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double value) {
        if (value > saldo) {
            throw new IllegalArgumentException("Fondos insuficientes.");
        } else if (value <= 0) {
            throw new IllegalArgumentException("La cantidad a retirar debe ser positiva.");
        } else {
            saldo -= value;
        }
    }

}

public class One {
    public static void main(String[] args) {
        CuentaBancaria bancaria = new CuentaBancaria(10000, "Didier Arias");

        // Imprimir Saldo inicial
        System.out.println("Saldo inicial: " + bancaria.getSaldo());

        // Depositar dinero
        bancaria.depositar(500);
        System.out.println("Saldo después del deposito: " + bancaria.getSaldo());

        // Depositar dinero
        bancaria.retirar(2000);
        System.out.println("Saldo después del retiro: " + bancaria.getSaldo());

        // Intentar retirar más dinero del disponible (lanzará excepción)
        try {
            bancaria.retirar(1500);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
