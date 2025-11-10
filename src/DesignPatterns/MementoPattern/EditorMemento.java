package DesignPatterns.MementoPattern;

// The EditorMemento class stores the state of a shape, allowing for the preservation and restoration of its attributes in the Memento pattern.
public record EditorMemento(String shapeType, int x, int y, String color, int size) {

    // TODO: Initialize the shape's attributes with the provided parameters.
    public String getShapeType() {
        return shapeType;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getColor() {
        return color;
    }

    public int getSize() {
        return size;
    }
}
