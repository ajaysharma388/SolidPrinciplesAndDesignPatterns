package SolidPrinciples.InterfaceSegregationPrinciple.GoodExample;

import SolidPrinciples.InterfaceSegregationPrinciple.Document;

public class Computer implements PrintingMachine, MultiPurposeMachine, ComputingMachine {
    public void print(Document doc) {
        System.out.println("Computer sending the request to print the Document : " + doc.title());
    }

    @Override
    public void copy(Document doc) {
        System.out.println("Computer creating the copy of the Document : " + doc.title());
    }

    @Override
    public void scan(Document doc) {
        System.out.println("Computer scanning the Document " + doc.title() + " using advance tools.");
    }

    @Override
    public void edit(Document doc) {
        System.out.println("Computer Editing the Document " + doc.title() + " using advance tools.");
    }

    @Override
    public void create(Document doc) {
        System.out.println("New Document with tittle " + doc.title() + " is created.");
    }

    @Override
    public void save(Document doc) {
        System.out.println("Computer saving the recent changes to Document " + doc.title() + ".");
    }
}
