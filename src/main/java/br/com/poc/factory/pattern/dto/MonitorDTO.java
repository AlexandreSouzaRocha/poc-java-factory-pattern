package br.com.poc.factory.pattern.dto;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;

public class MonitorDTO implements Serializable {
    private String name;
    private int hertzValue;
    private int inches;
    private String brand;
    private BigDecimal discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHertzValue() {
        return hertzValue;
    }

    public void setHertzValue(int hertzValue) {
        this.hertzValue = hertzValue;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getDiscount() {
        return this.discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
