package com.example;

import java.util.ArrayList;

// 3. В main проинициализируйте несколько ГорячихНапитков и
// АвтоматГорячихНапитков и позвольте покупателю купить товар.
public class Main {

    public static <Product> void main(String[] args, Object name, int volume, int temperature) {
        Product coffee = new Product();
        Product tea = new Product();
        Product cacao = new Product();

        ArrayList<Product> venMachine = new ArrayList<Product>();
        venMachine.add(coffee);
        venMachine.add(tea);
        venMachine.add(cacao);

        final HDvendingmachine vendingMachine = new HDvendingmachine(vendingMachine);
        System.out.println(vendingMachine);
        vendingMachine.getCoffee();
        vendingMachine.getTea();
        vendingMachine.getCacao();
        vendingMachine.getVolume();
        vendingMachine.getTemperature();

    }

    System.out.println("name: "+

    getname() + " volume: " + getVolume() + "temperature:" + getTemperature);
}