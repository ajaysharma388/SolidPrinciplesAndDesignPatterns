package InterfaceSegregationPrinciple.GoodExample;

import InterfaceSegregationPrinciple.Document;

public interface ComputingMachine {
    void copy(Document doc);
    void edit(Document doc);
    void create(Document doc);
    void save(Document doc);
}
