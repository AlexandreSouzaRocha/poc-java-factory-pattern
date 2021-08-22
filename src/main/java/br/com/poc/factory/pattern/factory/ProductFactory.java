package br.com.poc.factory.pattern.factory;


import br.com.poc.factory.pattern.constants.ProductConstants;
import br.com.poc.factory.pattern.creators.ComputerCreator;
import br.com.poc.factory.pattern.creators.HeadPhoneCreator;
import br.com.poc.factory.pattern.creators.MonitorCreator;

public class ProductFactory {
    public Product makeProduct(String type) throws Exception {
        switch (type) {
            case ProductConstants.COMPUTER:
                return new ComputerCreator();
            case ProductConstants.HEADPHONE:
                return new HeadPhoneCreator();
            case ProductConstants.MONITOR:
                return new MonitorCreator();
            default:
                throw new Exception("The product type is not valid.");
        }
    }

}
