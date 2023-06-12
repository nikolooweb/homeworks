package io.codelex.oop.summary.Exercise2;

import io.codelex.oop.summary.Exercise2.exceptions.WrongOrderException;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Invoice {

    private Order order;
    private String invoiceNumber;
    private InvoiceStatus status;

    public Invoice(String invoiceNumber, Order order) throws WrongOrderException {
        this.invoiceNumber = invoiceNumber;
        this.order = order;
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("Your order is empty!!!");
        }
        status = InvoiceStatus.APPROVED;
    }

    private BigDecimal getPriceWithoutVat() {
        return order.getItems().stream().map(SellableThing::getItemPrice).reduce(BigDecimal.ZERO, BigDecimal::add);
    }

    private BigDecimal getVAT() {
        return getPriceWithoutVat().multiply(new BigDecimal("0.21")).setScale(2, RoundingMode.HALF_UP);
    }

    private BigDecimal getTotal() {
        return getVAT().add(getPriceWithoutVat());
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    public String printInvoice() {

        StringBuilder invoiceText = new StringBuilder();

        invoiceText.append("=".repeat(60)).append("\n");
        invoiceText.append(String.format("= INVOICE NUMBER: %-40s =\n", invoiceNumber));
        invoiceText.append(String.format("= STATUS: %-48s =\n", status));
        for (int i = 0; i < order.getItems().size(); i++) {
            invoiceText.append(String.format("= %-2d. %-52s =\n", i + 1, order.getItems().get(i).getItemFullInfo()));
        }
        invoiceText.append(String.format("= SUM: %-51s =\n", getPriceWithoutVat() + " EUR"));
        invoiceText.append(String.format("= VAT (21%%): %-45s =\n", getVAT() + " EUR"));
        invoiceText.append(String.format("= TOTAL: %-49s =\n", getTotal() + " EUR"));
        invoiceText.append("=".repeat(60)).append("\n");

        return invoiceText.toString();
    }

}
