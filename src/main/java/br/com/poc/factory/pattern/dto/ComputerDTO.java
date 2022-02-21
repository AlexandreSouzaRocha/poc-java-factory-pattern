package br.com.poc.factory.pattern.dto;

import com.google.gson.Gson;

import java.io.Serializable;
import java.math.BigDecimal;

public class ComputerDTO implements Serializable {
    private String name;
    private int ramSize;
    private int hardDiskSize;
    private String processorName;
    private BigDecimal discount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRamSize() {
        return this.ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHardDiskSize() {
        return this.hardDiskSize;
    }

    public void setHardDisSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public String getProcessorName() {
        return this.processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
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
