package Polimorfismo.Zoologico;

public class Elefante extends Animal {
    private String name;

    public Elefante(String name) {
        this.name = name;
    }

    @Override
    public String comer() {
        this.name = "El elefante somo come vegetales";
        return this.name;
    }

    @Override
    public String hacerSonido() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public String moverse() {
        // TODO Auto-generated method stub
        return null;
    }

}
