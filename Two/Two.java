package Two;

import java.util.ArrayList;
/*
 * Crea una clase `Producto` con atributos como `nombre`, `precio`, y `cantidadEnStock`.
 * Luego, agrega un método para calcular el valor total del stock (precio * cantidad en stock). Crea
 * Luego, agrega una lista de productos y calcula el valor total de todos los productos en stock.
 */

class Product {
    String name;
    double price;
    int quantityStock;

    public Product(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    void showTotal(double price, int quantity) {
        System.err.println("Valor total " + this.name + ": " + valueTotal(price, quantityStock));
    }

    public static double valueTotal(double price, int quantity) {
        double result = (price * quantity);

        return result;
    }
}

public class Two {
    public static void main(String[] args) {
        ArrayList<Product> products = new ArrayList<>();

        Product pd1 = new Product("Batman: The Dark Knight Returns", 25.99, 10);
        Product pd2 = new Product("Watchmen", 30.00, 5);
        Product pd3 = new Product("Akira", 40.00, 12);

        products.add(pd1);
        products.add(pd2);
        products.add(pd3);

        for (Product product : products) {
            product.showTotal(product.price, product.quantityStock);
        }
    }
}
