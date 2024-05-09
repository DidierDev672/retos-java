package Polimorfismo.Zoologico;

public class Leon extends Animal {
    private String message;

    public Leon(String message) {
        this.message = message;
    }

    @Override
    public String comer() {
        String print = "Animal  " + this.message + " come semillas";
        return print;
    }

    @Override
    public String hacerSonido() {
        String pString = "El " + this.message + "  canta.";
        return pString;
    }

    @Override
    public String moverse() {
        String printString = "El " + this.message + " vuela.";
        return printString;
    }
}
