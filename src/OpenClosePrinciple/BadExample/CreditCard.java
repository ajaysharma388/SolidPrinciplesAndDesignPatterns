package OpenClosePrinciple.BadExample;

public class CreditCard extends Card {

    CreditCard(String cardHolderName, String cardNumber, double processingFees) {
        super(cardHolderName, cardNumber, processingFees);
    }

    @Override
    public void pay(double amt) {
        double finalAmount = amt + (this.getProcessingFees() * amt) / 100;
        System.out.println("Paying " + finalAmount + " via CreditCard with card number " + this.getCardNumber());
    }
}
