package com.example.demo.editor;

public class EditorCareTaker {

    //Editor editor
    private static EditorCareTaker instance = null;
    public EditorCareTaker() {

    }
    public void undo(){

    }
    public static EditorCareTaker getInstance() {
        if(instance == null){
            instance = new EditorCareTaker();
        }
        return instance;
    }



}
