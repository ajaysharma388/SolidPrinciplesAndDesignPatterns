package SolidPrinciples.LiskovsSustitutionPrinciple.GoodExample;


import SolidPrinciples.LiskovsSustitutionPrinciple.Document;

public class File {
    public void read(Document doc) {
        System.out.println("Reading the Document " + doc.title() + ".");
    }
}
