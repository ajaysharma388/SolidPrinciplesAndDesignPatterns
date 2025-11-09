package SolidPrinciples.LiskovsSustitutionPrinciple.BadExample;


import SolidPrinciples.LiskovsSustitutionPrinciple.Document;

public class File {
    public void write(Document doc) {
        System.out.println("Writing the Document " + doc.title() + ".");
    }

    public void read(Document doc) {
        System.out.println("Reading the Document " + doc.title() + ".");
    }
}
