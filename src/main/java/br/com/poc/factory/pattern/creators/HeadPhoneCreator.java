package br.com.poc.factory.pattern.creators;

import br.com.poc.factory.pattern.factory.Product;
import br.com.poc.factory.pattern.interfaces.IProduct;
import br.com.poc.factory.pattern.products.HeadPhone;

public class HeadPhoneCreator extends Product {
    @Override
    public IProduct<String> createProduct() {
        return new HeadPhone();
    }
}
