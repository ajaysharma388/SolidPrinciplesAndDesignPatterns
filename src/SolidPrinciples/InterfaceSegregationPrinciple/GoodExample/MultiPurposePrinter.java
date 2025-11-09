package SolidPrinciples.InterfaceSegregationPrinciple.GoodExample;

import SolidPrinciples.InterfaceSegregationPrinciple.Document;

public class MultiPurposePrinter implements MultiPurposeMachine {
    @Override
    public void scan(Document doc) {
        System.out.println("MultiPurposePrinter Service Scanning the document Content");
    }

    @Override
    public void print(Document doc) {
        System.out.println("MultiPurposePrinter Service printing the document Content\n" + doc.content());
    }
}
