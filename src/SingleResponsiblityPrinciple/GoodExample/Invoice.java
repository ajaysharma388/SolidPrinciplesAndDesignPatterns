package SingleResponsiblityPrinciple.GoodExample;

import java.util.ArrayList;
import java.util.HashMap;

public class Invoice {
    private double amt;
    private final HashMap<Product, Integer> productsList;
    public Invoice(ArrayList<Product> product, ArrayList<Integer> count) {
        if (product.size() != count.size()) {
            throw new IllegalArgumentException();
        }
        this.productsList = new HashMap<>();
        this.amt = 0;
        int size = product.size();
        for (int i = 0; i < size; i++) {
            this.productsList.put(product.get(i), count.get(i));
            amt += (product.get(i).getPrice() * count.get(i));
        }
    }

    public StringBuilder getBillSummary() {
        int number = 1;
        StringBuilder bill = new StringBuilder();
        System.out.println("******************* Generating the bill Summary *******************\n");
        for (Product product : productsList.keySet()) {
            double price = productsList.get(product);
            bill.append(number).append("     ").append(product.getName()).append(" ").append(price).append(" ").append(price * product.getPrice()).append("\n");
            number++;
        }
        System.out.println("******************* Bill Summary Generated *******************\n");
        return bill;
    }

    public double getAmt() {
        return amt;
    }

    void addProduct(Product product, int count) {
        this.productsList.put(product, count);
        this.amt += product.getPrice() * count;
    }

    void removeProduct(Product product) {
        int count = this.productsList.get(product);
        this.amt -= product.getPrice() * count;
        this.productsList.remove(product);
    }

    // this type of operation are not required in the invoice class
    // we can maybe modify the access to the getBillSummary method and
    // create the printing worker which will fetch the bill summary and
    // do the printing for us using this paradigm will help us divide the
    // code into more atomic level where each class is responsible for only one task.
    // in this case it should only work with the invoice nothing else.
    // clearly the below two methods violets this idea let's fix this in the next package.
    void updateProduct(Product product, String Name, double Price) {
        product.setName(Name);
        product.setPrice(Price);
    }
}
