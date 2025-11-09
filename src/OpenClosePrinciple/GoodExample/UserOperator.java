package OpenClosePrinciple.GoodExample;

import OpenClosePrinciple.UPI;
import OpenClosePrinciple.Wallet;

public class UserOperator {
    public static void main(String[] args) {
        /*
        This is the correct practice after making the hierarchal changes in the project and this is Open Close
        Principle complaint.
         */
        PaymentService paymentService = new PaymentService();
        paymentService.addPaymentMethod("Credit Card", new CreditCard("Ajay Sharma", "45689231", 2.7));
        paymentService.addPaymentMethod("Debit Card", new DebitCard("Ajay Sharma", "12345678"));
        paymentService.addPaymentMethod("UPI", new UPI("AjaySharma_123", "GPay"));
        paymentService.addPaymentMethod("Wallet", new Wallet("AjaySharma_123", "PayTm"));

        paymentService.processPayment("Debit Card", 225);
        paymentService.processPayment("Credit Card", 225);
        paymentService.processPayment("UPI", 225);
        paymentService.processPayment("Wallet", 225);
    }
}

/*

Notice, the code works as expected also this code is maintainable and extensible in nature as per the
open close principle form the Solid principles.

Now, If we wanted to add another payment type we do not need to make a lot of changes in the code as we can simply add the
information about the new payment method into the payment service then we can simply follow the paradigm followed above.
and in the bigger systems we try to follow this approach only which helps us to minimise the code changes if we wanted
to add more functionality to our system.

Paying 225.0 via DebitCard with card number 12345678
Paying 231.075 via CreditCard with card number 45689231
Paying 225.0 via UPI GPay with UPI_ID AjaySharma_123.
Paying 225.0 via Wallet PayTm with ID AjaySharma_123.
 */