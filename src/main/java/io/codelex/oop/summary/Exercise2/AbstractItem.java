package io.codelex.oop.summary.Exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class AbstractItem implements Item {

    private String name;
    private BigDecimal price;
    public AbstractItem(String name, BigDecimal price){
        this.name = name;
        this.price = price;
    }

    @Override
    public BigDecimal getItemPrice() {
        return price;
    }

    @Override
    public String getItemName() {
        return name;
    }

    @Override
    public String getItemFullInfo() {
        return name + ", " + price.setScale(2, RoundingMode.HALF_UP) + " EUR";
    }

}
