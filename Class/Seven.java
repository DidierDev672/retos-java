// ! Si 15 obreros pueden construir una pared en 5 días
//! Cuanto tiempo tardaran 25 obreros en construir la misma pared?

class Seven {
    public static void main(String[] args) {
        double labourer = 15;
        double workman = 25;
        double days = 5;

        double result = (labourer * days) / workman;
        System.err.println("El tiempo que tardaran los 25 obreros en construir la misma pared: " + result);
    }
}