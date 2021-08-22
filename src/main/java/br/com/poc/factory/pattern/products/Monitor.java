package br.com.poc.factory.pattern.products;

import br.com.poc.factory.pattern.dto.MonitorDTO;
import br.com.poc.factory.pattern.interfaces.IProduct;

import javax.swing.*;

public class Monitor implements IProduct {
    private MonitorDTO monitorDTO;

    public Monitor() {
        this.monitorDTO = new MonitorDTO();
    }

    @Override
    public void sellProduct() {
        JOptionPane.showMessageDialog(null, "Product Sold: " + this.getProductDetails(), "Factory Pattern", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public <T> T getProductDetails() {
        this.setMonitor();
        return (T) this.monitorDTO.toString();
    }

    public void setMonitor() {
        this.monitorDTO.setName("DELL XPS 17");
        this.monitorDTO.setBrand("DELL");
        this.monitorDTO.setHertzValue(144);
        this.monitorDTO.setInches(32);
    }
}
