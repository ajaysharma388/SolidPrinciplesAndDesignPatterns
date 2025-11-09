package LiskovsSustitutionPrinciple.GoodExample;

import LiskovsSustitutionPrinciple.BadExample.File;
import LiskovsSustitutionPrinciple.Document;

public class ReadOnlyFile extends File {
    public void read(Document doc) {
        System.out.println("Reading from the readonly Document " + doc.title() + ".");
    }
}
