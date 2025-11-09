package SolidPrinciples.InterfaceSegregationPrinciple.GoodExample;

import SolidPrinciples.InterfaceSegregationPrinciple.Document;

public class UserOperator {
    public static void main(String[] args) {
        Document doc = new Document("Design Data Intensive Applications", "Martin Klepmaan", "This is the good system design book for new comers principle document.");
        PrinterService printerService = new PrinterService();
        printerService.print(doc); // this should easily print the document.
        MultiPurposePrinter multiPurposePrinter = new MultiPurposePrinter();
        multiPurposePrinter.print(doc);
        multiPurposePrinter.scan(doc);
        Computer computer = new Computer();
        computer.print(doc);
        computer.scan(doc);
        computer.create(doc);
        computer.copy(doc);
        computer.edit(doc);
        computer.save(doc);
    }
}

/*

Now, notice we have refactored our code so that no class have the access to the methods that are not required
inside it. This is the correct practice we should follow while implementing the real world app.

Sample Output:

Printer Service printing the document Content
This is the solid principle document.
MultiPurposePrinter Service printing the document Content
This is the solid principle document.
MultiPurposePrinter Service Scanning the document Content
Computer sending the request to print the Document : Solid Design Principles
Computer scanning the Document Solid Design Principles using advance tools.
New Document with tittle Solid Design Principles is created.
Computer creating the copy of the Document : Solid Design Principles
Computer Editing the Document Solid Design Principles using advance tools.
Computer saving the recent changes to Document Solid Design Principles.
 */