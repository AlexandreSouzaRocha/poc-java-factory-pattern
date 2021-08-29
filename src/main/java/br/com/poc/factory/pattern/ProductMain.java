package br.com.poc.factory.pattern;

import br.com.poc.factory.pattern.factory.Product;
import br.com.poc.factory.pattern.factory.ProductFactory;

public class ProductMain {
    private static Product product;
    private static ProductFactory productFactory;

    public static void main(String[] args) {
        productFactory = new ProductFactory();
        try {
            product = productFactory.getProduct("MONITOR");
            product.sellProduct();
        } catch (Exception e) {
            System.out.println("Unhandled error: " + e.getMessage());
            System.exit(0);
        }
    }
}
