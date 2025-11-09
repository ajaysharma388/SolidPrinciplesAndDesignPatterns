package LiskovsSustitutionPrinciple.GoodExample;

import LiskovsSustitutionPrinciple.Document;

public interface WritableFile {
    public void write(Document doc);
}
