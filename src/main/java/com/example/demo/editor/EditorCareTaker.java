package com.example.demo.editor;

public class EditorCareTaker {

    //Editor editor
    private static EditorCareTaker instance = null;
    private EditorCareTaker() {

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
