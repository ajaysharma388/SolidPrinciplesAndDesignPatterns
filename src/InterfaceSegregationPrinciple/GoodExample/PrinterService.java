package InterfaceSegregationPrinciple.GoodExample;

import InterfaceSegregationPrinciple.Document;

public class PrinterService implements PrintingMachine {
    @Override
    public void print(Document doc) {
        System.out.println("Printer Service printing the document Content\n" + doc.content());
    }
}
