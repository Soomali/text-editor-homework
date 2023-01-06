package com.example.demo.command;

import com.example.demo.editor.EditorCareTaker;

public abstract class EditorCommand {
     public EditorCareTaker editorCareTaker = EditorCareTaker.getInstance();
     public EditorCommand(){
     }

    abstract public void execute();
}
