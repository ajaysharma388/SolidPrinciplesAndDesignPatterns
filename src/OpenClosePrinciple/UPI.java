package OpenClosePrinciple;

import OpenClosePrinciple.GoodExample.ProcessPayment;

public record UPI(String upi_id, String upi_name) implements ProcessPayment {
    @Override
    public void pay(double amt) {
        System.out.println("Paying " + amt + " via UPI " + this.upi_name() + " with UPI_ID " + this.upi_id() + ".");
    }
}
