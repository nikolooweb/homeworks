package io.codelex.classesandobjects.practice;

public class ProductApp {
    public static void main(String[] args) {

        Product product1 = new Product("Banana", 1.1, 13);
        Product product2 = new Product("Logitech mouse", 70.00, 14);
        Product product3 = new Product("IPhone 5s", 999.99, 3);
        Product product4 = new Product("Epson EB-U05", 440.46, 1);

        product1.printProduct();
        product1.setPriceAtStart(2.49);
        product1.setAmountAtStart(121);
        product1.printProduct();

        product2.printProduct();
        product3.printProduct();
        product4.printProduct();
    }
}
