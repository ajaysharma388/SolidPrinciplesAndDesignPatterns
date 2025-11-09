package SolidPrinciples.InterfaceSegregationPrinciple.GoodExample;

import SolidPrinciples.InterfaceSegregationPrinciple.Document;

public class PrinterService implements PrintingMachine {
    @Override
    public void print(Document doc) {
        System.out.println("Printer Service printing the document Content\n" + doc.content());
    }
}
