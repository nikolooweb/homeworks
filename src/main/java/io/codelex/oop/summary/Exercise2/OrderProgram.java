package io.codelex.oop.summary.Exercise2;

import io.codelex.oop.summary.Exercise2.exceptions.BadFoodException;
import io.codelex.oop.summary.Exercise2.exceptions.WrongOrderException;

import java.math.BigDecimal;
import java.time.LocalDate;

public class OrderProgram {
    public static void main(String[] args) throws WrongOrderException, BadFoodException {
        FoodItem milk = new FoodItem("Milk", BigDecimal.valueOf(0.75), LocalDate.of(2023, 6, 25));
        ElectronicsItem dishWasher = new ElectronicsItem("Dishwasher", BigDecimal.valueOf(199.99), 1000);
        HouseholdItem kitchenTable = new HouseholdItem("Kitchen table", BigDecimal.valueOf(154.99), "white");
        ElectronicsItem radio = new ElectronicsItem("Radio", BigDecimal.valueOf(34.50), 25);
        FoodItem eggs = new FoodItem("eggs", BigDecimal.valueOf(1.35), LocalDate.of(1999, 3, 10));
        ItemPacking itemPacking = new ItemPacking();

        Order order1 = new Order();
        order1.addItem(milk);
        order1.addItem(dishWasher);
        order1.addItem(kitchenTable);
        order1.addItem(radio);
        order1.addItem(itemPacking);

        //order1.getItems().clear(); //will throw error
        //order1.addItem(eggs); //will throw error

        Invoice invoice = new Invoice("INV123", order1);
        System.out.println(invoice.printInvoice());

        invoice.send();
        System.out.println(invoice.printInvoice());

    }
}
