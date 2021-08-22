package br.com.poc.factory.pattern.creators;

import br.com.poc.factory.pattern.factory.Product;
import br.com.poc.factory.pattern.interfaces.IProduct;
import br.com.poc.factory.pattern.products.Monitor;

public class MonitorCreator extends Product {
    @Override
    public IProduct createProduct() {
        return new Monitor();
    }
}
