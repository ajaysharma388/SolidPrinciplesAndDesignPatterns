package InterfaceSegregationPrinciple.GoodExample;

import InterfaceSegregationPrinciple.Document;

public interface MultiPurposeMachine extends PrintingMachine {
    void scan(Document doc);
}
