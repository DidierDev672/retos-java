package Optional.Buscar;

import java.util.Optional;

/*
 * Buscar producto por nombre en una lista de productos
 * En este ejercicio, trabajarás con una lista de productos para encontrar un producto por nombre.
 * Requerimientos
 * Crea una lista de productos, cada uno con un nombre y un precio.
 * Busca un producto por nombre.
 * Si lo encuentras, devuelve el producto y su precio.
 * Si no, devuelve un mensaje que indique que no se encontró el producto.
 */

public class Main {

    public static void main(String[] args) {
        ProductList productList = new ProductList();

        Optional<Product> foundProduct = productList.findProductByName("Tablet");
        if (foundProduct.isPresent()) {
            System.out.println("Producto encontrado: " + foundProduct.get());
        } else {
            System.out.println("Producto no encontrada");
        }

        Product defaultProduct = foundProduct.orElse(new Product("Desconocido", 0.0));
        System.out.println("Producto o valor por defecto: " + defaultProduct);
        foundProduct.ifPresent(element -> System.out.println("Producto encontrada usando ifPresent: " + element));
    }
}
