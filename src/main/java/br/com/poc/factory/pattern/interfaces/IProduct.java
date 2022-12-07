package br.com.poc.factory.pattern.interfaces;

public interface IProduct<T> {
    void sell();

    T getProductDetails();
}
