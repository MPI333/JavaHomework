package ru.geekbrains.hw7d.patterns.proxy;

public class Proxy implements Payment {

    public Proxy() {
        accountVerification();
    }

    private void accountVerification() {
        System.out.println("Verification: success!");
    }

    @Override
    public void makePayment() {
        System.out.println("Making payment...");
    }

}
