package br.com.poc.factory.pattern.products;

import br.com.poc.factory.pattern.dto.MonitorDTO;
import br.com.poc.factory.pattern.interfaces.IProduct;
import br.com.poc.factory.pattern.utils.Logger;

import java.math.BigDecimal;

public class Monitor implements IProduct<String> {
    private static final Logger LOGGER = new Logger(Monitor.class);

    private MonitorDTO monitorDTO;

    public Monitor() {
        this.monitorDTO = new MonitorDTO();
    }

    @Override
    public void sell() {
        LOGGER.info("Product Sold", this.monitorDTO);
    }

    @Override
    public String getProductDetails() {
        this.setMonitor();
        return this.monitorDTO.toString();
    }

    public void setMonitor() {
        this.monitorDTO.setName("DELL XPS 17");
        this.monitorDTO.setBrand("DELL");
        this.monitorDTO.setHertzValue(144);
        this.monitorDTO.setInches(32);
        this.monitorDTO.setDiscount(new BigDecimal(300));
    }
}
