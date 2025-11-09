package SolidPrinciples.LiskovsSustitutionPrinciple.BadExample;

import SolidPrinciples.LiskovsSustitutionPrinciple.Document;

public class ReadOnlyFile extends File {
    public void write(Document doc) {
        throw new IllegalCallerException("Unable to write to read-only Document");
    }

    public void read(Document doc) {
        System.out.println("Reading from the readonly Document " + doc.title() + ".");
    }
}
