package SolidPrinciples.SingleResponsiblityPrinciple.GoodExample;

import java.util.ArrayList;
import java.util.Scanner;

public class UserOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<Product> products = new ArrayList<>();
        ArrayList<Integer> quantities = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.print("Add the product name: ");
            String name = input.next();
            System.out.print("Add the Product Price: ");
            double price = input.nextDouble();
            System.out.print("Add the Product Quantity: ");
            int quantity = input.nextInt();
            products.add(new Product(name, price));
            quantities.add(quantity);
        }
        Invoice invoice = new Invoice(products, quantities);
        Printer printer = new Printer();
        printer.printBillSummary(invoice.getBillSummary());
    }
}
//5
//pepsi
//48 2
//pav
//60 3
//Pizza
//325 3
//CheeseBalls
//120 2
//Momo's
//180 3