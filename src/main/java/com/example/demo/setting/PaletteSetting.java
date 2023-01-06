package com.example.demo.setting;

import com.example.demo.editor.EditorCareTaker;
import javafx.scene.paint.Color;

public class PaletteSetting implements Cloneable {
    public PaletteSetting(Color backgroundColor){
        this.backgroundColor = backgroundColor ;

    }
    public Color backgroundColor;


    @Override
    public PaletteSetting clone() {
        try {
            return (PaletteSetting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

}
