package br.com.poc.factory.pattern.dto;

import com.google.gson.Gson;

public class MonitorDTO {
    private String name;
    private int hertzValue;
    private int inches;
    private String brand;

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

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
