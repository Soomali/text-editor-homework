package com.example.demo.setting;

import com.example.demo.editor.EditorCareTaker;
import javafx.scene.paint.Color;

public class PalletteSetting implements Setting {
    public PalletteSetting(Color backgraundColor){
        backgraundColor=this.backgroundColor;

    }
    public Color backgroundColor;

    @Override
    public void Save() {

    }

    @Override
    public void Apply(EditorCareTaker taker) {
    }
}
