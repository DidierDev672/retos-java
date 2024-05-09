package Polimorfismo.Zoologico;

public class Loro extends Animal {
    private String message;

    public Loro(String message) {
        this.message = message;
    }

    @Override
    public String comer() {
        String pString = "Animal " + this.message + " come semillas.";
        return pString;
    }

    @Override
    public String hacerSonido() {
        String print = "El " + this.message + " canta.";
        return print;
    }

    @Override
    public String moverse() {
        String printMessage = "El " + this.message + " vuela.";
        return printMessage;
    }

}
