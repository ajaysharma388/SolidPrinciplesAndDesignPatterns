package SolidPrinciples.SingleResponsiblityPrinciple.GoodExample;



public class Printer implements PrintingService {
    @Override
    public void printBillSummary(StringBuilder summary) {
        System.out.println(summary);
    }
}
