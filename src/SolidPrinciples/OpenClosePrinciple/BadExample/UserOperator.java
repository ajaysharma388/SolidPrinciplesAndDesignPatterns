package SolidPrinciples.OpenClosePrinciple.BadExample;

import SolidPrinciples.OpenClosePrinciple.UPI;
import SolidPrinciples.OpenClosePrinciple.Wallet;

public class UserOperator {
    public static void main(String[] args) {
        /*
        While using the different payment methods I have a difficulty in organising each payment methods.
        Since, Credit Card and Debit Card has the Card as common connection using which I can store them
        but with the wallet and the UPI I do not have any concrete common structure do to which whenever I have
        to any more payment method I have to keep modifying the code.

        Notice the structure of the payment service class in the package.
         */
        PaymentService paymentService = new PaymentService();
        paymentService.initializeCreditCardService(new CreditCard("Ajay Sharma", "45689231", 2.7));
        paymentService.initializeDebitCardService(new DebitCard("Ajay Sharma", "12345678"));
        paymentService.initializeUpiService(new UPI("AjaySharma_123", "GPay"));
        paymentService.initializeWalletService(new Wallet("AjaySharma_123", "PayTm"));

        paymentService.processPaymentViaWallet(500);
        paymentService.processPaymentViaUpi(500);
        paymentService.processPaymentViaCreditCard(500);
        paymentService.processPaymentViaDebitCard(500);
    }
}

/*

Notice the code does works as expected but this code is not maintainable and extensible in nature as per the
open close principle form the Solid principles.

If we wanted to add another payment type we have to make a lot of changes in the code due to it's incorrect hierarchy
and in the bigger systems we try to follow all the principles which helps us to minimise the code changes if we wanted
to add more functionality to our system.

Let's observe the below package for the better organisation.

Paying 500.0 via Wallet PayTm with ID AjaySharma_123.
Paying 500.0 via UPI with UPI_ID AjaySharma_123.
Paying 513.5 via CreditCard with card number 45689231
Paying 500.0 via DebitCard with card number 12345678
 */