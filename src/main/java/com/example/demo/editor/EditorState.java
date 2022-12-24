package com.example.demo.editor;

import javafx.util.Pair;

public class EditorState implements  Cloneable {
    private String text;
    private String selection;
    //Theme theme
    private Pair<Double,Double> cursorPos;

    public EditorState(String text,String selection,Pair<Double,Double> cursorPos) {
        this.text = text;
        this.selection = selection;
        this.cursorPos = cursorPos;
    }


    @Override
    public EditorState clone() {
        try {
            EditorState clone = (EditorState) super.clone();
            // TODO: copy mutable state here, so the clone can't change the internals of the original
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
