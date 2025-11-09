package SolidPrinciples.InterfaceSegregationPrinciple.BadExample;

import SolidPrinciples.InterfaceSegregationPrinciple.Document;

public interface Machine {
    void print(Document doc);
    void copy(Document doc);
    void scan(Document doc);
    void edit(Document doc);
    void create(Document doc);
    void save(Document doc);
}
