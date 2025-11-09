package OpenClosePrinciple.BadExample;

public abstract class Card {
    private final String cardHolderName;
    private final String cardNumber;
    private double processingFees;

    Card(String cardHolderName, String cardNumber,  double processingFees) {
        this.cardHolderName = cardHolderName;
        this.cardNumber = cardNumber;
        this.processingFees = processingFees;
    }

    public String getCardHolderName() {
        return this.cardHolderName;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public double getProcessingFees() {
        return this.processingFees;
    }

    public void updateProcessingFees(double processingFees) {
        this.processingFees = processingFees;
    }

    public abstract void pay(double amt);
}
