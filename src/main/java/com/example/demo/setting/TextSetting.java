package com.example.demo.setting;

import com.example.demo.editor.EditorCareTaker;
import javafx.scene.paint.Color;

public class TextSetting implements Setting {
    public TextSetting (int fontSize, Color fontColor){
        fontSize=this.fontSize;
        fontColor=this.fontColor;
    }
    public int fontSize;
    public Color fontColor;

    @Override
    public void Save() {

    }

    @Override
    public void Apply(EditorCareTaker taker) {

    }
}
