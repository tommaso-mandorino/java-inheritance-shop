package org.lessons.java.inheritance_shop;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Product {
    
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal vat;

    public Product(int code, String name, String brand, BigDecimal price, BigDecimal vat) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.vat = vat;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPrice() {
        return this.price.setScale(2, RoundingMode.HALF_EVEN);
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getVat() {
        return this.vat;
    }
    public void setVat(BigDecimal vat) {
        this.vat = vat;
    }

    @Override
    public String toString() {

        return
            "Codice: " + this.code + "\n" +
            "Nome: " + this.name + "\n" +
            "Marca: " + this.brand + "\n" +
            "Prezzo: " + this.price + "\n" +
            "IVA: " + this.vat + "\n";
    }
}