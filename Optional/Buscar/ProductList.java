package Optional.Buscar;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class ProductList {
    private final List<Product> product;

    public ProductList() {
        product = new ArrayList<>();
        product.add(new Product("Laptop", 899.99));
        product.add(new Product("Smartphone", 599.99));
        product.add(new Product("Tablet", 299.99));
    }

    public Optional<Product> findProductByName(String name) {
        return product.stream()
                .filter(element -> element.getName().equalsIgnoreCase(name))
                .findFirst();
    }
}