package SolidPrinciples.LiskovsSustitutionPrinciple.GoodExample;

import SolidPrinciples.LiskovsSustitutionPrinciple.BadExample.File;
import SolidPrinciples.LiskovsSustitutionPrinciple.Document;

public class ReadOnlyFile extends File {
    public void read(Document doc) {
        System.out.println("Reading from the readonly Document " + doc.title() + ".");
    }
}
