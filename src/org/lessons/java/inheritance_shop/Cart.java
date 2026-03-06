package org.lessons.java.inheritance_shop;

import java.util.Scanner;
import java.math.BigDecimal;

public class Cart {

    private Product[] cart;

    public Cart() {
        this.cart = new Product[0];
    }

    @Override
    public String toString() {

        String cartString = "Numero prodotti: " + this.cart.length + "\n\n";

        for (int index = 0; index < this.cart.length; index++ ) {
            cartString += "Prodotto numero " + (index + 1) + "\n" + this.cart[index].toString();
        }

        return cartString;
    }
 
    public void addProduct(Product product) {

        Product[] updatedCart = new Product[cart.length + 1];

        for (int index = 0; index < this.cart.length; index++) {
            updatedCart[index] = this.cart[index];
        }

        updatedCart[updatedCart.length - 1] = product;

        this.cart = updatedCart;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Cart userCart = new Cart();
        int userChoice;

        do {
            int productCode;
            String productName;
            String productBrand;
            BigDecimal productPrice;
            BigDecimal productVat;

            System.out.print("\nScegli cosa aggiungere al carrello:\n0) Niente\n1) Smartphone\n2) Televisore\n3) Cuffie\nRisposta: ");
            userChoice = Integer.parseInt(scanner.nextLine());

            if (userChoice >= 1 && userChoice <= 3) {

                System.out.print("Inserisci il codice del prodotto: ");
                productCode = Integer.parseInt(scanner.nextLine());

                System.out.print("Inserisci il nome del prodotto: ");
                productName = scanner.nextLine();

                System.out.print("Inserisci il marchio del prodotto: ");
                productBrand = scanner.nextLine();

                System.out.print("Inserisci il prezzo del prodotto: ");
                productPrice = new BigDecimal(scanner.nextLine());

                System.out.print("Inserisci l'IVA del prodotto: ");
                productVat = new BigDecimal(scanner.nextLine());

                switch (userChoice) {

                    case 1:

                        System.out.print("Inserisci il codice IMEI dello smartphone: ");
                        String smartphoneImei = scanner.nextLine();

                        System.out.print("Inserisci la quantità di memoria dello smartphone: ");
                        int smartphoneMemoryAmount = Integer.parseInt(scanner.nextLine());

                        Smartphone newSmartphone = new Smartphone(productCode, productName, productBrand, productPrice, productVat, smartphoneImei, smartphoneMemoryAmount);
                        userCart.addProduct(newSmartphone);

                        break;

                    case 2:

                        System.out.print("Inserisci la larghezza del televisore: ");
                        int televisionWidth = Integer.parseInt(scanner.nextLine());

                        System.out.print("Inserisci l'altezza del televisore: ");
                        int televisionHeight = Integer.parseInt(scanner.nextLine());

                        System.out.print("Inserisci la profondità del televisore: ");
                        int televisionDepth = Integer.parseInt(scanner.nextLine());

                        System.out.print("Inserisci il numero di pollici del televisore: ");
                        int televisionInches = Integer.parseInt(scanner.nextLine());

                        System.out.print("Il televisore è smart? (1 = sì / 0 = no): ");
                        boolean isTelevisionSmart = Integer.parseInt(scanner.nextLine()) == 1;
                        
                        Television newTelevision = new Television(productCode, productName, productBrand, productPrice, productVat, televisionWidth, televisionHeight, televisionDepth, televisionInches, isTelevisionSmart);
                        userCart.addProduct(newTelevision);

                        break;

                    case 3:
                        
                        System.out.print("Inserisci il colore delle cuffie: ");
                        String headphonesColor = scanner.nextLine();

                        System.out.print("Le cuffie sono cablate? (1 = sì / 0 = no): ");
                        boolean isHeadphonesWired = Integer.parseInt(scanner.nextLine()) == 1;

                        System.out.print("Le cuffie sono wireless? (1 = sì / 0 = no): ");
                        boolean isHeadphonesWireless = Integer.parseInt(scanner.nextLine()) == 1;

                        Headphones newHeadphones = new Headphones(productCode, productName, productBrand, productPrice, productVat, headphonesColor, isHeadphonesWireless, isHeadphonesWired);
                        userCart.addProduct(newHeadphones);

                        break;
                }

                System.out.println("\nProdotto aggiunto con successo.");

            } else if (userChoice != 0) {

                System.out.println("Scelta non valida.\n");

            }

        } while (userChoice != 0);

        System.out.println("\nRiepilogo carrello:\n");
        System.out.println(userCart.toString());

        scanner.close();
    }
    
}