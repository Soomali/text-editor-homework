package com.example.demo.setting;

import javafx.scene.paint.Color;

public class PalletteSetting implements Setting {
    PalletteSetting(Color backgraundColor){
        backgraundColor=this.backgroundColor;

    }
    public Color backgroundColor;

    @Override
    public void Save() {

    }

    @Override
    public void Apply() {

    }
}
