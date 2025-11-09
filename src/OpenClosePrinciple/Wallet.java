package OpenClosePrinciple;

import OpenClosePrinciple.GoodExample.ProcessPayment;

public record Wallet(String wallet_id, String name) implements ProcessPayment {

    public String get_wallet_id() {
        return this.wallet_id;
    }

    public String get_name() {
        return this.name;
    }

    public void pay(double amount) {
        System.out.println("Paying " + amount + " via Wallet " + this.get_name() + " with ID " + this.get_wallet_id() + ".");
    }
}