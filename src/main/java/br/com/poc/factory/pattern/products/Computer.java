package br.com.poc.factory.pattern.products;

import br.com.poc.factory.pattern.dto.ComputerDTO;
import br.com.poc.factory.pattern.interfaces.IProduct;

import javax.swing.*;
import java.math.BigDecimal;

public class Computer implements IProduct {
    private ComputerDTO computerDTO;

    public Computer() {
        this.computerDTO = new ComputerDTO();
    }

    @Override
    public void sell() {
        JOptionPane.showMessageDialog(null, "Product Sold: " + this.getProductDetails(), "Factory Pattern", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public <T> T getProductDetails() {
        this.setComputer();
        return (T) this.computerDTO.toString();
    }

    public void setComputer() {
        this.computerDTO.setName("DELL");
        this.computerDTO.setRamSize(16000);
        this.computerDTO.setProcessorName("INTEL");
        this.computerDTO.setHardDisSize(2048);
        this.computerDTO.setDiscount(new BigDecimal(39));
    }
}

