package org.lessons.java.inheritance_shop;

import java.math.BigDecimal;

public class Smartphone extends Product {

    public String imeiCode;
    public int memoryAmount;

    public Smartphone(int code, String name, String brand, BigDecimal price, BigDecimal vat, String imeiCode, int memoryAmount) {
        super(code, name, brand, price, vat);
        this.imeiCode = imeiCode;
        this.memoryAmount = memoryAmount;
    }

    public String getImeiCode() {
        return this.imeiCode;
    }
    public void setImeiCode(String imeiCode) {
        this.imeiCode = imeiCode;
    }

    public int getMemoryAmount() {
        return this.memoryAmount;
    }
    public void setMemoryAmount(int memoryAmount) {
        this.memoryAmount = memoryAmount;
    }

}