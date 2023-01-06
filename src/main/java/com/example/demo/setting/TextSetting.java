package com.example.demo.setting;

import com.example.demo.editor.EditorCareTaker;
import javafx.scene.paint.Color;

public class TextSetting implements Cloneable {
    public TextSetting (int fontSize, Color fontColor){
        this.fontSize = fontSize;
        this.fontColor = fontColor;
    }
    public int fontSize;
    public Color fontColor;


    @Override
    public TextSetting clone() {
        try {
            return (TextSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
