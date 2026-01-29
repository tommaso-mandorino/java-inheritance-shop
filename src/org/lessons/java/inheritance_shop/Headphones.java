package org.lessons.java.inheritance_shop;

import java.math.BigDecimal;

public class Headphones extends Product {

    private String color;
    private boolean isWireless;
    private boolean isWired;

    public Headphones(int code, String name, String brand, BigDecimal price, BigDecimal vat, String color, boolean isWireless, boolean isWired) {
        super(code, name, brand, price, vat);
        this.color = color;
        this.isWireless = isWireless;
        this.isWired = isWired;
    }

    public String getColor() {
        return this.color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsWireless() {
        return this.isWireless;
    }
    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    public boolean getIsWired() {
        return this.isWired;
    }
    public void setIsWired(boolean isWired) {
        this.isWired = isWired;
    }
}