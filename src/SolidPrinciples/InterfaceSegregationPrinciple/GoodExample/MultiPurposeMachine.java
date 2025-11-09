package SolidPrinciples.InterfaceSegregationPrinciple.GoodExample;

import SolidPrinciples.InterfaceSegregationPrinciple.Document;

public interface MultiPurposeMachine extends PrintingMachine {
    void scan(Document doc);
}
