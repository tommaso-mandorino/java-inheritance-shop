package org.lessons.java.inheritance_shop;

import java.math.BigDecimal;

public class Television extends Product {

    private float width;
    private float height;
    private float depth;
    private int inches;
    private boolean isSmart;

    public Television(int code, String name, String brand, BigDecimal price, BigDecimal vat, float width, float heigth, float depth, int inches, boolean isSmart) {
        super(code, name, brand, price, vat);
        this.width = width;
        this.height = heigth;
        this.depth = depth;
        this.inches = inches;
        this.isSmart = isSmart;
    }

    public float getWidth() {
        return this.width;
    }
    public void setWidth(float width) {
        this.width = width;
    }

    public float getHeight() {
        return this.height;
    }
    public void setHeight(float height) {
        this.height = height;
    }

    public float getDepth() {
        return this.depth;
    }
    public void setDepth(float depth) {
        this.depth = depth;
    }

    public int getInches() {
        return this.inches;
    }
    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }
    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return
            "Tipologia: televisore\n" +
            super.toString() +
            "Dimensioni (larghezza x altezza x profondità): " + this.width + " cm x " + this.height + " cm x " + this.depth + " cm\n" +
            "Pollici: " + this.inches + "\n" +
            "Smart: " + (this.isSmart ? "sì" : "no") + "\n\n";
    }
}