package com.example.demo.editor;

import com.example.demo.setting.theme.LightTheme;
import com.example.demo.setting.theme.Theme;

public class EditorState implements  Cloneable {

    private String text;
    private String filePath;
    private Theme theme;
    public Theme getTheme(){
        return this.theme;
    }
    public void setTheme(Theme theme){
        this.theme = theme;
    }






    public EditorState(String text,String filePath,Theme theme) {
        this.theme = theme;
    }
    public EditorState(){
        this("",null,new LightTheme());
    }

    @Override
    public EditorState clone() {

        try {
            EditorState clone = (EditorState) super.clone();
            clone.setTheme(this.theme.clone());
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public String getText() {
        if(text == null){
            return "";
        }
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
