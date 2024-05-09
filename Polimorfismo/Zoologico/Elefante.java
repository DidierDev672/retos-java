package Polimorfismo.Zoologico;

public class Elefante extends Animal {
    private String name;

    public Elefante(String name) {
        this.name = name;
    }

    @Override
    public String comer() {
        String print = "El animal " + this.name + " come vegetales.";
        return print;
    }

    @Override
    public String hacerSonido() {
        String printString = "El " + this.name + "  trompetea.";
        return printString;
    }

    @Override
    public String moverse() {
        String printMessage = "El " + this.name + "  camina lentamente";
        return printMessage;
    }

}
