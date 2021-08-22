package br.com.poc.factory.pattern.interfaces;

public interface IProduct {
    void sellProduct();

    <T> T getProductDetails();
}
