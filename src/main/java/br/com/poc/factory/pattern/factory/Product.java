package br.com.poc.factory.pattern.factory;

import br.com.poc.factory.pattern.interfaces.IProduct;
import br.com.poc.factory.pattern.utils.Logger;

public abstract class Product {
    private final Logger LOGGER = new Logger(this.getClass());

    public abstract IProduct<String> createProduct();

    public void sellProduct() {
        IProduct<String> product = this.createProduct();
        this.LOGGER.info("Selling product", product.getProductDetails());
        product.sell();
    }
}
