package Polimorfismo.Zoologico;

public class Leon extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El león rugue!");
    }

    @Override
    public void comer() {
        System.out.println("El león come carne");
    }

    @Override
    public void moverse() {
        System.out.println("El león se mueve muy rápido");
    }
}
