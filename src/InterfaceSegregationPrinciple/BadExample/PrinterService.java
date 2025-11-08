package InterfaceSegregationPrinciple.BadExample;

import InterfaceSegregationPrinciple.Document;

public class PrinterService implements Machine {
    @Override
    public void print(Document doc) {
        System.out.println("Printer Service printing the document Content\n" + doc.content());
    }

    @Override
    public void copy(Document doc) {
        throw new IllegalCallerException("Simple Printer Cannot Copy Document");
    }

    @Override
    public void scan(Document doc) {
        throw new IllegalCallerException("Simple Printer Cannot Scan Document");
    }

    @Override
    public void edit(Document doc) {
        throw new IllegalCallerException("Simple Printer Cannot Edit Document");
    }

    @Override
    public void create(Document doc) {
        throw new IllegalCallerException("Simple Printer Cannot create Document");
    }

    @Override
    public void save(Document doc) {
        throw new IllegalCallerException("Simple Printer Cannot save Document");
    }
}
