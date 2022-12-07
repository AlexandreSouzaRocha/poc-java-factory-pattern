package br.com.poc.factory.pattern;

import java.util.UUID;

import org.apache.logging.log4j.ThreadContext;

import br.com.poc.factory.pattern.factory.Product;
import br.com.poc.factory.pattern.factory.ProductFactory;
import br.com.poc.factory.pattern.utils.Logger;

public class ProductMain {
    private static Product product;
    private static ProductFactory productFactory;

    public static void main(String[] args) throws Exception {
        final Logger LOGGER = new Logger(ProductMain.class);

        productFactory = new ProductFactory();
        try {
            ThreadContext.put("requestId", UUID.randomUUID().toString());
            product = productFactory.getProduct("MONITOR");
            product.sellProduct();
            product = productFactory.getProduct("COMPUTER");
            product.sellProduct();

            product = productFactory.getProduct("HEADPHONE");
            product.sellProduct();

            LOGGER.info("Process finished");
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            ThreadContext.remove("requestId");
            ThreadContext.clearAll();
        }
    }
}
