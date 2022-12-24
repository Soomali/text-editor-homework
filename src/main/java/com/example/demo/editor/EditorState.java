package com.example.demo.editor;

import javafx.util.Pair;

public class EditorState implements  Cloneable {
    private String text;
    private String selection;
    //Theme theme
    public String getText(){return this.text;}
    public  void  setText(String text){
        this.text=text;
    }
    public String getSelection(){return this.selection;}
    public void setSelection(String selection){
        this.selection = selection;
    }







    public EditorState(String text,String selection) {
        this.text = text;
        this.selection = selection;
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
