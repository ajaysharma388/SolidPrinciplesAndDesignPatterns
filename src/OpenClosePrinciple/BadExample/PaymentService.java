package OpenClosePrinciple.BadExample;

import OpenClosePrinciple.UPI;
import OpenClosePrinciple.Wallet;


public class PaymentService {
    private CreditCard creditCardService;
    private DebitCard debitCardService;
    private UPI upiService;
    private Wallet walletService;

    PaymentService() { }

    public void initializeCreditCardService(CreditCard creditCardService) {
        this.creditCardService = creditCardService;
    }

    public void initializeDebitCardService(DebitCard debitCardService) {
        this.debitCardService = debitCardService;
    }

    public void initializeUpiService(UPI upiService) {
        this.upiService = upiService;
    }

    public void initializeWalletService(Wallet walletService) {
        this.walletService = walletService;
    }

    public void processPaymentViaDebitCard(double amount) {
        this.debitCardService.pay(amount);
    }

    public void processPaymentViaCreditCard(double amount) {
        this.creditCardService.pay(amount);
    }

    public void processPaymentViaUpi(double amount) {
        this.upiService.pay(amount);
    }

    public void processPaymentViaWallet(double amount) {
        this.walletService.pay(amount);
    }
}
