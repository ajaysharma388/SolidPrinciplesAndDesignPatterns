package SolidPrinciples.OpenClosePrinciple.BadExample;

public class DebitCard extends Card {

    DebitCard(String cardHolderName, String cardNumber) {
        super(cardHolderName, cardNumber, 0);
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paying " + amt + " via DebitCard with card number " + this.getCardNumber());
    }
}
