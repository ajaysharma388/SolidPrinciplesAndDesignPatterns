package SolidPrinciples.LiskovsSustitutionPrinciple.BadExample;

import SolidPrinciples.LiskovsSustitutionPrinciple.Document;

public class WriteFile extends File {
    public void write(Document doc) {
        System.out.println("Writing to the Document " + doc.title() + ".");
    }

    public void read(Document doc) {
        System.out.println("Reading from the readonly Document " + doc.title() + ".");
    }
}
