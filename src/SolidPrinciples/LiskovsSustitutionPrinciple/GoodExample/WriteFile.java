package SolidPrinciples.LiskovsSustitutionPrinciple.GoodExample;

import SolidPrinciples.LiskovsSustitutionPrinciple.Document;

public class WriteFile extends File implements WritableFile {
    public void write(Document doc) {
        System.out.println("Writing to the Document " + doc.title() + ".");
    }

    public void read(Document doc) {
        System.out.println("Reading from the Document " + doc.title() + " which has the read/write permissions.");
    }
}
