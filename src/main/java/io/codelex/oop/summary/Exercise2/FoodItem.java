package io.codelex.oop.summary.Exercise2;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FoodItem extends AbstractItem {

    private LocalDate dateOfExpiration;

    public FoodItem(String name, BigDecimal price, LocalDate dateOfExpiration) {
        super(name, price);
        this.dateOfExpiration = dateOfExpiration;
    }

    public LocalDate getDateOfExpiration() {
        return dateOfExpiration;
    }

    @Override
    public String getItemFullInfo() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        return super.getItemFullInfo() + ", best before: " + dateOfExpiration.format(dateTimeFormatter);
    }
}
