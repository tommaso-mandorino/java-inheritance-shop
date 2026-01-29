package org.lessons.java.inheritance_shop;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        
        Product product1 = new Product(3000, "Product 1 Name", "Product 1 Brand", new BigDecimal("100.99"), new BigDecimal("22"));

        System.out.println(product1.getCode());
        System.out.println(product1.getName());
        System.out.println(product1.getBrand());
        System.out.println(product1.getPrice());
        System.out.println(product1.getVat());

        product1.setName("Product 1 changed name");
        product1.setBrand("Product 1 changed brand");
        product1.setPrice(new BigDecimal("50"));
        product1.setVat(new BigDecimal("30"));

        System.out.println();

        System.out.println(product1.getCode());
        System.out.println(product1.getName());
        System.out.println(product1.getBrand());
        System.out.println(product1.getPrice());
        System.out.println(product1.getVat());

        System.out.println();

        Smartphone smartphone1 = new Smartphone(12345, "Smartphone name", "Smartphone brand", new BigDecimal("500"), new BigDecimal("22"), "000000000000000", 512);
        
        System.out.println(smartphone1.getImeiCode());
        System.out.println(smartphone1.getMemoryAmount());
        System.out.println(smartphone1.getBrand());
    }
}