package SolidPrinciples.LiskovsSustitutionPrinciple.GoodExample;

import SolidPrinciples.LiskovsSustitutionPrinciple.Document;

public interface WritableFile {
    public void write(Document doc);
}
