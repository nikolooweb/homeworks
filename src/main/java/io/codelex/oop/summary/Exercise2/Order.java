package io.codelex.oop.summary.Exercise2;

import io.codelex.oop.summary.Exercise2.exceptions.BadFoodException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Order {
    private List<SellableThing> items;

    public Order() {
        items = new ArrayList<>();
    }

    public void addItem(SellableThing item) throws BadFoodException {
        if (item instanceof FoodItem) {
            if (((FoodItem) item).getDateOfExpiration().isBefore(LocalDate.now())) {
                throw new BadFoodException("This food has expired");
            }
        }
        items.add(item);
    }

    public List<SellableThing> getItems() {
        return items;
    }

    public String getListInfo() {
        return IntStream.range(0, items.size())
                .mapToObj(index -> index + 1 + ". " + items.get(index).getItemFullInfo()).collect(Collectors.joining("\n"));

    }
}
