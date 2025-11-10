package DesignPatterns.BehaviouralPatterns.StrategyPattern;

public class HTMLFormatter implements TextFormatter {

    @Override
    public String format(String text) {
        // TODO: Wrap the input text in HTML tags: "<html><body>" and "</body></html>".
        return String.format("<html><body>%s</body></html>", text);
    }
}