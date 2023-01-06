package com.example.demo.command;

public class ChangeTextCommand extends EditorCommand{
    private String text;

    public ChangeTextCommand(String text) {
        this.text = text;
    }

    @Override
    public void execute() {
        this.editorCareTaker.changeText(text);

    }
}
