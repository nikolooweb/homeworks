package io.codelex.oop.summary.Exercise1;

public class TestLazyBox {
    public static void main(String[] args) {
        LazyBox<Integer> person1 = new LazyBox<>(TestLazyBox::calculate);

        Integer number = person1.getValue();

        Integer number2 = person1.getValue();

    }

    public static Integer calculate() {
        return 200;
    }
}
