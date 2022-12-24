package com.example.demo.command;

import com.example.demo.editor.EditorCareTaker;

public abstract class EditorCommand {
     public EditorCareTaker editorCareTaker = new  EditorCareTaker();


    abstract public void execute();
}
