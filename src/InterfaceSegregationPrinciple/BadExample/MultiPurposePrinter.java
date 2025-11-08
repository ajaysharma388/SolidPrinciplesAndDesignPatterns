package InterfaceSegregationPrinciple.BadExample;

import InterfaceSegregationPrinciple.Document;

public class MultiPurposePrinter implements Machine {

    public void print(Document doc) {
        System.out.println("MultiPurposePrinter Service printing the document Content\n" + doc.content());
    }

    @Override
    public void copy(Document doc) {
        throw new IllegalCallerException("MultiPurposePrinter Printer Cannot Copy Document");
    }

    @Override
    public void scan(Document doc) {
        System.out.println("MultiPurposePrinter Service Scanning the document Content");
    }

    @Override
    public void edit(Document doc) {
        throw new IllegalCallerException("MultiPurposePrinter Printer Cannot Edit Document");
    }

    @Override
    public void create(Document doc) {
        throw new IllegalCallerException("MultiPurposePrinter Cannot create Document");
    }

    @Override
    public void save(Document doc) {
        throw new IllegalCallerException("MultiPurposePrinter cannot save Document");
    }
}
