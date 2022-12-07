package br.com.poc.factory.pattern.products;

import br.com.poc.factory.pattern.dto.ComputerDTO;
import br.com.poc.factory.pattern.interfaces.IProduct;
import br.com.poc.factory.pattern.utils.Logger;

import java.math.BigDecimal;

public class Computer implements IProduct<String> {
    private static final Logger LOGGER = new Logger(Computer.class);

    private ComputerDTO computerDTO;

    public Computer() {
        this.computerDTO = new ComputerDTO();
    }

    @Override
    public void sell() {
        LOGGER.info("Product Sold", this.computerDTO);
    }

    @Override
    public String getProductDetails() {
        this.setComputer();
        return this.computerDTO.toString();
    }

    public void setComputer() {
        this.computerDTO.setName("DELL");
        this.computerDTO.setRamSize(16000);
        this.computerDTO.setProcessorName("INTEL");
        this.computerDTO.setHardDisSize(2048);
        this.computerDTO.setDiscount(new BigDecimal(39));
    }
}
