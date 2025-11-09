package SolidPrinciples.OpenClosePrinciple.GoodExample;

public class DebitCard extends Card implements ProcessPayment {

    DebitCard(String cardHolderName, String cardNumber) {
        super(cardHolderName, cardNumber, 0);
    }

    @Override
    public void pay(double amt) {
        System.out.println("Paying " + amt + " via DebitCard with card number " + this.getCardNumber());
    }
}