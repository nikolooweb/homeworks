package io.codelex.oop.summary.Exercise2;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ItemPacking implements Service {

    private static final String NAME = "Item packing";
    private static final BigDecimal PRICE = BigDecimal.valueOf(5).setScale(2, RoundingMode.HALF_UP);

    @Override
    public String getItemName() {
        return NAME;
    }

    @Override
    public BigDecimal getItemPrice() {
        return PRICE;
    }

    @Override
    public String getItemFullInfo() {
        return NAME + ", " + PRICE + " EUR";
    }
}
