public class index {
    // ! Si 4 lapices cuestan $2, Cuanto cuesta 6 lapices?
    public static void main(String[] args) {
        double valor1 = 4;
        double valor2 = 6;
        double resultado = 2;

        double resultado2 = calcular(valor1, valor2, resultado);

        System.out.println("6 lapices cuestan: $" + resultado2);
    }

    public static double calcular(double valor, double valor2, double resultado) {
        return (resultado * valor2) / valor;
    }
}