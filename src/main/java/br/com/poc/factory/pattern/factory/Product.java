package br.com.poc.factory.pattern.factory;

import br.com.poc.factory.pattern.interfaces.IProduct;

public abstract  class Product {
    public abstract IProduct createProduct();

    public void sellProduct() {
        IProduct product = this.createProduct();
        System.out.println("Selling product: " + product.getProductDetails().toString());
        product.sell();
    }
}
