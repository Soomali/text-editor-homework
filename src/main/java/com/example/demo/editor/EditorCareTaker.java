package com.example.demo.editor;

public class EditorCareTaker {

    private Editor editor;
    public Editor getEditor() {
        return this.editor;
    }
    public void  setEditor(Editor editor){
        this.editor = editor;
    }

    private static EditorCareTaker instance = null;
    private EditorCareTaker() {
        this.editor = new Editor();
    }
    public void undo(){

    }

    public void save(){

    }
    public static EditorCareTaker getInstance() {
        if(instance == null){
            instance = new EditorCareTaker();
        }
        return instance;
    }



}
