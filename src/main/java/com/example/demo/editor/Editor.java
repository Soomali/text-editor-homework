package com.example.demo.editor;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;

public class Editor implements Memento<EditorState>, Observable {
    private  EditorState editorState;

    public void restore(EditorState state){}
    public EditorState save() {
        return getState();
    }
    @Override
    public EditorState getState() {
        return null;
    }

    @Override
    public void setState(EditorState state) {

    }

    @Override
    public void addListener(InvalidationListener invalidationListener) {

    }

    @Override
    public void removeListener(InvalidationListener invalidationListener) {

    }
}
