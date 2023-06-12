package io.codelex.oop.summary.Exercise1;

import java.util.function.Supplier;

public class LazyBox<T> {
    private T value = null;
    private Supplier<T> supplier;

    public LazyBox(Supplier<T> supplier) {
        this.supplier = supplier;
    }

    public T getValue() {
        if (value == null) {
            value = this.supplier.get();
            System.out.println("Calculated first time");
        }
        return value;
    }

    @Override
    public String toString() {
        return "ValueHolder{" +
                "value=" + value +
                ", supplier=" + supplier +
                '}';
    }
}
