package br.com.poc.factory.pattern.products;

import br.com.poc.factory.pattern.dto.HeadPhoneDTO;
import br.com.poc.factory.pattern.interfaces.IProduct;
import br.com.poc.factory.pattern.utils.Logger;

import java.math.BigDecimal;

public class HeadPhone implements IProduct<String> {
    private static final Logger LOGGER = new Logger(IProduct.class);
    private HeadPhoneDTO headPhoneDTO;

    public HeadPhone() {
        this.headPhoneDTO = new HeadPhoneDTO();
    }

    @Override
    public void sell() {
        LOGGER.info("Product Sold", this.headPhoneDTO);
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
