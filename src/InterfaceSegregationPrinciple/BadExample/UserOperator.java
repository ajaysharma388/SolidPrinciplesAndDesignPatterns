package InterfaceSegregationPrinciple.BadExample;

import InterfaceSegregationPrinciple.Document;

public class UserOperator {
    public static void main(String[] args) {
        Document doc = new Document("Solid Design Principles", "Martin Ali", "This is the solid principle document.");
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

Now, notice we have two class namely PrinterService & MultiPurposePrinter that are overloaded with the methods that they cannot really use.
this can be fixed by using a solis principle Interface Segregation Principle. which suggest that no class should have the functions that they
are not allowed to execute. to fix this we will simply divide the Machine interface into more meaningful interfaces which will help us not
to violate that rule. Follow the same example in the below package named as the Good Example.

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
