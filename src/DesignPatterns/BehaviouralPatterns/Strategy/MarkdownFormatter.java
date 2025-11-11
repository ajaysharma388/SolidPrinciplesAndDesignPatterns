package DesignPatterns.BehaviouralPatterns.Strategy;

public class MarkdownFormatter implements TextFormatter {

    @Override
    public String format(String text) {
        // TODO: Wrap the input text in Markdown syntax: "**" and "**".
        return String.format("**%s**",text);
    }
}