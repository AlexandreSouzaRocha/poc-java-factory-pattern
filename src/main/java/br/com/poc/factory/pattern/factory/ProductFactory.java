package br.com.poc.factory.pattern.factory;


import br.com.poc.factory.pattern.constants.ProductConstants;
import br.com.poc.factory.pattern.creators.ComputerCreator;
import br.com.poc.factory.pattern.creators.HeadPhoneCreator;
import br.com.poc.factory.pattern.creators.MonitorCreator;

public class ProductFactory {
    public Product getProduct(String type) throws Exception {
        return switch (type) {
            case ProductConstants.COMPUTER -> new ComputerCreator();
            case ProductConstants.HEADPHONE -> new HeadPhoneCreator();
            case ProductConstants.MONITOR -> new MonitorCreator();
            default -> throw new Exception("The product type is not valid.");
        };
    }

}
