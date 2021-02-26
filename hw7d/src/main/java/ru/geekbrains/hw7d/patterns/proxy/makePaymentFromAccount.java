package ru.geekbrains.hw7d.patterns.proxy;

public class makePaymentFromAccount implements Payment {

    private static Payment payment;

    @Override
    public void makePayment() {
        if (payment == null) {
            payment = new Proxy();
        }
        payment.makePayment();
    }

}
