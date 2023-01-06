package com.example.demo.editor;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

import java.util.ArrayList;

public class Editor implements Originator<EditorState>, Observable {
    private EditorState editorState;
    public EditorState getEditorState() {return editorState;}
    private ArrayList<InvalidationListener> listeners = new ArrayList<>();
    public Editor(){
        this.editorState = new EditorState();
    }
    @Override

    public void restore(EditorState state){
        this.editorState = state;
        notifyListeners();
    }
    private void notifyListeners() {
        for (InvalidationListener listener : this.listeners) {
            listener.invalidated(this);
        }
    }
    @Override

    public EditorState save() {
        return this.editorState;
    }


    @Override
    public void addListener(InvalidationListener invalidationListener) {
    listeners.add(invalidationListener);
    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {
    listeners.remove(invalidationListener);
    }
}
