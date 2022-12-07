package br.com.poc.factory.pattern.products;

import br.com.poc.factory.pattern.dto.HeadPhoneDTO;
import br.com.poc.factory.pattern.interfaces.IProduct;

import javax.swing.*;
import java.math.BigDecimal;

public class HeadPhone implements IProduct<String> {
    private HeadPhoneDTO headPhoneDTO;

    public HeadPhone() {
        this.headPhoneDTO = new HeadPhoneDTO();
    }

    @Override
    public void sell() {
        JOptionPane.showMessageDialog(null, "Product Sold: " + this.getProductDetails(), "Factory Pattern", JOptionPane.INFORMATION_MESSAGE);
    }

    @Override
    public String getProductDetails() {
        this.setHeadPhone();
        return this.headPhoneDTO.toString();
    }

    public void setHeadPhone() {
        this.headPhoneDTO.setName("LOGITECH G PRO");
        this.headPhoneDTO.setBrandName("LOGITECH");
        this.headPhoneDTO.setChannel("7.1");
        this.headPhoneDTO.setMegaHertz(1777);
        this.headPhoneDTO.setHasMicrophone(true);
        this.headPhoneDTO.setDiscount(new BigDecimal(10));
    }
}
