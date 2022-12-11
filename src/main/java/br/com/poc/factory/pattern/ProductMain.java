package br.com.poc.factory.pattern;

import java.util.UUID;

import org.slf4j.MDC;

import br.com.poc.factory.pattern.factory.Product;
import br.com.poc.factory.pattern.factory.ProductFactory;
import br.com.poc.factory.pattern.utils.Logger;

public class ProductMain {
  public static void main(String[] args) throws Exception {
    final Logger LOGGER = new Logger(ProductMain.class);
    final ProductFactory productFactory = new ProductFactory();

    Product product;
    try {
      MDC.put("requestId", UUID.randomUUID().toString());
      product = productFactory.getProduct("MONITOR");
      product.sellProduct();
      product = productFactory.getProduct("COMPUTER");
      product.sellProduct();

      product = productFactory.getProduct("HEADPHONE");
      product.sellProduct();

      LOGGER.info("Process finished");
    } catch (Exception e) {
      LOGGER.error("Failed to process product factory", e.getMessage());
      throw e;
    } finally {
      MDC.remove("requestId");
      MDC.clear();
    }
  }
}
