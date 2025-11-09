package OpenClosePrinciple.GoodExample;

import java.util.HashMap;

public class PaymentService {
    private final HashMap<String, ProcessPayment> paymentMethods;

    PaymentService() {
        this.paymentMethods = new HashMap<>();
    }

    public void addPaymentMethod(String name, ProcessPayment paymentMethod) {
        this.paymentMethods.put(name, paymentMethod);
    }

    void processPayment(String name, double amt) {
        if (paymentMethods.containsKey(name)) {
            ProcessPayment pm = this.paymentMethods.get(name);
            pm.pay(amt);
        }
        else  {
            System.out.println("Payment method " + name + " not found");
        }
    }
}
