package br.com.poc.factory.pattern.dto;

import com.google.gson.Gson;

import java.io.Serializable;

public class ComputerDTO implements Serializable {
    private String name;
    private int ramSize;
    private int hardDiskSize;
    private String processorName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(int ramSize) {
        this.ramSize = ramSize;
    }

    public int getHardDisSize() {
        return hardDiskSize;
    }

    public void setHardDisSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public String getProcessorName() {
        return processorName;
    }

    public void setProcessorName(String processorName) {
        this.processorName = processorName;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
