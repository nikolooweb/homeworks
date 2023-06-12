package io.codelex.oop.summary.Exercise2;

import java.math.BigDecimal;

public class ElectronicsItem extends AbstractItem{
    private int watts;
    public ElectronicsItem(String name, BigDecimal price, int wattPower) {
        super(name, price);
        watts = wattPower;
    }

    @Override
    public String getItemFullInfo() {
        return super.getItemFullInfo() + ", power: " + watts + "W";
    }
}
