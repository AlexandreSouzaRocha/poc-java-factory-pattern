package br.com.poc.factory.pattern.products;

import br.com.poc.factory.pattern.dto.MonitorDTO;
import br.com.poc.factory.pattern.interfaces.IProduct;

import javax.swing.*;
import java.math.BigDecimal;

public class Monitor implements IProduct<String> {
    private MonitorDTO monitorDTO;

    public Monitor() {
        this.monitorDTO = new MonitorDTO();
    }

    @Override
    public void sell() {
        JOptionPane.showMessageDialog(null, "Product Sold: " + this.getProductDetails(), "Factory Pattern", JOptionPane.INFORMATION_MESSAGE);
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
