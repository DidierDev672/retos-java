package Polimorfismo.Zoologico;

public class Loro extends Animal {

    @Override
    public void comer() {
        System.out.println("El loro solo come frutas");
    }

    @Override
    public void hacerSonido() {
        System.out.println("El loro habla y habla, emita");
    }

    @Override
    public void moverse() {
        System.out.println("El loro se move muy poco");
    }

}
