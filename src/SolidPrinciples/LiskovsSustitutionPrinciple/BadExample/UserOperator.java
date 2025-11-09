package SolidPrinciples.LiskovsSustitutionPrinciple.BadExample;

import SolidPrinciples.LiskovsSustitutionPrinciple.Document;

public class UserOperator {
    public static void main(String[] args) {
        Document doc = new Document("Competitive Programming 3", "Felix Halim", "This is file that contains the competitive programming 3.");
        ReadOnlyFile readOnlyFile = new ReadOnlyFile();
        readOnlyFile.read(doc);
        /* Notice this will raise the exception and due to the incorrect hierarchy of the class we have this function in the
           read only file which is not the correct practice. So, ideally we should not follow this type of practice.
           to save us from this kind of problems we have another solid principle which comes into the rescue
           i.e.,
           Liskov Substitution Principle: Objects of a superclass should be replaceable with objects of its subclasses
                                            without affecting the correctness of the program.
         */
        readOnlyFile.write(doc);
        /*
        Notice that the below function does not have any problems as such.
         */
        WriteFile writeFile = new WriteFile();
        writeFile.write(doc);
        writeFile.read(doc);
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
