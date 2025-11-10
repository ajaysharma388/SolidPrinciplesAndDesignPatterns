package DesignPatterns.BehaviouralPatterns.MementoPattern;

import java.util.ArrayList;

public class Caretaker {

    private int curIndex;
    private final ArrayList<EditorMemento> history = new ArrayList<>();

    Caretaker() {
        this.curIndex = -1;
    }

    public void saveState(GraphicEditor graphicEditor) {
        // TODO: Save the current state of the graphic editor by pushing its memento onto the history stack.
        this.curIndex += 1;
        this.history.add(graphicEditor.save());
    }

    public void undo(GraphicEditor graphicEditor){
        // if the present index is 0 or lesser than 0. then we can say we cannot undo further.
        if (this.curIndex <= 0) {
            return;
        }

        this.curIndex -= 1;
        EditorMemento gEditor = this.history.get(this.curIndex);
        graphicEditor.setShape(gEditor.getShapeType(), gEditor.getX(), gEditor.getY(), gEditor.getColor(), gEditor.getSize());
    }

    public void redo(GraphicEditor graphicEditor) {
        if (this.curIndex < this.history.size() - 1) {
            return;
        }
        this.curIndex += 1;
        EditorMemento gEditor = this.history.get(this.curIndex);
        graphicEditor.setShape(gEditor.getShapeType(), gEditor.getX(), gEditor.getY(), gEditor.getColor(), gEditor.getSize());
    }
}
