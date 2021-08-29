package br.com.poc.factory.pattern.dto;

import com.google.gson.Gson;

import java.io.Serializable;

public class HeadPhoneDTO implements Serializable {
    private String name;
    private String brandName;
    private boolean hasMicrophone;
    private int megaHertz;
    private String channel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public boolean isHasMicrophone() {
        return hasMicrophone;
    }

    public void setHasMicrophone(boolean hasMicrophone) {
        this.hasMicrophone = hasMicrophone;
    }

    public int getMegaHertz() {
        return megaHertz;
    }

    public void setMegaHertz(int megaHertz) {
        this.megaHertz = megaHertz;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    @Override
    public String toString() {
        return new Gson().toJson(this);
    }
}
