package br.com.poc.factory.pattern.interfaces;

public interface IProduct {
    void sell();

    <T> T getProductDetails();
}
